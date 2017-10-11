import redis.clients.jedis.Jedis;

public class RedisStringDemo {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost");
        System.out.println("连接成功");
        jedis.set("name","jeff");
        System.out.println("设置的 String 值为：" + jedis.get("name"));
    }
}
