package calculations;

import Epochs.Saisonal;
import Epochs.SummerProfit;
import Epochs.WinterProfit;

/**
 * Author Christodoulou Ifigenia
 */
public class Company {
    // year
    private Saisonal[] seasons; // 2(1 year).
    private float companyProfit;

    /**
     * Default Constructor
     */
    public Company() {
        this.companyProfit = 0.0f;
    }

    /**
     * Constructor
     * @param seasons
     */
    public Company(Saisonal[] seasons) {
        this.seasons = seasons;
    }

    /**
     * Constructor
     * @param seasons
     */
    public Company(int seasons) {
        this.seasons = new Saisonal[2 * seasons];
    }

    /**
     * getter
     * @return Saisonal[]
     */
    public Saisonal[] getSeasons() {
        return seasons;
    }

    /**
     * setter
     * @param seasons
     */
    public void setSeasons(Saisonal[] seasons) {
        this.seasons = seasons;
    }

    /**
     * getter
     * @return float
     */
    public float getCompanyProfit() {
        return companyProfit;
    }

    /**
     * setter
     * @param companyProfit
     */
    public void setCompanyProfit(float companyProfit) {
        this.companyProfit = companyProfit;
    }

    /**
     * main calculation function
     * @return float
     */
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
