package com.yeskova.runners.lesson17;

import com.yeskova.app.classwork.lesson17.Company;

/**
 * Created by Alex on 5/16/17.
 */
public class CompanyRunner {
    public static void main(String[] args) {

        for(Company cName : Company.values()) {
            System.out.println("Company value: " +
            cName.getValue() +
            "  - Company Name: " + cName);
        }
    }
}
