package lg.cn.dao;


import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

public interface StorageMapper {
    public Integer storageUpdate(@Param("pid") Integer pid, @Param("count") Integer count);
}
