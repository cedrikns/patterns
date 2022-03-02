package ru.tsedrik.state;

public interface State {

    void deposit(CopyMachine copyMachine, int amount);
    void chooseDevice(CopyMachine copyMachine);
    void chooseDocument(CopyMachine copyMachine);
    void print(CopyMachine copyMachine);
    void pickUpChange(CopyMachine copyMachine);
}
