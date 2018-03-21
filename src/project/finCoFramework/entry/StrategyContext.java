package project.finCoFramework.entry;

public class StrategyContext {

    private EntryStrategy entryStrategy;
    public StrategyContext(EntryStrategy entryStrategy) {
        this.entryStrategy = entryStrategy;
    }

    public Double executeStrategy(Double currentBalance, Double amount) {
        return entryStrategy.newBalance(currentBalance, amount);
    }
}
