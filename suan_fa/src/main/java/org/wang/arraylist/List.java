package org.wang.arraylist;

public interface List {
    //返回线性表的大小，即数据元素的个数
    public int size();

    //返回线性表种序号为i的数据元素
    public Object get(int i);

    //如果线性表为空返回true，否则返回false
    public boolean isEmpty();

    //判断线性表是否包含数据元素e
    public boolean contains(Object e);

    //返回数据元素e在线性表种的序号
    public int indexOf(Object e );

    //将数据元素e插入到线性表种i号位置
    public void add(int i,Object e);

    //将数据元素e插入到线性表末尾
    public void add(Object e);

    //将数据元素e插入到元素obj之前
    public boolean addBefore(Object obj,Object e);
}
