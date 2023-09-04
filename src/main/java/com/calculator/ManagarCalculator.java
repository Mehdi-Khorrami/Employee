package com.calculator;

import com.models.Manager;

public class ManagarCalculator implements SalaryCalculator<Manager> {

    @Override
    public void doTask() {
        System.out.println("task manager is manage");
    }
}
