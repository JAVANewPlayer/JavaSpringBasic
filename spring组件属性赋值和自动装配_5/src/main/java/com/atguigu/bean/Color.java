package com.atguigu.bean;

/**
 * Description: springannotation
 * Created by huangchengdu on 2018/9/7 下午8:43
 */
public class Color {

    private Car car;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Color{" +
                "car=" + car +
                '}';
    }
}
