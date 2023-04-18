public class main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(5,4));
        StringHelper word = new StringHelper();

        System.out.println(word.capitalizeFirst("letter"));
        System.out.println(word.isPalindrome("racecar"));
    }
}
