package fruits;

public class Apple extends Fruit{
    public Apple(){}
    public Apple(double weight){
        super(weight);
    }

    @Override
    public double returnPrice(){
        return getWeight()*1.5;
    }
}
