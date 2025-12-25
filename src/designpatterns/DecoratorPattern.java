package designpatterns;

interface Coffee{
    String getDescription();
    double getCost();
}

class PlainCoffee implements Coffee{

    @Override
    public String getDescription(){
        return "Plain Coffee";
    }
    @Override
    public double getCost(){
        return 2.0;
    }
}

abstract class CoffeeDecorator implements Coffee{

    protected   Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee decoratedCoffee){
        this.decoratedCoffee = decoratedCoffee;
    }

    @Override
    public String getDescription(){
        return decoratedCoffee.getDescription();
    }
    @Override
    public double getCost(){
        return decoratedCoffee.getCost();
    }
}

class MilkDecorator extends CoffeeDecorator{

    public MilkDecorator(Coffee decoratedCoffee){
        super(decoratedCoffee);
    }
    @Override
    public String getDescription(){
        return decoratedCoffee.getDescription() + ", Milk";
    }
    @Override
    public double getCost(){
        return decoratedCoffee.getCost() + 0.5;
    }
}
class SugarDecorator extends CoffeeDecorator{

    public SugarDecorator(Coffee decoratedCoffee){
        super(decoratedCoffee);
    }
    @Override
    public String getDescription(){
        return decoratedCoffee.getDescription() + ", Sugar";
    }
    @Override
    public double getCost(){
        return decoratedCoffee.getCost() + 0.2;
    }
}

public class DecoratorPattern {

    public static void main(String[] args) {
        //Plai Coffee
        Coffee coffee = new PlainCoffee();
        System.out.println("Description: " + coffee.getDescription());
        System.out.println("Cost: " + coffee.getCost());

        //Milk Coffee
        Coffee milkCoffee = new MilkDecorator(new PlainCoffee());
        System.out.println("Description: " + milkCoffee.getDescription());
        System.out.println("Cost: " + milkCoffee.getCost());

        //Coffee with Sugar & Milk
        Coffee sugarMilkCoffee = new SugarDecorator(new MilkDecorator(new PlainCoffee()));
        System.out.println("Description: " + sugarMilkCoffee.getDescription());
        System.out.println("Cost: " + sugarMilkCoffee.getCost());

    }
}
