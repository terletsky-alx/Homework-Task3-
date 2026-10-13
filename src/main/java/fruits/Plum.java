package fruits;

public class Plum extends Fruit {
    public Plum(){}
    public Plum(double weight){
        super(weight);
    }

    @Override
    public double returnPrice(){
        return getWeight()*2;
    }
}
