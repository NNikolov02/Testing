public class StringHelper {

    public String capitalizeFirst(String a){
        String letter = String.valueOf(a.charAt(0));
        String upperCase = letter.toUpperCase();

        return a.replace(letter,upperCase);



    }

    public void Dublicate(String a){
        for(int i = 0;i <=a.length()-2;i++){
            if(a.charAt(i) == a.charAt(i)){
                System.out.println(a.charAt(i));
            }
        }

    }
    public boolean Palindrome(String a){
       for(int i = 0 ; i< a.length() /2;i++){
           if(a.charAt(i) != a.charAt(a.length() -1 -i)){
               return false;
           }
       }
       return true;
    }


}