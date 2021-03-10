package main;

import calculations.*;

public class main {
    public static void main(String[] args) {
        Company company = new Company(new companyExpenses(),
                new companyIncome());
        company.calculateProfit();
    }
}
