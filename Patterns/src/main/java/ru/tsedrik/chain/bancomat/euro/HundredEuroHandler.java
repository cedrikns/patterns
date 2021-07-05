package ru.tsedrik.chain.bancomat.euro;

import ru.tsedrik.chain.bancomat.banknote.BanknoteHandler;

public class HundredEuroHandler extends EuroHandlerBase {

    protected int value = 100;

    public HundredEuroHandler(BanknoteHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected int getValue() {
        return value;
    }
}
