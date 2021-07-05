package ru.tsedrik.chain.bancomat;

import ru.tsedrik.chain.bancomat.banknote.BanknoteHandler;
import ru.tsedrik.chain.bancomat.banknote.CurrencyType;
import ru.tsedrik.chain.bancomat.dollar.FiftyDollarHandler;
import ru.tsedrik.chain.bancomat.dollar.HundredDollarHandler;
import ru.tsedrik.chain.bancomat.dollar.TenDollarHandler;
import ru.tsedrik.chain.bancomat.dollar.TwentyDollarHandler;
import ru.tsedrik.chain.bancomat.euro.*;
import ru.tsedrik.chain.bancomat.ruble.FiveHundredRubleHandler;
import ru.tsedrik.chain.bancomat.ruble.FiveThousandRubleHandler;
import ru.tsedrik.chain.bancomat.ruble.HundredRubleHandler;
import ru.tsedrik.chain.bancomat.ruble.ThousandRubleHandler;

/**
 * Bancomat.
 *
 * @author Ilya_Sukhachev
 */
public class Bancomat {
    private BanknoteHandler handler;

    public Bancomat() {
        handler = new HundredRubleHandler(null);
        handler = new FiveHundredRubleHandler(handler);
        handler = new ThousandRubleHandler(handler);
        handler = new FiveThousandRubleHandler(handler);
        handler = new TenDollarHandler(handler);
        handler = new TwentyDollarHandler(handler);
        handler = new FiftyDollarHandler(handler);
        handler = new HundredDollarHandler( handler);
        handler = new TenEuroHandler( handler);
        handler = new TwentyEuroHandler( handler);
        handler = new FiftyEuroHandler( handler);
        handler = new HundredEuroHandler( handler);
        handler = new TwoHundredEuroHandler( handler);
        handler = new FiveHundredEuroHandler( handler);
    }

    public String validate(CurrencyType type, int amount) {
        if (amount <= 0){
            return "Сумма для выдачи должна быть больше 0";
        }
        String result = handler.validate(type, amount);
        if (result.startsWith(" + ")){
            result = result.substring(3);
        }
        return String.format("%s %s = %s", amount, type, result);
    }

}
