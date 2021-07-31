package ru.tsedrik.decorator;

import java.util.Base64;

public class HideUserDecorator extends BaseClientDecorator{

    public HideUserDecorator(Client client) {
        super(client);
    }

    @Override
    public Message sendMessage(Message message) {
        message.setFrom(hideUser(message.getFrom()));
        message.setTo(hideUser(message.getTo()));
        return super.sendMessage(message);
    }

    @Override
    public void receiveMessage(Message message) {
        message.setFrom(unhideUser(message.getFrom()));
        message.setTo(unhideUser(message.getTo()));
        super.receiveMessage(message);
    }

    private String hideUser(String user){
        return Base64.getEncoder().encodeToString(user.getBytes());
    }

    private String unhideUser(String user){
        return new String(Base64.getDecoder().decode(user));
    }
}
