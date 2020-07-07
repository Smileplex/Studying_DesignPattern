package DecoratorPattern;

public class VanillaLatte extends Beverage {
    public VanillaLatte() {
        super();
        description = "바닐라라뗴";
    }

    @Override
    public int cost() {
        return 0;
    }
}
