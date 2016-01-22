package org.dave3heaton.diceengine.game.aeg.seventhsea;

import org.dave3heaton.diceengine.engine.ExplodingPolynomialDie;
import org.dave3heaton.diceengine.engine.NumberGenerator;
import org.dave3heaton.diceengine.engine.RandomNumberGenerator;

public class SeventhSeaDie extends ExplodingPolynomialDie {

    private boolean isExploding;

    public SeventhSeaDie(boolean exploding) {
        this(exploding, new RandomNumberGenerator());
    }

    protected SeventhSeaDie(boolean exploding, NumberGenerator numberGenerator) {
        super(10, numberGenerator);
        this.isExploding = exploding;
    }

    @Override
    public void roll() {
        if (isExploding) {
            super.roll();
        } else {
            this.facingNumber = numberGenerator.getRandomNumberToMaxValue(getNumberOfSides());
        }
    }

}