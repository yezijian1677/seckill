package cur.pro.seckill.controller;

import cur.pro.seckill.domain.MiaoshaUser;
import cur.pro.seckill.redis.RedisService;
import cur.pro.seckill.result.Result;
import cur.pro.seckill.service.MiaoshaUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    MiaoshaUserService userService;

    @Autowired
    RedisService redisService;

    @RequestMapping("/info")
    public Result<MiaoshaUser> info(MiaoshaUser user) {
        return Result.success(user);
    }

}
