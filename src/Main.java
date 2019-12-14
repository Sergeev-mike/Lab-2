import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PasswordGenerator password = new PasswordGenerator();
        Console console = new Console();
        console.out("Введите длину вашего пароля: ");
        ArrayList pass = password.generate();
        console.out("Ваш пароль ниже:\n");
        console.out(pass);
        console.out("\n");
        console.log(1,"");
    }
}