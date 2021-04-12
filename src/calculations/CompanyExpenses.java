package calculations;

import java.util.Scanner;

/**
 * @author Thomas Antoniadis
 */
public class CompanyExpenses {

    private float value;

    /**
     * Default constructor
     */
    public CompanyExpenses() {
        this.value = 0.0f;
    }

    /**
     * Constructor
     * @param float
     */
    public CompanyExpenses(float value) {
        if (value > 0.0f) {
            this.value = value;
        }
    }

    /**
     * getter
     * @return float
     */
    public float getValue() {
        return this.value;
    }

    /**
     * setter
     * @param float
     */
    public void setValue(float value) {
        if (value > 0.0f) {
            this.value = value;
        }
    }

    /**
     * main calculation function
     */
    public void readCompanyExpenses() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Give company Expenses");
            this.value = scanner.nextFloat();
        } while (this.value <= 0.0f);
    }
}