package ex_17_Arrays;

public class Lab122_Array_Find_Element_Linear_Search {
    public static void main(String[] args) {

        int[] marks = {87, 54, 99, 52, 88};

        // FInd the target 54 and give index ?

        int target = 54;

        for (int i = 0; i < marks.length; i++) {
            if (target == marks[i])
                System.out.println(i);

        }

    }
}
