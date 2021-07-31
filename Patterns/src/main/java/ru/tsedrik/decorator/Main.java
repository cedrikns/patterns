package ru.tsedrik.decorator;

public class Main {
    public static void main(String[] args) {
        Message message = new Message("Сова", "Жаворонок", "Привет, уже проснулся?");

        Client client = new SimpleClient();
        Message sendedMsg = client.sendMessage(message);
        client.receiveMessage(sendedMsg);

        client = new HideUserDecorator(client);
        sendedMsg = client.sendMessage(message);
        client.receiveMessage(sendedMsg);

        client = new EncryptMessageDecorator(client);
        sendedMsg = client.sendMessage(message);
        client.receiveMessage(sendedMsg);
    }
}
