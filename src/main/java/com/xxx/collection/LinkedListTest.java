package com.xxx.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListTest {
    public static void main(String[] args) {
//        var a = new LinkedList<String>();
//        a.add("Amy");
//        a.add("Carl");
//        a.add("Erica");
//        System.out.println(a);
//        var b = new LinkedList<String>();
//        b.add("Bob");
//        b.add("Doug");
//        b.add("Frances");
//        b.add("Gloria");
//        System.out.println(b);
//        ListIterator<String> iter = a.listIterator();
//        Iterator<String> bIter = b.iterator();
//        while(bIter.hasNext()){
//            if(iter.hasNext()){
//                iter.next();
//            }
//            iter.add(bIter.next());
//        }
//        System.out.println(a);
//
//        bIter = b.iterator();
//        while(bIter.hasNext()){
//            bIter.next();
//            if(bIter.hasNext()){
//                bIter.next();
//                bIter.remove();
//            }
//        }
//        System.out.println(b);
//        a.removeAll(b);
//        System.out.println(a);

        var staff = new LinkedList<String>();
        staff.add("Amy");
        staff.add("Bob");
        staff.add("Carl");
        ListIterator<String> iters = staff.listIterator();
        iters.next(); // 跳过第一个元素 如果在第一个元素之前添加,则去掉这一句
        iters.add("Juliet"); // 在第一个元素后面添加
        System.out.println(staff);
    }
}
