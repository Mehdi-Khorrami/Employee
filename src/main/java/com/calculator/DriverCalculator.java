package com.calculator;

import com.models.Driver;

public class DriverCalculator extends BaseCalculator<Driver> implements ExtraOperation {
    @Override
    public void doTask() {
        System.out.println("task Driver is to drive");
    }
}
