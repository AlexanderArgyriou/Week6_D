package Epochs;

import calculations.CompanyExpenses;
import calculations.CompanyIncome;
import constants.Constants;

/**
 * @author Tsoumani Christina
 */
public class WinterProfit implements Saisonal {
    private CompanyIncome totalWinterIncome;
    private CompanyExpenses totalWinterExpenses;
    private float winterProfit;

    /**
     * Default Constructor
     */
    public WinterProfit() {
        this.totalWinterExpenses = new CompanyExpenses();
        this.totalWinterIncome = new CompanyIncome();
        this.winterProfit = 0.0f;
    }

    /**
     * Constructor
     * @param totalSummerIncome
     * @param totalSummerExpenses
     */
    public WinterProfit(CompanyIncome totalSummerIncome, CompanyExpenses totalSummerExpenses) {
        this.totalWinterIncome = totalSummerIncome;
        this.totalWinterExpenses = totalSummerExpenses;
        this.winterProfit = 0.0f;
    }

    /**
     * getter
     * @return CompanyExpenses
     */
    public CompanyExpenses getTotalWinterExpenses() {
        return this.totalWinterExpenses;
    }

    /**
     * setter
     * @return CompanyIncome
     */
    public CompanyIncome getTotalWinterIncome() {
        return totalWinterIncome;
    }

    /**
     * getter
     * @return float
     */
    public float getWinterProfit() {
        return winterProfit;
    }

    /**
     * setter
     * @param totalWinterIncome
     */
    public void setTotalWinterIncome(CompanyIncome totalWinterIncome) {
        if(totalWinterIncome != null) {
            this.totalWinterIncome = totalWinterIncome;
        }
    }

    /**
     * setter
     * @param totalWinterExpenses
     */
    public void setTotalWinterExpenses(CompanyExpenses totalWinterExpenses) {
        if(totalWinterExpenses != null) {
            this.totalWinterExpenses = totalWinterExpenses;
        }
    }

    /**
     * setter
     * @param winterProfit
     */
    public void setWinterProfit(float winterProfit) {
        this.winterProfit = winterProfit;
    }

    /**
     * main calculation function
     * @return
     */
    public float calculateWinterProfit(){
        winterProfit = (totalWinterIncome.getValue() -
                (totalWinterIncome.getValue() * (Constants.VAT / 100))) -
                (totalWinterExpenses.getValue() - (totalWinterExpenses.getValue() * Constants.VAT / 100));
        return winterProfit;
    }
}