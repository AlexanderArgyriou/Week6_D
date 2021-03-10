package calculations;

import java.util.Scanner;

public class companyIncome {
    private float value;

    public companyIncome() {
    }

    public companyIncome(float value) {
        this.value = value;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public void readCompanyIncome() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("give income");
        value = scanner.nextFloat();
    }
}
