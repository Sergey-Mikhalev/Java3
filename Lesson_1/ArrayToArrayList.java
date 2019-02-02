package HW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayToArrayList<T> {
    T[] array;


    public ArrayToArrayList(T[] array) {
        this.array = array;
    }

    public void toArrayList(){
        ArrayList<T> arrayList = new ArrayList<T>(Arrays.asList(array));
    }
}

class ArrayToArrayListTest{
    public static void main(String[] args) {
        Integer[] arrInt = {1,2,3,4};
        String[] arrStr = {"1", "2", "3", "4"};

        ArrayToArrayList<Integer> atalInt = new ArrayToArrayList<Integer>(arrInt);
        ArrayToArrayList<String> atalStr = new ArrayToArrayList<String>(arrStr);
        atalInt.toArrayList();
        atalStr.toArrayList();

    }
}
