package lg.cn.service;

import lg.cn.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @auther zzyy
 * @create 2020-02-26 15:22
 */
@FeignClient(value = "seata-storage-service2002")
public interface StorageService {

    @PostMapping("storage/storageUpdate")
    public CommonResult storageUpdate(@RequestParam("pid") Integer pid, @RequestParam("count") Integer count);
}
