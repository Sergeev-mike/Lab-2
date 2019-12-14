import java.util.ArrayList;

class PasswordGenerator {
    private Console console = new Console();
    private int checkInt() {
        String number;
        boolean flag = true;
        do {
            if (!flag) {
                console.log(2, "Введите натуральное число!");
            }
            while (!console.hasInt()) {
                    console.log(3, "Это не число!");
                    console.log(2, "Введите натуральное число!");
                console.readNext();
            }
            flag = false;
            number = console.readNext();
        } while (Integer.parseInt(number) <= 0);
        return Integer.parseInt(number);
    }

    ArrayList<Character> generate() {
        int length = this.checkInt();
        int var;
        ArrayList<Character> list = new ArrayList<>(length);
        for (int i = 0; i < length; i++) {
            var = (int) (Math.random() * 100) % 3;
            switch (var) {
                case 0:
                    list.add((char) (((int) (Math.random() * 1000) % 26) + 65));
                    break;
                case 1:
                    list.add((char) (((int) (Math.random() * 1000) % 26) + 97));
                    break;
                case 2:
                    list.add((char) ((int) (Math.random() * 10) + 48));
                    break;
            }
        }
        return list;
    }
}
