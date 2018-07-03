package com.gitdemo.com.jk.bean;

import java.util.Date;

/**
 * @program: demo
 * @description: ${description}
 * @author: zb
 * @create: 2018-07-03 20:24
 **/
public class Qian {

    private Integer id;
    private String name;
    private Date date;
    private String hobby;
    private String hobby2;
    private String hobby3;
    private String hobby4;
    private String hobby5;
    private String hobby6;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Qian{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date=" + date +
                '}';
    }
}
