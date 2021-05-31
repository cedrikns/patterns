package ru.tsedrik.factory.ford;

import ru.tsedrik.factory.Suspension;
import ru.tsedrik.factory.SuspensionStiffness;

public class FordSuspension extends Suspension {
    private SuspensionStiffness stiffness;

    protected FordSuspension(SuspensionStiffness stiffness) {
        this.stiffness = stiffness;
    }

    @Override
    public SuspensionStiffness getStiffness() {
        return stiffness;
    }
}
