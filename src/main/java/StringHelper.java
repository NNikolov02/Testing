public class StringHelper {

    public String capitalizeFirst(String a){
        String letter = String.valueOf(a.charAt(0));
        String upperCase = letter.toUpperCase();

        return a.replace(letter,upperCase);



    }
    public boolean isPalindrome(String a){
        String b = "";
        for(int i = a.length() -1;i >=0;i--){
            b += a.charAt(i);

            }
        if(a.equals(b)){
            return true;
        }
        return false;
        }

        }





