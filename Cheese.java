package bsu.rfct.java.denisenya.lab1.var9;
public class Cheese extends Food{
    public Cheese(){
        super ("Сыр");
    }

    @Override
    public void consume(){
        System.out.println(this +  " Съеден ");
    }


}
