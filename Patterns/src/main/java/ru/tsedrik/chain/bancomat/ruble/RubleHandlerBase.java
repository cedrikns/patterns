package ru.tsedrik.chain.bancomat.ruble;

import ru.tsedrik.chain.bancomat.banknote.BanknoteHandler;
import ru.tsedrik.chain.bancomat.banknote.CurrencyType;

public abstract class RubleHandlerBase extends BanknoteHandler {

    protected CurrencyType type = CurrencyType.RUB;

    protected RubleHandlerBase(BanknoteHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected CurrencyType getCurrencyType() {
        return type;
    }
}
