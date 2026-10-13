package fruits;

public class Plum extends Fruit {

    public Plum(double weight){
        super(weight);
    }
    public Plum(){}

    @Override
    public double returnPrice(){
        return getWeight()*2;
    }
}
