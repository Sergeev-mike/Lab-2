import java.util.ArrayList;

class PasswordGenerator {

    void generate() {
        Console console = new Console();
        int length = console.checkInt();
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
        console.Console(list);
    }
}
