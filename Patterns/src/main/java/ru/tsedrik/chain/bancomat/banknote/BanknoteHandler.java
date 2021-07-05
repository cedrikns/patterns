package ru.tsedrik.chain.bancomat.banknote;

import java.util.ArrayList;
import java.util.List;

/**
 * BanknoteHandler.
 *
 * @author Ilya_Sukhachev
 */
public abstract class BanknoteHandler {

    private BanknoteHandler nextHandler;

    protected BanknoteHandler(BanknoteHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public String validate(CurrencyType type, int amount) {

       List<Integer> data;
        String result = "";
        if ((type.equals(getCurrencyType())) && (amount >= getValue())){
            data = cash(amount);
            result = String.format("%s + %sx%s", result, getValue(), data.get(0));
            amount = data.get(1);
        }

        if (amount == 0) {
            return result;
        }

        if (nextHandler == null){
            return String.format("%s + %s не валидная сумма", result, amount);
        } else {
            return result + nextHandler.validate(type, amount);
        }
    }

    private List<Integer> cash(int value){
        List<Integer> data = new ArrayList<>();
        data.add(0, value / getValue());
        data.add(1, value % getValue());
        return data;
    }

    protected abstract int getValue();

    protected abstract CurrencyType getCurrencyType();

}
