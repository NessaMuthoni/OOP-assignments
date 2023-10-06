package menuStimulator;
import java.util.Scanner;

public class menuSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentMenu = 1;

        while (true) {
            displayMenu(currentMenu);
            int option = scanner.nextInt();

            if (currentMenu == 1) {
                switch (option) {
                    case 0:
                        System.out.println("Sh 20 (30 mins, 3 hrs) selected.");
                        break;
                    case 1:
                        System.out.println("Sh 10 (15 mins, 1 hr) selected.");
                        break;
                    case 2:
                        System.out.println("Sh 5 (15 mins, midnight) selected.");
                        break;
                    case 3:
                        System.out.println("Okoa 50 selected.");
                        break;
                    case 4:
                        System.out.println("Okoa 20 selected.");
                        break;
                    case 5:
                        System.out.println("Okoa 10 selected.");
                        break;
                    case 6:
                        System.out.println("Okoa 5 selected.");
                        break;
                    case 7:
                        System.out.println("Okoa 20 (900MB, 1 hr) selected.");
                        break;
                    case 8:
                        System.out.println("Okoa Internet selected.");
                        break;
                    case 98:
                        currentMenu = 2; // Go to "More" menu
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            } else if (currentMenu == 2) {
                switch (option) {
                    case 0:
                        currentMenu = 1; // Go back to Menu 1
                        break;
                    case 9:
                        System.out.println("Okoa Minutes selected.");
                        break;
                    case 10:
                        System.out.println("Okoa SMS selected.");
                        break;
                    case 11:
                        System.out.println("Lipa Okoa selected.");
                        break;
                    case 12:
                        System.out.println("Check Balance selected.");
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            }
        }
    }

    private static void displayMenu(int menu) {
        if (menu == 1) {
            System.out.println("Menu 1:");
            System.out.println("0: Sh 20 (30 mins, 3 hrs)");
            System.out.println("1: Sh 10 (15 mins, 1 hr)");
            System.out.println("2: Sh 5 (15 mins, midnight)");
            System.out.println("3: Okoa 50");
            System.out.println("4: Okoa 20");
            System.out.println("5: Okoa 10");
            System.out.println("6: Okoa 5");
            System.out.println("7: Okoa 20 (900MB, 1 hr)");
            System.out.println("8: Okoa Internet");
            System.out.println("98: More");
            System.out.println("Enter your choice: ");
        } else if (menu == 2) {
            System.out.println("Menu 2 (More):");
            System.out.println("9: Okoa Minutes");
            System.out.println("10: Okoa SMS");
            System.out.println("11: Lipa Okoa");
            System.out.println("12: Check Balance");
            System.out.println("0: Back to Menu 1");
            System.out.println("Enter your choice: ");
        }
    }
}





	
