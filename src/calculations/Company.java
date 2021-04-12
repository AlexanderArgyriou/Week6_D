package calculations;

import Epochs.Saisonal;
import Epochs.SummerProfit;
import Epochs.WinterProfit;

public class Company {
    // year
    private Saisonal[] seasons; // 2(1 year).
    private float companyProfit;

    public Company() {
        this.companyProfit = 0.0f;
    }

    public Company(Saisonal[] seasons) {
        this.seasons = seasons;
    }

    public Company(int seasons) {
        this.seasons = new Saisonal[2 * seasons];
    }

    public Saisonal[] getSeasons() {
        return seasons;
    }

    public void setSeasons(Saisonal[] seasons) {
        this.seasons = seasons;
    }

    public float getCompanyProfit() {
        return companyProfit;
    }

    public void setCompanyProfit(float companyProfit) {
        this.companyProfit = companyProfit;
    }

    public float calculateCompanyProfit() {
        for(Saisonal saisonal : seasons) {
            if(saisonal instanceof WinterProfit) {
                ((WinterProfit) saisonal).calculateWinterProfit();
                companyProfit += ((WinterProfit) saisonal).getWinterProfit();
            } else {
                ((SummerProfit) saisonal).calculateSummerProfit();
                companyProfit += ((SummerProfit) saisonal).getSummerProfit();
            }
        }
        return companyProfit;
    }
}
