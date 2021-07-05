package ru.tsedrik.chain.bancomat.dollar;

import ru.tsedrik.chain.bancomat.banknote.BanknoteHandler;
import ru.tsedrik.chain.bancomat.banknote.CurrencyType;

/**
 * TenRubleHandler.
 *
 * @author Ilya_Sukhachev
 */
public abstract class DollarHandlerBase extends BanknoteHandler {

    protected CurrencyType type = CurrencyType.USD;

    protected DollarHandlerBase(BanknoteHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected CurrencyType getCurrencyType() {
        return type;
    }
}
