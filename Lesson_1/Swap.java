package HW;

// 1. Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);

public class Swap<T> {
    private T[] arr;
    private int firstIndex;
    private int secondIndex;


    public Swap(T[] arr, int firstIndex, int secondIndex) {
        this.arr = arr;
        this.firstIndex = firstIndex;
        this.secondIndex = secondIndex;

    }

    public void arraySwap() {
        T variable = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = variable;

        System.out.println(arr);

    }

    //вариант для рандомного обмена местами двух элементов массива
    public void randomArrSwap() {


        int i1 = (int) (Math.random() * arr.length);
        int i2 = (int) (Math.random() * arr.length);

        T variable = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = variable;
        System.out.println(arr);


    }

}


class SwapTest {
    public static void main(String[] args) {
        Integer[] intArr = {1, 4, 5, 6};
        Swap<Integer> swap = new Swap<Integer>(intArr, 1, 2);
        swap.arraySwap();
        swap.randomArrSwap();

    }
}