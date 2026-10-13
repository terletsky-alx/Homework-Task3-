package fruits;

public class Apple extends Fruit{

    public Apple(double weight){
        super(weight);
    }
    public Apple(){}

    @Override
    public double returnPrice(){
        return getWeight()*1.5;
    }
}
