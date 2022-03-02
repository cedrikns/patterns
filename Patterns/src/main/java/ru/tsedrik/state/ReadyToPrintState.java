package ru.tsedrik.state;

public class ReadyToPrintState implements State{

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
        throw new RuntimeException("Выбор документа не доступен на данном этапе.");
    }

    @Override
    public void print(CopyMachine copyMachine) {
        copyMachine.setState(new WaitingForDocumentState());
    }

    @Override
    public void pickUpChange(CopyMachine copyMachine) {
        copyMachine.setState(new WaitingForMoneyState());
    }
}
