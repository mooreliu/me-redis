package me.moore;

import me.moore.server.RedisServerSide;

/**
 *
 * @author liuyi
 * @date 2019/5/31
 */
public class Redis {



    public static void main(String[] args) throws Exception{
        new RedisServerSide(5210).run();
    }
}
