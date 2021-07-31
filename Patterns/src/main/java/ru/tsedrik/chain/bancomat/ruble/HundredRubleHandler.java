package ru.tsedrik.chain.bancomat.ruble;

import ru.tsedrik.chain.bancomat.banknote.BanknoteHandler;

public class HundredRubleHandler extends RubleHandlerBase {
    protected int value = 100;

    public HundredRubleHandler(BanknoteHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected int getValue() {
        return value;
    }
}
