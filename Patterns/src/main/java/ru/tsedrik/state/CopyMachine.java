package ru.tsedrik.state;

public class CopyMachine {
    public final static int PRINT_COST = 10;

    private State state;
    private int amount;
    private boolean isDeviceChosen;
    private boolean isDocumentChosen;

    public CopyMachine(){
        state = new WaitingForMoneyState();
    }

    public void deposit(int amount){
        this.amount += amount;
        state.deposit(this, amount);
        System.out.println("Ваш депозит: " + this.amount + " руб.");
    }

    public void chooseDevice(String deviceName){
        state.chooseDevice(this);
        isDeviceChosen = true;
        System.out.println("Документ будет распечатан из источника: " + deviceName);
    }

    public void chooseDocument(String documentName){
        state.chooseDocument(this);
        System.out.println("Документ: " + documentName);
        isDocumentChosen = true;
    }

    public void print(){
        if (amount >= PRINT_COST){
            state.print(this);
            amount -= PRINT_COST;
            isDocumentChosen = false;
            System.out.println("Документ распечатан");
        } else {
            state.deposit(this, amount);
            System.out.println("Недостаточно средств для печати");
        }
    }

    public void pickUpChange(){
        state.pickUpChange(this);
        isDocumentChosen = false;
        isDeviceChosen = false;
        System.out.println("Заберите свою сдачу.");
    }

    public void cancel(){
        if (!(state instanceof WaitingForMoneyState)){
            System.out.println("Печать отменена.");
            if (amount > 0){
                System.out.println("Заберите свои деньги.");
                amount = 0;
            }
            state.pickUpChange(this);
        }
        isDocumentChosen = false;
        isDeviceChosen = false;
    }

    public State getState() {
        return state;
    }

    protected void setState(State state) {
        this.state = state;
    }

    public boolean isDeviceChosen() {
        return isDeviceChosen;
    }

    public boolean isDocumentChosen() {
        return isDocumentChosen;
    }
}
