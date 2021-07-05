package ru.tsedrik.chain.bancomat.ruble;

import ru.tsedrik.chain.bancomat.banknote.BanknoteHandler;

public class FiveHundredRubleHandler extends RubleHandlerBase {
    protected int value = 500;

    public FiveHundredRubleHandler(BanknoteHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected int getValue() {
        return value;
    }
}
