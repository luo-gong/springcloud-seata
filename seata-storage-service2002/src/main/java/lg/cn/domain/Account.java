package lg.cn.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    private Integer id;
    private Integer userId;
    private BigDecimal total;
    private BigDecimal used;
    private BigDecimal residue;
}
