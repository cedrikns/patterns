package ru.tsedrik.state;

public class WaitingForDocumentState implements State{

    @Override
    public void deposit(CopyMachine copyMachine, int amount) {
        //Nothing to do
    }

    @Override
    public void chooseDevice(CopyMachine copyMachine) {
        throw new RuntimeException("Выбор устройста не доступен на данном этапе.");
    }

    @Override
    public void chooseDocument(CopyMachine copyMachine) {
        copyMachine.setState(new ReadyToPrintState());
    }

    @Override
    public void print(CopyMachine copyMachine) {
        throw new RuntimeException("Печать документа не доступна на данном этапе.");
    }

    @Override
    public void pickUpChange(CopyMachine copyMachine) {
        copyMachine.setState(new WaitingForMoneyState());
    }
}
