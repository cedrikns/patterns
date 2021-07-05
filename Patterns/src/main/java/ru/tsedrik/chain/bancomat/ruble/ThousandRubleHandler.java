package ru.tsedrik.chain.bancomat.ruble;

import ru.tsedrik.chain.bancomat.banknote.BanknoteHandler;

public class ThousandRubleHandler extends RubleHandlerBase {
    protected int value = 1000;

    public ThousandRubleHandler(BanknoteHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected int getValue() {
        return value;
    }
}
