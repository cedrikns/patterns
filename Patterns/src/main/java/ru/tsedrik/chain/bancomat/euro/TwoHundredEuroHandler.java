package ru.tsedrik.chain.bancomat.euro;

import ru.tsedrik.chain.bancomat.banknote.BanknoteHandler;

public class TwoHundredEuroHandler extends EuroHandlerBase {

    protected int value = 200;

    public TwoHundredEuroHandler(BanknoteHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected int getValue() {
        return value;
    }
}
