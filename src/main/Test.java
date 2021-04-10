package main;

import Epochs.SummerProfit;
import Epochs.WinterProfit;
import calculations.Company;
import Epochs.Epoch;
import calculations.CompanyExpenses;
import calculations.CompanyIncome;

public class Test {
    public static void main(String[] args) {
        Epoch epochsTest[] = new Epoch[4]; // 2 seasons, 2 xronia

        // season1
        epochsTest[0] = new WinterProfit(new CompanyIncome(90.8f), new CompanyExpenses(10.0f));
        epochsTest[1] = new SummerProfit(new CompanyIncome(90.8f), new CompanyExpenses(10.0f));

        // season2
        epochsTest[2] = new WinterProfit(new CompanyIncome(90.8f), new CompanyExpenses(10.0f));
        epochsTest[3] = new SummerProfit(new CompanyIncome(90.8f), new CompanyExpenses(10.0f));

        Company company = new Company(epochsTest); // etairia
        System.out.println(company.calculateCompanyProfit());
    }
}
