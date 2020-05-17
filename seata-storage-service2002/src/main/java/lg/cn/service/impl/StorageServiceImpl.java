package lg.cn.service.impl;

import lg.cn.dao.StorageMapper;
import lg.cn.service.StorageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;

@Service
public class StorageServiceImpl implements StorageService {

    @Resource
    StorageMapper storageMapper;

    public Integer storageUpdate(Integer pid, Integer count) {
        return storageMapper.storageUpdate(pid, count);
    }
}
