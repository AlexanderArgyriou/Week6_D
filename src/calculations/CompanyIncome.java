package calculations;

import java.util.Scanner;

public class CompanyIncome {

    private float value;

    public CompanyIncome() {
        this.value = 0.0f;
    }   // default constructor

    /**
     * this function does something magnificent
     * @param float
     */
    public CompanyIncome(float value) {
        if(value > 0.0f) {
            this.value = value;
        } else {
            this.value = 0.0f;
        }
    } // constructor

    public float getValue() {
        return this.value;
    }   // get value

    public void setValue(float value) {
        if(value > 0.0f) {
            this.value = value;
        }
    }   // set value

    public void readCompanyIncome() {
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Give income");
            this.value = scanner.nextFloat();
        } while (this.value <= 0.0f) ;
    }   // readCompanyIncome
}   // CompanyIncome's interface

