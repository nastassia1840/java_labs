package bsu.rfct.java.denisenya.lab1.var9;
public class Apple extends Food{
    private final String size;

    public Apple(String size){
        super(" Яблоко");
        this.size = size;
    }

    @Override
    public void consume(){
        System.out.println(this + " Cъедено");
    }


    public String toString() {
        return super.toString() + " размера '" + size.toUpperCase() + "'";
    }

    public void calculateCalories() {
        if (!this.size.isEmpty() && !this.size.equals("Большое") && !this.size.equals("Среднее") && this.size.equals("Маленькое")) {
        }

    }
        }



