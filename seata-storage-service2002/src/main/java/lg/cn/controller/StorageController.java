package lg.cn.controller;

import lg.cn.domain.CommonResult;
import lg.cn.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StorageController {
    @Autowired
    StorageService storageService;

    @PostMapping("storage/storageUpdate")
    public CommonResult storageUpdate(@RequestParam("pid") Integer pid, @RequestParam("count") Integer count) {
        CommonResult commonResult = null;
        if (storageService.storageUpdate(pid, count) > 0) {
            commonResult = new CommonResult(200, "修改库存成功");
        }
        return commonResult;
    }
}
