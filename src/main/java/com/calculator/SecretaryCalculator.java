package com.calculator;

import com.models.Secretary;

public class SecretaryCalculator implements SalaryCalculator<Secretary> {

    @Override
    public void doTask() {
        System.out.println("task Secretary is protection");
    }
}
