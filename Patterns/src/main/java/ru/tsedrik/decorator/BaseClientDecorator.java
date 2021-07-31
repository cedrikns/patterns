package ru.tsedrik.decorator;

public abstract class BaseClientDecorator implements Client{
    private Client client;

    public BaseClientDecorator(Client client) {
        this.client = client;
    }

    @Override
    public Message sendMessage(Message message) {
        return client.sendMessage(message);
    }

    @Override
    public void receiveMessage(Message message) {
        client.receiveMessage(message);
    }
}
