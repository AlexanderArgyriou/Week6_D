package Epochs;

import calculations.CompanyExpenses;
import calculations.CompanyIncome;
import constants.Constants;

public class SummerProfit implements Epoch {
    private CompanyIncome totalSummerIncome;
    private CompanyExpenses totalSummerExpenses;
    private float summerProfit;

    public SummerProfit() {
        this.totalSummerExpenses = new CompanyExpenses();
        this.totalSummerIncome = new CompanyIncome();
        this.summerProfit = 0.0f;
    }

    public SummerProfit(CompanyIncome totalSummerIncome, CompanyExpenses totalSummerExpenses) {
        this.totalSummerIncome = totalSummerIncome;
        this.totalSummerExpenses = totalSummerExpenses;
        this.summerProfit = 0.0f;
    }

    public CompanyExpenses getTotalSummerExpenses() {
        return this.totalSummerExpenses;
    }

    public CompanyIncome getTotalSummerIncome() {
        return totalSummerIncome;
    }

    public float getSummerProfit() {
        return summerProfit;
    }

    public void setTotalSummerIncome(CompanyIncome totalSummerIncome) {
        if(totalSummerIncome != null) {
            this.totalSummerIncome = totalSummerIncome;
        }
    }

    public void setTotalSummerExpenses(CompanyExpenses totalSummerExpenses) {
        if(totalSummerExpenses != null) {
            this.totalSummerExpenses = totalSummerExpenses;
        }
    }

    public void setSummerProfit(float summerProfit) {
        this.summerProfit = summerProfit;
    }

    public float calculateSummerProfit(){
        summerProfit = (totalSummerIncome.getValue() -
                (totalSummerIncome.getValue() * (Constants.VAT / 100))) -
                (totalSummerExpenses.getValue() - (totalSummerExpenses.getValue() * Constants.VAT / 100));
        return summerProfit;
    }

    private void print() {
        System.out.println("The total income for summer is " +totalSummerIncome);
        System.out.println("The total summer expenses for summer are " +totalSummerExpenses);
        System.out.println("the summer profit is " +summerProfit);
    }
}
