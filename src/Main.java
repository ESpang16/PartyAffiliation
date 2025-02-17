import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String party = "";
        String trash = "";
        System.out.println("D-Democratic \t R-Republican \t I-Independent \t O-Other \n Choose your party: ");
        party = in.nextLine();
        if (party.equalsIgnoreCase("D")) {
            System.out.println("Congratulations! You have a Democratic Donkey!");
        } else if (party.equalsIgnoreCase("R")) {
            System.out.println("Congratulations! You have a Republican Elephant!");
        } else if (party.equalsIgnoreCase("I")) {
            System.out.println("Congratulations! You have an Independent Person!");
        } else if (party.equalsIgnoreCase("O")) {
            System.out.println("You have chosen other.");
        }
    }
}