
package bsu.rfct.java.denisenya.lab1.var9;


public class Lab1 {


    public static void main(String[] args) {


        int itemsSoFar = 0;
        Food[] breakfast = new Food[20];
        for (String arg : args) {
            String[] parts = arg.split("/");
            if (parts[0].equals("Cheese")) {
                breakfast[itemsSoFar] = new Cheese();
            } else if (parts[0].equals("Apple")) {
                breakfast[itemsSoFar] = new Apple(parts[1]);
            } else if (parts[0].equals("Eggs")) {
                breakfast[itemsSoFar] = new Eggs(parts[1]);
            }
            itemsSoFar++;
        }


        for (Food item : breakfast) {
            if (item != null) {
                item.consume();
                System.out.println();
            }
        }
        System.out.println("Всего хорошего!");

        countFood(breakfast, new Cheese());
        countFood(breakfast, new Apple(""));
        countFood(breakfast, new Eggs("3"));
    }

    public static void countFood(Food[] foods, Food food) {
        int count = 0;
        for (Food f : foods) {
            if (f != null && f.equals(food)) {
                count++;
            }
        }
        System.out.println("There are " + count + " products of type " + food.getName() + " in the breakfast");
    }
}