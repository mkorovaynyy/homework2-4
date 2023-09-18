public class WrongPasswordException extends WrongLoginException{
    public WrongPasswordException(String message) {
        super(message);
    }
}
