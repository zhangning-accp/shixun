package com.shixun.stage.project;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zn on 2016/1/5.
 * 分页用
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

    }

    /**
     * 上一页数据
     */
    public void prev() {

    }

    /**
     * 指定页数据
     * @param page
     */
    public void jump(int page) {

    }


}
