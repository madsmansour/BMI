import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //bed bruger om at indtaste vægt i kg.
        System.out.println("Indtast vægt i kg.");
        double vægt = input.nextDouble();

        //bed bruger om at indtaste højde i meter.
        System.out.println("Indtast højde i meter.");
        double højde = input.nextDouble();

        // beregn BMI
        double bmi = vægt / (højde * højde);

        //vis resultat
        System.out.println("din BMI er: " + bmi);
        if (bmi < 18.5)
            System.out.println("Undervægtig");
        else if (bmi < 25)
            System.out.println("Normalvægtig");
        else if (bmi < 30)
            System.out.println("Overvægtig");
        else
            System.out.println("Ekstrem overvægtig");



    }
}
