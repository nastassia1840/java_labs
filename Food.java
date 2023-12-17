package bsu.rfct.java.denisenya.lab1.var9;
public class Food implements bsu.rfct.java.denisenya.lab1.var9.Consumable {
    public String getName() {
        return name;
    }

    String name;
    public Food(String name)
    {
        this.name = name;
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof Food)) return false; // если объект не экземпляр класса или подкласса
        if (name==null || ((Food)arg0).name==null) return false;
        return name.equals(((Food)arg0).name);
    }
    //
    public String toString()
    {
        return name;
    }


    @Override
    public void consume() {

    }
}

