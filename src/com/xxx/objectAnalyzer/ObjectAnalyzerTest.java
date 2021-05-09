package com.xxx.objectAnalyzer;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class ObjectAnalyzerTest {
    public static void main(String[] args) throws IllegalAccessException, ClassNotFoundException {
//        var squares = new ArrayList<Integer>();
//        for(int i = 1; i <= 5; i++){
//            squares.add(i*i);
//        }
//        System.out.println(new ObjectAnalyzer().toString(squares));
        String str = "Hello World!";
        System.out.println(new ObjectAnalyzer().toString(str));
        int[] arr = new int[]{1,2,3,4,5};
        Class cl = arr.getClass();
        System.out.println(int[].class);
        System.out.println(Class.forName("java.lang.String"));
        System.out.println(Class.forName("[I"));
        System.out.println(cl);
        System.out.println("类名："+cl.getName()); // 获取类名
        System.out.println(cl.getComponentType()); // 返回一个数组内元素的类型，如果 不是数组，则返回null
        System.out.println(cl.getComponentType().isPrimitive()); // 判断该类型是否是基本类型
        System.out.println(str.getClass().getComponentType());
        System.out.println(cl.isArray()); // 判断类对象是否是一个数组
        Class superClass = cl.getSuperclass(); // 获取这个类对象的超类类对象
        System.out.println(superClass.getName());
        Class cl2 = ArrayList.class;
        System.out.println("ArrayList类名:"+cl2.getName());
        Field[] fields = cl2.getDeclaredFields(); // 获取ArrayList的属性
//        AccessibleObject.setAccessible(fields,true);
        for(Field field:fields){
//            System.out.println(field.getName()); // 返回这个属性的属性名
            System.out.println(field.getModifiers());
            System.out.println(field.getName()+":"+field.getType()+":"+field.getType().isPrimitive()); // getType()返回属性的类型，返回值是一个类对象
        }
        Method[] methods = cl2.getDeclaredMethods(); // 获取ArrayList中的方法
        for(Method method:methods){
            System.out.println(method.getName());
        }
        try {
            ArrayList<Integer> arr2 = (ArrayList<Integer>) cl2.getDeclaredConstructor().newInstance();
            arr2.add(1);
            arr2.add(2);
            arr2.add(3);
            System.out.println(arr2);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }


    }
}
