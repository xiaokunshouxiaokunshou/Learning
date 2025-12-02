package com.example.agvlist.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/***
 *@title AGV
 *@description <TODO description class purpose>
 *@author Chuck
 *@version 1.0.0
 *@create 2025/11/25 21:40
 *@mail beier33@163.com
 **/
public class AGV {
    private Integer id;
    private String enName;
    private String sn;
    private String name;
    private Integer type;
    private Integer navType;
    private LocalDateTime updateTime;

    // 添加无参构造函数
    public AGV() {
    }

    // 添加带参构造函数
    public AGV(Integer id, String enName, String sn, String name, Integer type, Integer navType, LocalDateTime updateTime) {
        this.id = id;
        this.enName = enName;
        this.sn = sn;
        this.name = name;
        this.type = type;
        this.navType = navType;
        this.updateTime = updateTime;
    }

    // getter 和 setter 方法
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getNavType() {
        return navType;
    }

    public void setNavType(Integer navType) {
        this.navType = navType;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }
}
