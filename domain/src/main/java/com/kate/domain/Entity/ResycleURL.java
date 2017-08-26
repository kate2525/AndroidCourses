package com.kate.domain.Entity;


public class ResycleURL {

    private String name;
    private int age;
    private String url;

    @Override
    public String toString() {
        return "ResycleURL{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", url='" + url + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
