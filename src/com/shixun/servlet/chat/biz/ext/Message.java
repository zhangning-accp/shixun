package com.shixun.servlet.chat.biz.ext;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Administrator on 2016/3/31.
 * 消息类分封装
 */
public class Message {
    private String id = UUID.randomUUID().toString();
    private String userName;
    private String content;
    private Date date = new Date();

    public String getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    @Override
    public String toString() {
        StringBuffer html = new StringBuffer(
                "<dl>")
                .append("<dt>" + date.toLocaleString() + " " + userName + "说:</dt>")
                .append("<dd>" + content + "</dd></dl>");
        return html.toString();
    }
}
