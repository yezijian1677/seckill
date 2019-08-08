package cur.pro.seckill.rabbitmq;

import cur.pro.seckill.domain.MiaoshaUser;
import lombok.Data;

@Data
public class MiaoshaMessage {
    private MiaoshaUser user;
    private long goodsId;
}
