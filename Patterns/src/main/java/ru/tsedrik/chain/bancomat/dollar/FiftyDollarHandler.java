package ru.tsedrik.chain.bancomat.dollar;

import ru.tsedrik.chain.bancomat.banknote.BanknoteHandler;

/**
 * HundredDollarHandler.
 *
 * @author Ilya_Sukhachev
 */
public class FiftyDollarHandler extends DollarHandlerBase {

    protected int value = 50;

    public FiftyDollarHandler(BanknoteHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected int getValue() {
        return value;
    }
}
