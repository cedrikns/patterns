package ru.tsedrik.chain.bancomat.dollar;

import ru.tsedrik.chain.bancomat.banknote.BanknoteHandler;

public class TwentyDollarHandler extends DollarHandlerBase {

    protected int value = 20;

    public TwentyDollarHandler(BanknoteHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected int getValue() {
        return value;
    }
}
