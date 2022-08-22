package tech2.microservice.exception;


public class CreateRequestException extends RuntimeException{
    public CreateRequestException(String message){
        super(message);
    }
}
