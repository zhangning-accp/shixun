package com.shixun.c14.work;

/**
 * Created by zn on 2016/1/4.
 * 自定义一个类，方便对数组的操作。类似java的集合对象
 */
public class ZNList<D> {
    private static int capacity = 10;//容量，这里默认容量最好为静态常量
    private Object [] datas = new Object[capacity];
    private int point = 0;
    private int size = 0;

    public ZNList() {

    }
    public ZNList(int initialCapacity) {
        capacity = initialCapacity;
        datas = new Object[capacity];
    }

    public void add(D e) {
        if(point <= datas.length -1) {
            datas[point] = e;
            point ++;
        } else {
            //如果当前的point点位于最后的位置，表示数组已满，此时需要扩充数组长度，
            // 扩充按原长度+原长度/2.这种方式比单纯的判断对象是否为null更为合理和方便，后期扩展也更容易，比如
            //需要判
            Object [] tmp = datas;
            datas = new Object[datas.length + (datas.length / 2)];
            for(int i = 0; i < tmp.length; i ++) {
                datas[i] = tmp[i];
                point = i + 1;
            }
        }
        size ++;
    }

    public D get(int index) {
        return (D)datas[index];
    }

    public int size() {
        return size;
    }

    public void remove(int index) {
        //删除元素
        datas[index] = null;
        //将后面的元素向前移动
        for(int i = index + 1; i < datas.length; i ++) {
            datas[index] = datas[i];
        }
        size --;
    }
}
