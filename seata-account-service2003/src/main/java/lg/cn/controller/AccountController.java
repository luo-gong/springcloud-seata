package lg.cn.controller;

import lg.cn.domain.CommonResult;
import lg.cn.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class AccountController {
    @Autowired
    AccountService accountService;

    @PostMapping(value = "/account/accountUpdate")
    CommonResult accountUpdate(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money) {
        CommonResult commonResult = null;
        if (accountService.accountUpdate(userId, money) > 0) {
            commonResult = new CommonResult(200, "修改账户成功");
        }
        return commonResult;
    }
}
