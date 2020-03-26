package com.entity;

import java.io.Serializable;

//要加上implements Serializable，否则会报java.io.NotSerializableException
public class User implements Serializable {
    private int id;
    private String name;
    private String deptId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }
}
