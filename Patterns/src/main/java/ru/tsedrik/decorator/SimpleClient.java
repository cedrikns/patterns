package ru.tsedrik.decorator;

public class SimpleClient implements Client{

    @Override
    public Message sendMessage(Message message) {
        System.out.println("Отправленное сообщение: " + message);
        return message;
    }

    @Override
    public void receiveMessage(Message message) {
        System.out.println("Полученное сообщение: " + message);
    }
}
