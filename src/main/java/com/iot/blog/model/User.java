package com.iot.blog.model;

public class User {
    private Integer id;
    private String name;
    //private String accountId;
    private String token;
    private Long gmtCreate;
   // private Long gmtModified;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // public String getAccountId() {
    //     return this.accountId;
    // }

    // public void setAccountId(String accountId) {
    //     this.accountId = accountId;
    // }

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public void setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    // public Long getGmtModified() {
    //     return this.gmtModified;
    // }

    // public void setGmtModified(Long gmtModified) {
    //     this.gmtModified = gmtModified;
    // }

}
