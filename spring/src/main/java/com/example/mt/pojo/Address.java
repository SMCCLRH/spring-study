package com.example.mt.pojo;

/**
 * @Author chenhongxiang
 * @Date 2021/5/7 15:47
 * @Version 1.0
 */
public class Address {

    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                '}';
    }
}
