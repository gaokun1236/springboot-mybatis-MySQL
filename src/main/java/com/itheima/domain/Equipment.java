package com.itheima.domain;

public class Equipment {

    private Integer id;
    private String number;
    private String address;
    private String free;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFree() {
        return free;
    }

    public void setFree(String free) {
        this.free = free;
    }

    @Override
    public String toString() {
        return "Equipment{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", address='" + address + '\'' +
                ", state='" + free + '\'' +
                '}';
    }
}
