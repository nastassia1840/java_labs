package bsu.rfct.java.denisenya.lab1.var9;
/*
public class Eggs extends Food {
    private final int number;

    public Eggs(int number) {

        super(" Яйца ");
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public boolean equals(Object arg0) {
        if (super.equals(arg0)) { // Шаг 1
            if (!(arg0 instanceof Eggs)) return false;
            return number;
        } else
            return false;
    }

    public String toString() {
        return super.toString() + " количество ' " + getNumber().toUpperCase() + " ' ";
    }

    public void consume() {
        System.out.println(this + " съедено");
    }
    public void calculateCalories() {
    }
}
*/

class Eggs extends Food {
    private final String number;

    public Eggs(String  number) {
        super("Яйца");
        this.number = number;
    }

    public String  getNumber() {
        return number;
    }

    @Override
    public void consume() {
        System.out.println(this + " в количестве " + getNumber() + " съедено");
    }
    public void calculateCalories() {
    }

}