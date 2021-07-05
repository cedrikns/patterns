package ru.tsedrik.chain.bancomat.euro;

import ru.tsedrik.chain.bancomat.banknote.BanknoteHandler;

public class TwentyEuroHandler extends EuroHandlerBase {

    protected int value = 20;

    public TwentyEuroHandler(BanknoteHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected int getValue() {
        return value;
    }
}
