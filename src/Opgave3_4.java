import java.util.Scanner;

public class Opgave3_4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Choose a key between 1 and 20");
        int key = input.nextInt();

        if (key < 10 && key >0)
            System.out.println("The key was false");
        else if (key > 10 && key <20)
            System.out.print("They key was true");
        else
            System.out.println("Invalid input");



    }
}
