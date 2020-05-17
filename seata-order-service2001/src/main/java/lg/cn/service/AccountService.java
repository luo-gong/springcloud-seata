package lg.cn.service;

import lg.cn.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @auther zzyy
 * @create 2020-02-26 15:22
 */
@FeignClient(value = "seata-account-service2003")
public interface AccountService {

    @PostMapping(value = "/account/accountUpdate")
    CommonResult accountUpdate(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);
}
