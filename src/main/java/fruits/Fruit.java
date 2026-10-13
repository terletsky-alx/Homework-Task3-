package fruits;

public abstract class Fruit {
    private double weight;

    public Fruit (){}
    public Fruit (double weight){
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
     public final void printManufacturerInfo(){
         System.out.println("Made in RB");
     }

     public abstract double returnPrice();
}
