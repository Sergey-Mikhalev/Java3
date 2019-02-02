package HW.Fruit;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    ArrayList<T> box;


    public Box() {

    }

    public Box(ArrayList<T> box) {
        this.box = new ArrayList<T>();
    }

    public float getWeightBox() {
        float sum = 0.0f;
        for (T o : box) {
            sum += o.getWeight();
        }
        return sum;
    }


}

class Test {
    public static void main(String[] args) {
            ArrayList<Orange> oranges = new ArrayList<Orange>();
        oranges.add(0, 6);

        Box<Orange> box = new Box<Orange>(oranges);

    }
}
