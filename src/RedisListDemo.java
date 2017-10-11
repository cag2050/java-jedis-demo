import redis.clients.jedis.Jedis;

import java.util.List;

public class RedisListDemo {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost");
        System.out.println("连接成功");
        jedis.lpush("techs", "redis");
        jedis.lpush("techs", "memcache");
        jedis.lpush("techs", "nosql");
        List<String> list = jedis.lrange("techs", 0, 2);
        int len = list.size();
        for (int i = 0; i < len; i++) {
            System.out.println("列表项为：" + list.get(i));
        }
    }
}
