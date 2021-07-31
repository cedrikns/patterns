package ru.tsedrik.decorator;

public interface Client {
    Message sendMessage(Message message);
    void receiveMessage(Message message);
}
