package com.calculator;

import com.models.Employee;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public  interface SalaryCalculator<T extends Employee>{

    default void calculateSalary(T employee){
        Double  tax  =  calculateTax(employee);
        employee.setTaxRate(tax);

        double sal =
                employee.getSalary() - employee.getSalary() * tax;

        employee.setSalary((long) sal);

    }

    private Double calculateTax(T employee) {
        Long salary = employee.getSalary();

        Double taxRate = null;

        if( salary <= 5600000 ){
            taxRate = 0D;
        } else if (salary <= 15000000) {
            taxRate = 10D;
        }else if (salary <= 25000000) {
            taxRate = 15D;
        }else if(salary <= 35000000){
            taxRate = 20D;
        }else {
            taxRate = 30D;
        }

        return taxRate / 100 ;
    }

    default Map<String,Long> calculateSalary(List<T> employees){
        Map<String, Long > map = new HashMap<>();
        for (Employee re : employees) {
            map.put(re.getNational_id(), re.getSalary());
        }
        return map;
    }

    void doTask();
}
