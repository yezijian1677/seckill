package cur.pro.seckill.redis;

public interface KeyPrefix {

    int expireSeconds();

    String getPrefix();

}
