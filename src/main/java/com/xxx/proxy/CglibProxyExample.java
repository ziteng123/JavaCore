package com.xxx.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxyExample implements MethodInterceptor {

    /**
     * 创建CGLIB代理对象
     * @param cls
     * @return
     */
    public Object getProxy(Class cls){
        // 增强类对象
        Enhancer en = new Enhancer();
        // 设置增强类型
        en.setSuperclass(cls);
        // 定义代理逻辑对象为当前对象，要求当前对象实现 Methodinterceptor 方法
        en.setCallback(this);
        // 返回代理对象
        return en.create();

    }
    @Override
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("调用真实对象前");
        Object obj = methodProxy.invokeSuper(proxy,args);
        System.out.println("调用真实对象后");
        return obj;
    }
}
