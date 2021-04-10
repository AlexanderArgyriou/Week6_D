package calculations;

import java.util.Scanner;

public class CompanyExpenses {

    private float value;

    public CompanyExpenses() {
        this.value = 0.0f;
    }

    public CompanyExpenses(float value) {
        if (value > 0.0f) {
            this.value = value;
        }
    }

    public float getValue() {
        return this.value;
    }


    public void setValue(float value) {
        if (value > 0.0f) {
            this.value = value;
        }
    }

    public void readCompanyExpenses() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Give company Expenses");
            this.value = scanner.nextFloat();
        } while (this.value <= 0.0f);
    }
}