package project.finCoFramework;

public class addInterestFunctor implements Functor<Double,Double> {
	Double newBalance=0.0;
	@Override
	public Double addInterest(Double interest, Double balance) {
		return this.newBalance=balance+(balance * interest);	
	}

}
