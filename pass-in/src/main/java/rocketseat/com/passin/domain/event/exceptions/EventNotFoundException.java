package rocketseat.com.passin.domain.event.exceptions;

public class EventNotFoundException extends RuntimeException{


    public EventNotFoundException (String message){
        //Super chama o construtor da super classe ou seja da classe que nós estendemos
        super(message);
    }
}
