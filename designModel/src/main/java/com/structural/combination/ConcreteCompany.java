package com.structural.combination;

import java.util.ArrayList;
import java.util.List;

public class ConcreteCompany extends Company {

    List<Company> childrenCompanyList = new ArrayList<>();
    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {
        childrenCompanyList.add(company);
    }

    @Override
    public void remove(Company company) {
        childrenCompanyList.remove(company);
    }

    @Override
    public void display(int depth) {
        System.out.println("第" + depth + "层机构名为：" + name);
        for (Company company : childrenCompanyList) {
            company.display(depth + 1);
        }
    }

    @Override
    public void lineOfDuty() {
        for (Company company : childrenCompanyList) {
            company.lineOfDuty();
        }
    }
}
