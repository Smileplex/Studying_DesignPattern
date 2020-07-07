package DecoratorPattern;

public class Cream extends CondimentDecorator {
    private Beverage beverage;

    public Cream(Beverage beverage) {
        super();
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        return beverage.cost() + 800;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 크림";
    }
}
