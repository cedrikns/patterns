package ru.tsedrik.factory.volvo;

import ru.tsedrik.factory.Suspension;
import ru.tsedrik.factory.SuspensionStiffness;

public class VolvoSuspension extends Suspension {
    private SuspensionStiffness stiffness;

    protected VolvoSuspension(SuspensionStiffness stiffness) {
        this.stiffness = stiffness;
    }

    @Override
    public SuspensionStiffness getStiffness() {
        return stiffness;
    }
}
