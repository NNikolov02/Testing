public class Calculator {

    public Integer add(Integer a, Integer b) {

        return a + b;
    }

    public Integer mul(Integer a, Integer b) {

        return a * b;
    }

    public int[] array(int[] array) {

        int[] array1 = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j >= 0; j--) {
                array[i] = array1[j];
                i++;
            }

        }
        return array1;


    }


}