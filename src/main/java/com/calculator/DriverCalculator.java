package com.calculator;

import com.models.Driver;

public class DriverCalculator implements SalaryCalculator<Driver>{
    @Override
    public void doTask() {
        System.out.println("task Driver is to drive");
    }
}
