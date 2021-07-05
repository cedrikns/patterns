package ru.tsedrik.chain.bancomat.euro;

import ru.tsedrik.chain.bancomat.banknote.BanknoteHandler;
import ru.tsedrik.chain.bancomat.banknote.CurrencyType;

public abstract class EuroHandlerBase extends BanknoteHandler {

    protected CurrencyType type = CurrencyType.EUR;

    protected EuroHandlerBase(BanknoteHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected CurrencyType getCurrencyType() {
        return type;
    }
}
