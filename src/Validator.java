public class Validator {
    public static void toValidateParam(String login, String password, String confirmPassword) {
        if (!login.matches("\\w{8,}") || login.length() > 20) {
           throw new WrongLoginException("login содержит недопустимые символы или > 20 знаков");
        } else if (!password.matches("\\w{8,}") || !login.equals(confirmPassword)) {
            throw new WrongPasswordException("password содержит недопустимые символы или > 20 знаков или password и confirmPassword не равны");
        }

    }
}
