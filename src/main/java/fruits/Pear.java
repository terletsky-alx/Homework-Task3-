package fruits;

public class Pear extends Fruit{
    public Pear(){}
    public Pear(double weight){
        super(weight);
    }

    @Override
    public double returnPrice(){
        return getWeight()*1.8;
    }
}
