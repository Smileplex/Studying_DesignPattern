package StrategyPattern;

public class MailImporter {
    private MailImportStrategy importStrategy;

    public MailImporter(MailImportStrategy importStrategy) {
        this.importStrategy = importStrategy;
    }

    public void changeStrategy(MailImportStrategy importStrategy){
        this.importStrategy = importStrategy;
    }

    public void imports(){
        importStrategy.execute();
    }
}
