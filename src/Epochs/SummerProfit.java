package Epochs;

import calculations.CompanyExpenses;
import calculations.CompanyIncome;
import constants.Constants;

/**
 * Author Terpsichori Mitsi
 */
public class SummerProfit implements Saisonal {
    private CompanyIncome totalSummerIncome;
    private CompanyExpenses totalSummerExpenses;
    private float summerProfit;

    /**
     * Default Constructor
     */
    public SummerProfit() {
        this.totalSummerExpenses = new CompanyExpenses();
        this.totalSummerIncome = new CompanyIncome();
        this.summerProfit = 0.0f;
    }

    /**
     * Constructor
     * @param totalSummerIncome
     * @param totalSummerExpenses
     */
    public SummerProfit(CompanyIncome totalSummerIncome, CompanyExpenses totalSummerExpenses) {
        this.totalSummerIncome = totalSummerIncome;
        this.totalSummerExpenses = totalSummerExpenses;
        this.summerProfit = 0.0f;
    }

    /**
     * getter
     * @return CompanyExpenses
     */
    public CompanyExpenses getTotalSummerExpenses() {
        return this.totalSummerExpenses;
    }

    /**
     * getter
     * @return CompanyIncome
     */
    public CompanyIncome getTotalSummerIncome() {
        return totalSummerIncome;
    }

    /**
     * getter
     * @return float
     */
    public float getSummerProfit() {
        return summerProfit;
    }

    /**
     * setter
     * @param totalSummerIncome
     */
    public void setTotalSummerIncome(CompanyIncome totalSummerIncome) {
        if(totalSummerIncome != null) {
            this.totalSummerIncome = totalSummerIncome;
        }
    }

    /**
     * setter
     * @param totalSummerExpenses
     */
    public void setTotalSummerExpenses(CompanyExpenses totalSummerExpenses) {
        if(totalSummerExpenses != null) {
            this.totalSummerExpenses = totalSummerExpenses;
        }
    }

    /**
     * setter
     * @param summerProfit
     */
    public void setSummerProfit(float summerProfit) {
        this.summerProfit = summerProfit;
    }

    /**
     * main calculation function
     * @return float
     */
    public float calculateSummerProfit(){
        summerProfit = (totalSummerIncome.getValue() -
                (totalSummerIncome.getValue() * (Constants.VAT / 100))) -
                (totalSummerExpenses.getValue() - (totalSummerExpenses.getValue() * Constants.VAT / 100));
        return summerProfit;
    }
}
