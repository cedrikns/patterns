package ru.tsedrik.state;

public class Main {
    public static void main(String[] args) {
        CopyMachine copyMachine = new CopyMachine();
        copyMachine.cancel();
        System.out.println("-------------------------");
        copyMachine.deposit(15);
        copyMachine.cancel();
        System.out.println("-------------------------");
        copyMachine.deposit(15);
        copyMachine.chooseDevice("wi-fi");
        copyMachine.chooseDocument("Doc.txt");
        copyMachine.print();
        copyMachine.print();
        copyMachine.deposit(5);
        copyMachine.print();
        copyMachine.print();
        copyMachine.pickUpChange();
        System.out.println("-------------------------");

    }
}
