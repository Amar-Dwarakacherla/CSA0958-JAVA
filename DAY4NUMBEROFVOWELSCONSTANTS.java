import java.util.*;

public class DAY4NUMBEROFVOWELSCONSTANTS {
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a WORD : ");
        String input = sc.nextLine();

        String vow = "";
        String conso = "";

        for(int i = 0;i<input.length();i++){
            if((input.charAt(i) == 'A' )||(input.charAt(i) == 'E' ) ||(input.charAt(i) == 'I' )||(input.charAt(i) == 'O' )||(input.charAt(i) == 'U' )
                    ||(input.charAt(i) == 'a' )||(input.charAt(i) == 'e' )||(input.charAt(i) == 'i' )||(input.charAt(i) == 'o' )||(input.charAt(i) == 'u' )){
                vow = vow + input.charAt(i);
            }
            else{
                conso = conso + input.charAt(i);
            }
        }
        System.out.println("Consonants : " + conso);
        System.out.println("Vowels : " + vow);
    }
}
