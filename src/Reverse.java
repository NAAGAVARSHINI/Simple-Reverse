import java.util.Scanner;

public class Reverse {
    static String reverse(String str){
        char[] strarray = str.toCharArray();
        int i =0;
        int j=strarray.length - 1;
        while(i<j){
            char temp = strarray[i];
            strarray[i]=strarray[j];
            strarray[j]=temp;
            i++;
            j--;
        }
        return new String(strarray);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(reverse(str));
    }
}
