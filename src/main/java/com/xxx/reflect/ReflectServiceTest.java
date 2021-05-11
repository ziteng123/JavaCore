package com.xxx.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectServiceTest {
    public static void main(String[] args) {
        try {
            ReflectService re = (ReflectService) reflect();
            re.sayHello();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public static Object reflect() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        ReflectService object = null;
        object = (ReflectService) Class.forName("com.xxx.reflect.ReflectService").getDeclaredConstructor(String.class).newInstance("张三");
        // 反射无参的方法
        Method method = ReflectService.class.getMethod("sayHello",null);
        method.invoke(object);
        return object;
    }
}
