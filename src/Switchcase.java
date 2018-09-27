import java.util.Scanner;

public class Switchcase {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int key;

        System.out.println("Skriv et nummer mellem 1 og 3");

        key = input.nextInt();

        switch (key){
            case 1:
                System.out.println("du skrev 1");
                break;
            case 2:
                System.out.println("Du skrev 2");
                break;
            case 3:
                System.out.println("Du skrev 3");
            default:
                System.out.println("Du skrev ikke mellem 1 og 3");
                break;
        }



    }
}
