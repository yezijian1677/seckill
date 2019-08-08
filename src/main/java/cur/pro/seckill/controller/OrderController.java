package cur.pro.seckill.controller;

import cur.pro.seckill.domain.MiaoshaUser;
import cur.pro.seckill.domain.OrderInfo;
import cur.pro.seckill.redis.RedisService;
import cur.pro.seckill.result.CodeMsg;
import cur.pro.seckill.result.Result;
import cur.pro.seckill.service.GoodsService;
import cur.pro.seckill.service.MiaoshaUserService;
import cur.pro.seckill.service.OrderService;
import cur.pro.seckill.vo.GoodsVo;
import cur.pro.seckill.vo.OrderDetailVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    MiaoshaUserService userService;

    @Autowired
    RedisService redisService;

    @Autowired
    OrderService orderService;

    @Autowired
    GoodsService goodsService;

    @RequestMapping("/detail")
    public Result<OrderDetailVo> info(MiaoshaUser user, @RequestParam("orderId") long orderId) {
        if (user == null) {
            return Result.error(CodeMsg.SESSION_ERROR);
        }
        OrderInfo order = orderService.getOrderById(orderId);
        if (order == null) {
            return Result.error(CodeMsg.ORDER_NOT_EXIST);
        }
        long goodsId = order.getGoodsId();
        GoodsVo goods = goodsService.getGoodsVoByGoodsId(goodsId);
        OrderDetailVo vo = new OrderDetailVo();
        vo.setOrder(order);
        vo.setGoods(goods);
        return Result.success(vo);
    }

}
