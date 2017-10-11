import redis.clients.jedis.Jedis;

import java.util.Iterator;
import java.util.Set;

public class RedisKeysDemo {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost");
        System.out.println("连接成功");
        Set<String> set = jedis.keys("*");
        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println("每个key：" + iterator.next());
        }
    }
}
