package com.shixun.stage.project;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zn on 2016/1/5.
 * 分页用的数据对象封装
 */
public class Page<E> {
    //总数据
    private List<E> list = null;
    //分页数据
    private List<E> pageDatas = null;
    private int rows;//每次显示的数据条数
    private int pages;
    private int total;//记录的总条数
    private int currentPage;//当前页
    private boolean isFirst;//是否到最后一页
    private boolean isLast;//是否到第一页


    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getTotal() {
        return total;
    }


    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public boolean isFirst() {
        return isFirst;
    }

    public boolean isLast() {
        return isLast;
    }


    /**
     * 获取分页后的数据
     * @return
     */
    public List<E> getPageDatas() {

        return pageDatas;
    }

    public void setDatas(List<E> datas) {
        this.list = datas;
    }

    /**
     * 下一页数据
     */
    public void next() {
        //调用jump即可，注意当前页面的问题。要注意控制页码超出或为-1等非正常值的处理
    }

    /**
     * 上一页数据
     */
    public void prev() {
        //调用jump即可，注意当前页面的问题。要注意控制页码超出或为-1等非正常值的处理
    }

    /**
     * 指定页数据
     * @param page
     */
    public void jump(int page) {
        //设置当前页为page
        currentPage = page;
        //分页算法：
        //计算开始索引。请自己推理开始和结束索引的计算公式
        int start = 0;
        //计算结束索引
        int end = 0;
        //利用开始和结束索引将数据从list提炼出来，并添加到pageDatas
        this.pageDatas.clear();
        for(int i = start; i < end; i ++) {
            pageDatas.add(list.get(i));
        }
        //计算是否到达最后一页，如果是则设置isLast的值，如果是跳到第一页则设置isFirst的值。对于翻页的基本要求是。
        //
    }
}
