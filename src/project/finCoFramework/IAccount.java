package project.finCoFramework;

public interface IAccount<T, R> {
public void addInterest(Functor<T,R> addInterestFunctor);
public Double getBalance(IAccount account);
}
