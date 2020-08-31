package com.structural.combination;

public class CombinationDemo {

    public static void main(String[] args) {
        //一个总公司
        ConcreteCompany company = new ConcreteCompany("北京总公司");

        //三个子公司
        ConcreteCompany company1 = new ConcreteCompany("成都分公司");
        company1.add(new HRDepartment("成都分公司人力资源部"));
        company1.add(new FinanceDepartment("成都分公司财务部"));
        ConcreteCompany company2 = new ConcreteCompany("上海分公司");
        company2.add(new HRDepartment("上海分公司人力资源部"));
        company2.add(new FinanceDepartment("上海分公司财务部"));
        ConcreteCompany company3 = new ConcreteCompany("杭州分公司");
        company3.add(new HRDepartment("杭州分公司人力资源部"));
        company3.add(new FinanceDepartment("杭州分公司财务部"));

        company.add(company1);
        company.add(company2);
        company.add(company3);
        System.out.println("公司结构图");
        company.display(1);
        System.out.println("各部门职责");
        company.lineOfDuty();
    }
}
