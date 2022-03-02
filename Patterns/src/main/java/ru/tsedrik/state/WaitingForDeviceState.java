package ru.tsedrik.state;

public class WaitingForDeviceState implements State{

    @Override
    public void deposit(CopyMachine copyMachine, int amount) {
        //Nothing to do
    }

    @Override
    public void chooseDevice(CopyMachine copyMachine) {
        copyMachine.setState(new WaitingForDocumentState());
    }

    @Override
    public void chooseDocument(CopyMachine copyMachine) {
        throw new RuntimeException("Выбор документа не доступен на данном этапе.");
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
