package Epochs;

import calculations.CompanyExpenses;
import calculations.CompanyIncome;
import constants.Constants;

public class WinterProfit implements Epoch {
    private CompanyIncome totalWinterIncome;
    private CompanyExpenses totalWinterExpenses;
    private float winterProfit;

    public WinterProfit() {
        this.totalWinterExpenses = new CompanyExpenses();
        this.totalWinterIncome = new CompanyIncome();
        this.winterProfit = 0.0f;
    }

    public WinterProfit(CompanyIncome totalSummerIncome, CompanyExpenses totalSummerExpenses) {
        this.totalWinterIncome = totalSummerIncome;
        this.totalWinterExpenses = totalSummerExpenses;
        this.winterProfit = 0.0f;
    }

    public CompanyExpenses getTotalWinterExpenses() {
        return this.totalWinterExpenses;
    }

    public CompanyIncome getTotalWinterIncome() {
        return totalWinterIncome;
    }

    public float getWinterProfit() {
        return winterProfit;
    }

    public void setTotalWinterIncome(CompanyIncome totalWinterIncome) {
        if(totalWinterIncome != null) {
            this.totalWinterIncome = totalWinterIncome;
        }
    }

    public void setTotalWinterExpenses(CompanyExpenses totalWinterExpenses) {
        if(totalWinterExpenses != null) {
            this.totalWinterExpenses = totalWinterExpenses;
        }
    }

    public void setWinterProfit(float winterProfit) {
        this.winterProfit = winterProfit;
    }

    public float calculateWinterProfit(){
        winterProfit = (totalWinterIncome.getValue() -
                (totalWinterIncome.getValue() * (Constants.VAT / 100))) -
                (totalWinterExpenses.getValue() - (totalWinterExpenses.getValue() * Constants.VAT / 100));
        return winterProfit;
    }

    private void print() {
        System.out.println("The total income for winter is " + totalWinterIncome);
        System.out.println("The total summer expenses for winter are " + totalWinterExpenses);
        System.out.println("the winter profit is " + winterProfit);
    }
}