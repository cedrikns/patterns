package ru.tsedrik.adapter.orm.second;

public class SecondOrmImpl implements SecondOrm{

    private SecondOrmContext context;

    public SecondOrmImpl(SecondOrmContext context) {
        this.context = context;
    }

    @Override
    public SecondOrmContext getContext() {
        return context;
    }
}
