package cur.pro.seckill.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author augenye
 * @date 2019-08-04 20:18
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MiaoshaGoods {
    private Long id;
    private Long goodsId;
    private Integer stockCount;
    private Date startDate;
    private Date endDate;
}
