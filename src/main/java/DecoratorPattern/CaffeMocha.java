package DecoratorPattern;

public class CaffeMocha extends Beverage {
    public CaffeMocha() {
        super();
        description = "카페모카";
    }

    @Override
    public int cost() {
        return 0;
    }
}

