package com.iot.blog.controller.dto;

public class GithubUser {
    private String login;
    private String bio;
    private Long id;

    public String getLogin() {


        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getBio() {
        return this.bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "GithubUser{" +
            " login='" + login + '\'' +
            ", bio='" + bio + 
            ", id='" + id + '\'' +
            '}';
    }


}
