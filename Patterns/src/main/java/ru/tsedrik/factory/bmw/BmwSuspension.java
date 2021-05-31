package ru.tsedrik.factory.bmw;

import ru.tsedrik.factory.Suspension;
import ru.tsedrik.factory.SuspensionStiffness;

public class BmwSuspension extends Suspension {
    private SuspensionStiffness stiffness;

    protected BmwSuspension(SuspensionStiffness stiffness) {
        this.stiffness = stiffness;
    }

    @Override
    public SuspensionStiffness getStiffness() {
        return stiffness;
    }
}
