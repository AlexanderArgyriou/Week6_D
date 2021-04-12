package calculations;

import java.util.Scanner;

/**
 * Author Alexandros Argyriou
 */
public class CompanyIncome {

    private float value;

    /**
     * Default Constructor
     */
    public CompanyIncome() {
        this.value = 0.0f;
    }   // default constructor

    /**
     * Constructor
     * @param float
     */
    public CompanyIncome(float value) {
        if(value > 0.0f) {
            this.value = value;
        } else {
            this.value = 0.0f;
        }
    } // constructor

    /**
     * getter
     * @return float
     */
    public float getValue() {
        return this.value;
    }   // get value

    /**
     * setter
     * @param float
     */
    public void setValue(float value) {
        if(value > 0.0f) {
            this.value = value;
        }
    }   // set value

    /**
     * main calculation function
     */
    public void readCompanyIncome() {
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Give income");
            this.value = scanner.nextFloat();
        } while (this.value <= 0.0f) ;
    }   // readCompanyIncome
}   // CompanyIncome's interface

