package ru.tsedrik.chain.bancomat;

import ru.tsedrik.chain.bancomat.banknote.CurrencyType;

/**
 * Main.
 *
 * @author Ilya_Sukhachev
 */
public class Main {

    public static void main(String[] args) {
        Bancomat bancomat = new Bancomat();
        System.out.println(bancomat.validate(CurrencyType.RUB, 8833));

    }
}
