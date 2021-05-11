package com.xxx.proxy;

import org.junit.Test;

public class ProxyTest {
    @Test
    public void jdkProxyTest(){
        JdkProxyExample jdk = new JdkProxyExample();
        HelloWorld hello = (HelloWorld) jdk.bind(new HelloWorldImpl());
        hello.sayHello();
    }
    @Test
    public void cglibProxyTest(){
        CglibProxyExample cpe = new CglibProxyExample();
        HelloWorldImpl hello = (HelloWorldImpl) cpe.getProxy(HelloWorldImpl.class);
        hello.sayHello();
    }
}
