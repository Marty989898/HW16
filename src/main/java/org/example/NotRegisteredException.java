package org.example;

public class NotRegisteredException extends  RuntimeException{
    public NotRegisteredException(String playerName){
        super("Игрок с Именем" + playerName + "не найден");
    }
}
