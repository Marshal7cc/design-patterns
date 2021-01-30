package org.epoch.proxy.mapper;

/**
 * @auth: Marshal
 * @date: 2019/6/5
 * @desc:
 */
public class Client {
    public static void main(String[] args) {

        MapperProxy mapperProxy = new MapperProxy();
        Mapper proxy = (Mapper) new MapperProxyFactory<Mapper>(Mapper.class).bind(mapperProxy);

        proxy.selectByUserName();
    }
}
