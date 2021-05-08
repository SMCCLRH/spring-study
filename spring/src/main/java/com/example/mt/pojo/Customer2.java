package com.example.mt.pojo;

/**
 * @Author chenhongxiang
 * @Date 2021/5/7 14:00
 * @Version 1.0
 */
public class Customer2 {
    private Integer id;

    private String name;

    public Customer2(Integer id, String name){
        this.id = id;
        this.name = name;
        System.out.println("创建User");
    }

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

    public void show(){
        System.out.println("id:" + id +",name:" + name);
    }
}
