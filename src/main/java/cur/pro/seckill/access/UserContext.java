package cur.pro.seckill.access;


import cur.pro.seckill.domain.MiaoshaUser;

public class UserContext {
    //一提到用户信息的获取，大多数都是想到使用session，而session需要相应的request获取，会增加代码的耦合性
    //所以将session，用户信息存入threadlocal中
    //保证用户线程安全
    private static ThreadLocal<MiaoshaUser> userHolder = new ThreadLocal<>();

    public static void setUser(MiaoshaUser user) {
        userHolder.set(user);
    }

    public static MiaoshaUser getUser() {
        return userHolder.get();
    }

    private UserContext(){

    }

}
