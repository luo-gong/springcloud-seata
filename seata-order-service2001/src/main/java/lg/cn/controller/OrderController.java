package lg.cn.controller;

import lg.cn.domain.CommonResult;
import lg.cn.domain.Order;
import lg.cn.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;

    @GetMapping("order/create")
    public CommonResult create(Order order) {
        orderService.create(order);
        return new CommonResult(200, "下单成功");
    }


}
