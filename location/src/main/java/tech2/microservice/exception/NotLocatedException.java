package tech2.microservice.exception;


public class NotLocatedException extends RuntimeException{
    public NotLocatedException(String message){
        super(message);
    }
}
