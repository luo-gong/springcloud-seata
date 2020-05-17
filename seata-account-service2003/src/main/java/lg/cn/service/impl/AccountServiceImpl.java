package lg.cn.service.impl;

import lg.cn.dao.AccountMapper;
import lg.cn.service.AccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;

@Service
public class AccountServiceImpl implements AccountService {
    @Resource
    AccountMapper accountMapper;

    public Integer accountUpdate(Long uid, BigDecimal account) {
        return accountMapper.accountUpdate(uid.intValue(), account);
    }
}
