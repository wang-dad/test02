package org.wang.arraylist;

import java.io.Serializable;
import java.util.Arrays;

public class ArrayList implements List, Serializable {
    public static final int DEFAULT_CAPACITY = 10;
    //定义一个数组
    transient Object[] elementData;
    //包含元素的数量，也就是ArrayList的长度
    private int size;

    /**
     * 没有指定长度，默认长度为4
     */
    public ArrayList() {
        this(4);
    }

    /**
     * @param initialCapacity 指定数组的初始长度
     */
    public ArrayList(int initialCapacity) {
        this.elementData = new Object[initialCapacity];

    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public Object get(int i) {
        if (i < 0 || i >= size) {
            throw new MyArrayIndexOutOfBoundsException("数组越界异常" + i);
            //throw  new RuntimeException("我的数组越界异常"+i);
        }
        return elementData[i];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object e) {
        return false;
    }

    @Override
    public int indexOf(Object e) {
        return 0;
    }

    @Override
    public void add(int i, Object e) {
        //数组满了，就扩容
        if (size == elementData.length) {

            grow();
        }
        for (int j = size; j > i; j--) {
            elementData[j] = elementData[j - 1];
        }
        System.out.println("length:" + elementData.length);
        //给数组第i个元素赋值
        elementData[i] = e;
        size++;
        //elementData[size++] = e;

    }

    @Override
    public void add(Object e) {
     /*   //数组满了，就扩容
        if (size == elementData.length) {

            grow();
        }
        System.out.println("length:" + elementData.length);
        //给数组赋值
        elementData[size] = e;
        size++;
        //elementData[size++] = e;*/
     this.add(size,e);

    }

    private void grow() {
             /*  //创建一个新数组，长度是就数组的二倍
            Object[] arr = new Object[elementData.length*2];
            //将旧数组的值放入新数组中
            for (int i = 0; i < size; i++) {
                arr[i]=elementData[i];
            }
            //让elementData指向新数组
            elementData = arr;*/
        elementData = Arrays.copyOf(elementData, elementData.length + elementData.length / 2);

    }

    @Override
    public boolean addBefore(Object obj, Object e) {
        return false;
    }

    @Override
    public String toString() {
        if (size == 0) {
            return "[]";
        }
        StringBuilder builder = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            if (i != size - 1) {
                builder.append(elementData[i] + ",");

            } else {
                builder.append(elementData[i]);
            }
        }
        builder.append("]");
        return builder.toString();
    }
}
