package lg.cn.dao;


import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

public interface AccountMapper {
    public Integer accountUpdate(@Param("uid") Integer uid, @Param("account") BigDecimal account);
}
