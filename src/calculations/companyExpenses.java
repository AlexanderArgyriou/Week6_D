package calculations;

import java.util.Scanner;

public class companyExpenses {
    private float value;

    public companyExpenses() {
    }

    public companyExpenses(float value) {
        this.value = value;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public void readCompanyExpenses() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("give exps");
        value = scanner.nextFloat();
    }
}
