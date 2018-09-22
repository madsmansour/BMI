import java.util.Scanner;

public class Tax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //indtast filler-status
        System.out.println("(0-single filer, 1-married jointly or " + "qualifying widow(er), 2-married seperately, 3-head of " + "household ");
        System.out.println("Enter the filing status");

        int status = input.nextInt();


        // indtast taxable indkomst
        System.out.println("Enter taxable income");
        double income = input.nextDouble();

        double tax = 0;

        if (status == 0) {
            if (income <= 8350)
                tax = income * 0.10;
            else if (income <= 33950)
                tax = 8350 * 0.10 + (income - 8350) * 0.15;
            else if (income <= 82250)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
            else if (income <= 171550)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (income - 82250) * 0.28;
            else if (income <= 372950)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (income - 82250) * 0.28 + (income - 171550) * 0.33;
            else
                tax = tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (income - 82250) * 0.28 + (372950 - 171550) * 0.33 + (income - 372950) * 0.35;
        }
        else if (status == 1) {


        }
    }
}
