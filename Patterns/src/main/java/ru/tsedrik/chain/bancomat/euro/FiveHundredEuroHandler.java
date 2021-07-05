package ru.tsedrik.chain.bancomat.euro;

import ru.tsedrik.chain.bancomat.banknote.BanknoteHandler;

public class FiveHundredEuroHandler extends EuroHandlerBase {

    protected int value = 500;

    public FiveHundredEuroHandler(BanknoteHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected int getValue() {
        return value;
    }
}
