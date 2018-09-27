import java.util.Scanner;

public class Rand {
    public static void main(String[] args) {

        int friendsBirthYear = 3118;
        int myBirthyear = 1991;
        System.out.println("My friend's birthyear is: " + friendsBirthYear);
        System.out.println("My birthyear is: " + myBirthyear);
        System.out.println("The age difference of us is: " + (friendsBirthYear - myBirthyear) + " Years");

        Scanner input = new Scanner(System.in);

        System.out.println("Hvor gammel er du?");
        int dinAlder = input.nextInt();

        System.out.println("Hvor gammel er din ven?");
        int dinVensAlder = input.nextInt();

        System.out.println("Aldersforskellen på jer er " + (dinAlder - dinVensAlder) + " år");

        Computer myComputer = new Computer("intel i5", "8gb", "256 gb", "Nvidia geforce something", true);
        System.out.println("my computers CPU is: " + myComputer.CPU);
    }
}
