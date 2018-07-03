package com.gitdemo.com.jk.bean;

/**
 * @program: demo
 * @description: ${description}
 * @author: zb
 * @create: 2018-07-03 19:42
 **/
public class Ge {

    private Integer geId;
    private String geName;

    public Integer getGeId() {
        return geId;
    }

    public void setGeId(Integer geId) {
        this.geId = geId;
    }

    public String getGeName() {
        return geName;
    }

    public void setGeName(String geName) {
        this.geName = geName;
    }

    @Override
    public String toString() {
        return "Ge{" +
                "geId=" + geId +
                ", geName='" + geName + '\'' +
                '}';
    }
}
