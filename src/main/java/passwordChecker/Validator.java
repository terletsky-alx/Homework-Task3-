package passwordChecker;

public class Validator {

    public static boolean validate(String login, String password, String confirmPassword) {
        try {
            if (login == null || login.length() >= 20 || !login.matches("^[a-zA-Z0-9_]+$")) {
                throw new WrongLoginException("Логин должен содержать только латинские буквы, цифры и знак подчеркивания, а его длина должна быть меньше 20 символов.");
            }

            if (password == null || password.length() >= 20 || !password.matches("^[a-zA-Z0-9_]+$")) {
                throw new WrongPasswordException("Пароль должен содержать только латинские буквы, цифры и знак подчеркивания, а его длина должна быть меньше 20 символов.");
            }

            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("Пароль и подтверждение пароля должны быть равны.");
            }

            return true;

        } catch (WrongLoginException e) {
            System.out.println("Ошибка авторизации (логин): " + e.getMessage());
            return false;
        } catch (WrongPasswordException e) {
            System.out.println("Ошибка авторизации (пароль): " + e.getMessage());
            return false;
        }
    }
}