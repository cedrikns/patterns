package ru.tsedrik.state;

public class WaitingForMoneyState implements State{

    @Override
    public void deposit(CopyMachine copyMachine, int amount) {
        if (amount >= CopyMachine.PRINT_COST) {
            if (copyMachine.isDocumentChosen()){
                copyMachine.setState(new ReadyToPrintState());
            } else {
                copyMachine.setState(new WaitingForDeviceState());
            }
        } else {
            copyMachine.setState(new NotEnoughMoneyState());
        }
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
        throw new RuntimeException("Печать документа не доступна на данном этапе.");
    }

    @Override
    public void pickUpChange(CopyMachine copyMachine) {
        throw new RuntimeException("Выдача сдачи не доступна на данном этапе.");
    }
}
