import java.util.ArrayList;
import java.util.Scanner;

class Console {

    void Console(String msg) {
        System.out.print(msg);
    }

    void Console(ArrayList<Character> msg) {
        Console("Your password is:");
        for (int i = 0; i < msg.size(); i++) System.out.print(msg.get(i));
    }

    int checkInt() {
        Scanner scan = new Scanner(System.in);
        String number;
        do {
            System.out.print("Please enter a positive number!\nEnter your password length:  ");
            while (!scan.hasNextInt()) {
                Console("That not a number!\n");
                Console("Please enter a positive number!\nEnter your password length:  ");
                scan.nextLine();
            }
            number = scan.next();
        } while (Integer.parseInt(number) <= 0);
        scan.close();
        return Integer.parseInt(number);
    }
}