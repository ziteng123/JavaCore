package com.xxx.collection;

import java.util.*;

public class CollectionTest {
    public static void main(String[] args) {
        Collection<String> c;
        List<String> list = new LinkedList<>();
        List<Integer> list2 = new ArrayList<>();
        list.add("Amy");
        list.add("Daddy");
        System.out.println(list);
        Iterator<String> it = list.iterator();
        String first = it.next();
        it.remove(); // 删除第一个访问的元素
        System.out.println(list);
        ListIterator<String> l = list.listIterator();
//        l.next();
        l.add("Juliet"); // 插在next位置之前，如果没有使用next，则会添加到表头
        System.out.println(list);
        String oldValue = l.next();
        l.set("java"); // 修改迭代器所在位置的元素
        System.out.println(list);
        PriorityQueue<int[]> p = new PriorityQueue<>(new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]!=o2[0] ? o2[0]-o1[0] : o2[1]-o1[1];
            }
        });

        PriorityQueue<int[]> p2 = new PriorityQueue<>((o1,o2) -> o1[0]!=o2[0] ? o2[0]-o1[0] : o2[1]-o1[1]);
        Deque<Integer> q = new LinkedList<>();
        

    }
}
