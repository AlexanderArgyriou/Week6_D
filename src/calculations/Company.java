package calculations;

import Epochs.Epoch;
import Epochs.SummerProfit;
import Epochs.WinterProfit;

public class Company {
    // year
    private Epoch[] seasons; // 2(1 year).
    private float companyProfit;

    public Company() {
        this.companyProfit = 0.0f;
    }

    public Company(Epoch[] seasons) {
        this.seasons = seasons;
    }

    public Company(int seasons) {
        this.seasons = new Epoch[2 * seasons];
    }

    public Epoch[] getSeasons() {
        return seasons;
    }

    public void setSeasons(Epoch[] seasons) {
        this.seasons = seasons;
    }

    public float getCompanyProfit() {
        return companyProfit;
    }

    public void setCompanyProfit(float companyProfit) {
        this.companyProfit = companyProfit;
    }

    public float calculateCompanyProfit() {
        for(Epoch epoch : seasons) {
            if(epoch instanceof WinterProfit) {
                ((WinterProfit) epoch).calculateWinterProfit();
                companyProfit += ((WinterProfit) epoch).getWinterProfit();
            } else {
                ((SummerProfit) epoch).calculateSummerProfit();
                companyProfit += ((SummerProfit) epoch).getSummerProfit();
            }
        }
        return companyProfit;
    }
}
