package com.calculator;

import com.models.Secretary;

public class SecretaryCalculator extends BaseCalculator<Secretary> implements SalaryCalculator{
    @Override
    public void doTask() {
        System.out.println("task Secretary is protection");
    }
}
