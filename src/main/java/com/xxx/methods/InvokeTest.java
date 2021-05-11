package com.xxx.methods;

import java.lang.reflect.*;

public class InvokeTest {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Method m1 = Employee.class.getMethod("getName");
        Method m2 = Employee.class.getMethod("print");
        
        System.out.println(m1);
        System.out.println(m2);
        Constructor cons = Employee.class.getConstructor(); // 获取无参构造方法
        Employee e = (Employee) cons.newInstance(); // 用无参构造方法来创建对象
        e.setId(1);
        e.setName("王五");
        e.setAge(20);
        System.out.println(e);

        Field[] cls = Employee.class.getDeclaredFields(); // 得到类中声明的指定名的字段，或者所有这些字段的一个数组
        AccessibleObject.setAccessible(cls,true); // 获取属性访问权限
        System.out.println(Array.getLength(cls));
        for(Field f:cls){
            System.out.println(f.getName());
        }
        Constructor cons2 = Employee.class.getConstructor(Integer.class,String.class,Integer.class); // 获取有参构造方法
        Employee e2 = (Employee) cons2.newInstance(2,"李四",30);
        System.out.println(e2);

    }
}
