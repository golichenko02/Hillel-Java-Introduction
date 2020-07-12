package org.abstr;

public class FinancialDirector extends Director {

    public FinancialDirector(String name) {
        super(name);
    }

    @Override
    public boolean implementContract() {
        return false;
    }
}
