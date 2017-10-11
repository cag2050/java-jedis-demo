import redis.clients.jedis.Jedis;

public class ConnectRedisDemo {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost");
        System.out.println("连接成功");
        System.out.println("服务正在运行：" + jedis.ping());
    }
}
