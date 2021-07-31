package ru.tsedrik.chain.bancomat.ruble;

import ru.tsedrik.chain.bancomat.banknote.BanknoteHandler;

public class FiveThousandRubleHandler extends RubleHandlerBase {
    protected int value = 5000;

    public FiveThousandRubleHandler(BanknoteHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected int getValue() {
        return value;
    }
}
