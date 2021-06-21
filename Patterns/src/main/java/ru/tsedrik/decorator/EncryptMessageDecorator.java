package ru.tsedrik.decorator;

public class EncryptMessageDecorator extends BaseClientDecorator{

    private String prefix = "<encrypted text>";
    private String postfix = "</>";

    public EncryptMessageDecorator(Client client) {
        super(client);
    }

    @Override
    public Message sendMessage(Message message) {
        message.setText(prefix + message.getText() + postfix);
        return super.sendMessage(message);
    }

    @Override
    public void receiveMessage(Message message) {
        String text = message.getText();
        if (text.startsWith(prefix)){
            int beginIdx = text.indexOf(">") + 1;
            int endIdx = text.lastIndexOf("<");
            text = text.substring(beginIdx, endIdx);
            message.setText(text);
        }
        super.receiveMessage(message);
    }
}
