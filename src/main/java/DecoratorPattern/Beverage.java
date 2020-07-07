package DecoratorPattern;

public abstract class Beverage {
    public String description = "no title";

    public abstract int cost();

    public String getDescription(){
        return description;
    }
}
