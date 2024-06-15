package rocketseat.com.passin.domain.checkin.Exceptions;

public class CheckInAlreadyExistsException extends  RuntimeException{

    public CheckInAlreadyExistsException(String message){
        super(message);
    }
}
