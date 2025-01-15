import java.util.Scanner;

public class BasicInput {
    public static void main(String[] args) {
        int userInt;
        double userDouble;
        char userChar;
        String userString;

        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter integer:");
        userInt = scnr.nextInt();

        System.out.print("Enter a Double: ");
        userDouble = scnr.nextDouble();

        System.out.print("Enter a Character: ");
        userChar = scnr.next().charAt(0);

        System.out.print("Enter a String: ");
        userString = scnr.next();
        userString += " " + scnr.nextLine();


        System.out.println(userInt + " " + userDouble+ " " + userChar+ " " + userString);
        System.out.println(userString + " " + userChar+ " " + userDouble+ " " + userInt);
        System.out.println(userDouble + " cast to an integer is " + (int)userDouble);




    }
}