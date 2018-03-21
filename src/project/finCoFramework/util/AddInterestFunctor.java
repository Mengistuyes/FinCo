package project.finCoFramework.util;

import project.finCoFramework.util.Functor;

public class AddInterestFunctor implements Functor<Double, Double> {

    private Double newBalance = 0.0;
    @Override
    public Double addInterest(Double interest, Double balance) {
        return this.newBalance = balance + (balance * interest);
    }

}
