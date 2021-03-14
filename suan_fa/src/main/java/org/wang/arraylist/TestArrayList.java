package org.wang.arraylist;

public class TestArrayList {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(2,1111);
        System.out.println(list.size());
        System.out.println(list.get(2));
        System.out.println(list.isEmpty());
        System.out.println(list);
    }
}
