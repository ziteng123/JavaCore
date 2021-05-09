package com.xxx.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CopyOfTest {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        a = (int[])goodCopyOf(a,10);  // 将数组a复制到一个长度为10的数组中
        System.out.println(Arrays.toString(a));

        String[] b = {"Tom","Dick","Harry"};
        b = (String[])goodCopyOf(b,10);
        System.out.println(Arrays.toString(b));

//        b = (String[]) badCopyOf(b,10);
    }

    public static Object[] badCopyOf(Object[] a, int newLength){

        var newArray = new Object[newLength];
        System.arraycopy(a, 0, newArray, 0, Math.min(a.length, newLength));
        return newArray;
    }

    public static Object goodCopyOf(Object a, int newLength){
        Class cl = a.getClass();
        if(!cl.isArray()) return null;
        Class componentType = cl.getComponentType(); // 获取数组内元素的类型
        int length = Array.getLength(a);
        Object newArray = Array.newInstance(componentType,newLength); // 创建数组
        System.arraycopy(a, 0,newArray, 0,Math.min(length,newLength)); // 复制数组
        return newArray;

    }
}
