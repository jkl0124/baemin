package exercise.exception;

public class DuplicateMemberIdException extends RuntimeException{
    private String message;

    @Override
    public String getMessage() {
        return this.message;
    }

    public DuplicateMemberIdException(String message) {
        this.message = message;
    }
}
