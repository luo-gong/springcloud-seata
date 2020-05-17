package lg.cn.config;

import com.mysql.jdbc.AbandonedConnectionCleanupThread;
import org.springframework.context.annotation.Configuration;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;

//@WebListener
public class MyContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        Enumeration<Driver> drivers = DriverManager.getDrivers();
        while (drivers.hasMoreElements()) {
            try {
                DriverManager.deregisterDriver(drivers.nextElement());
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        // 再关闭AbandonedConnectionCleanupThread线程
        try {
            AbandonedConnectionCleanupThread.shutdown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("手动注销驱动、关闭AbandonedConnectionCleanupThread线程");
    }
}
