package cur.pro.seckill.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author augenye
 * @date 2019-08-04 20:18
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MiaoshaOrder {
    private Long id;
    private Long userId;
    private Long orderId;
    private Long goodsId;
}

