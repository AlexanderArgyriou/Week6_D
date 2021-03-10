package calculations;

import constants.Constants;

public class Company {
    private companyExpenses companyExpenses;
    private companyIncome companyIncome;
    private float companyProfit;

    public Company(calculations.companyExpenses companyExpenses, calculations.companyIncome companyIncome) {
        this.companyExpenses = companyExpenses;
        this.companyIncome = companyIncome;
    }

    public Company() {
    }

    public float getCompanyProfit() {
        return companyProfit;
    }

    public void setCompanyProfit(float companyProfit) {
        this.companyProfit = companyProfit;
    }

    public calculations.companyExpenses getCompanyExpenses() {
        return companyExpenses;
    }

    public void setCompanyExpenses(calculations.companyExpenses companyExpenses) {
        this.companyExpenses = companyExpenses;
    }

    public calculations.companyIncome getCompanyIncome() {
        return companyIncome;
    }

    public void setCompanyIncome(calculations.companyIncome companyIncome) {
        this.companyIncome = companyIncome;
    }

    public void calculateProfit() {
        // solve it
        // some1 pls
        // write this
        read();
        companyProfit = companyIncome.getValue() - companyExpenses.getValue() + (Constants.VAT * companyIncome.getValue());
        System.out.println(this.companyProfit);
    }

    private void read() {
        companyIncome.readCompanyIncome();
        companyExpenses.readCompanyExpenses();
    }
}
