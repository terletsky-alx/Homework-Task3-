package passwordChecker;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Тест 1: Корректные данные ---");
        boolean result1 = Validator.validate("java_user1", "securePass_99", "securePass_99");
        System.out.println("Результат: " + result1 + "\n");

        System.out.println("--- Тест 2: Неверный логин (кириллица и длина) ---");
        boolean result2 = Validator.validate("пользователь_очень_длинный_логин", "password123", "password123");
        System.out.println("Результат: " + result2 + "\n");

        System.out.println("--- Тест 3: Неверный пароль (спецсимволы) ---");
        boolean result3 = Validator.validate("good_login", "pass!word#", "pass!word#");
        System.out.println("Результат: " + result3 + "\n");

        System.out.println("--- Тест 4: Пароли не совпадают ---");
        boolean result4 = Validator.validate("good_login", "password123", "password321");
        System.out.println("Результат: " + result4);
    }
}
