public class Calculator {

    public Integer add(Integer a, Integer b) {

        return a + b;
    }

    public Integer mul(Integer a, Integer b) {

        return a * b;
    }

    public int [] Reversed(int [] array) {
        int[] array1 = new int[array.length];
        for (int i = 0; i <= array.length; i++) {
            for (int j = array.length - 1; j >= 0; j--) {
                array1[j] = array[i];
                i++;
            }
            return array1;
        }
        return array1;
    }


}