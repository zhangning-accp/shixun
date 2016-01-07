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
    private int rows = 20;//每次显示的数据条数
    private int pageNumber;//总页数
    private int total;//记录的总条数
    private int currentPage;//当前页
    private boolean isFirst;//是否到最后一页
    private boolean isLast;//是否到第一页


//    public int getRows() {
//        return rows;
//    }

    public void setRows(int rows) {
        this.rows = rows;
        //重新计算总页数
        if(total % rows == 0) {
            pageNumber = total / rows;
        } else {
            pageNumber = (total / rows) + 1;
        }

    }

    /**
     * 返回总页数
     */
    public int getPageNumber() {
        return pageNumber;
    }

//    public void setPages(int pages) {
//        this.pages = pages;
//    }

    /**
     * 获得总行数
     * @return
     */
    public int getTotal() {
        return total;
    }


    /**
     * 获得当前页数
     * @return
     */
//    public int getCurrentPage() {
//        return currentPage;
//    }
//
//    public void setCurrentPage(int currentPage) {
//        this.currentPage = currentPage;
//    }

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

    /**
     * 设置所有数据，在分页前一定要先调用此方法
     * @param datas
     */
    public void setDatas(List<E> datas) {
        this.list = datas;
        this.total = list.size();
        //把总页数计算出来
        if(total % rows == 0) {
            pageNumber = total / rows;
        } else {
            pageNumber = (total / rows) + 1;
        }
    }

    /**
     * 下一页数据
     */
    public void next() {
        //调用jump即可，注意当前页面的问题。要注意控制页码超出或为-1等非正常值的处理
        jump(this.currentPage + 1);
    }

    /**
     * 上一页数据
     */
    public void prev() {
        //调用jump即可，注意当前页面的问题。要注意控制页码超出或为-1等非正常值的处理
        jump(this.currentPage - 1);
    }

    /**
     * 指定页数据
     * @param page
     */
    public void jump(int page) {
        if(page < 0) {
            page = 1;
        }
        if(page > pageNumber) {
            page = pageNumber;
        }
        //设置当前页为page
        currentPage = page;
        //分页算法：
        //计算开始索引。请自己推理开始和结束索引的计算公式
        int start = (this.currentPage - 1) * rows;
        //计算结束索引
        int end = (this.currentPage * rows) - 1;
        //利用开始和结束索引将数据从list提炼出来，并添加到pageDatas
        this.pageDatas.clear();
        for(int i = start; i < end; i ++) {
            pageDatas.add(list.get(i));
        }
        //计算是否到达最后一页，如果是则设置isLast的值，如果是跳到第一页则设置isFirst的值。对于翻页的基本要求是。
        if(pageNumber == 1) {
            isFirst = false;
            isLast = false;
        } else if(currentPage == 1) {
            isFirst = true;
            isLast = false;
        } else if(currentPage == pageNumber) {
            isFirst = false;
            isLast = true;
        }
    }
}
