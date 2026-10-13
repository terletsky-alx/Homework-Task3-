package fruits;

public class Pear extends Fruit{

    public Pear(double weight){
        super(weight);
    }
    public Pear(){}

    @Override
    public double returnPrice(){
        return getWeight()*1.8;
    }
}
