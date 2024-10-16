import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Enter String");
        String str = new Scanner(System.in).nextLine();

        int wordCounter = 1;
        int i,j;
        for ( i = 0; i < str.length(); i++) {
            for(j=i+1; j < str.length(); j++) {
                if(str.charAt(i) == str.charAt(j)) {
                    wordCounter++;
                }
                else break;
            }//end of for j
            System.out.print(str.charAt(i)+""+wordCounter);
            wordCounter = 1;
            i = j-1;
        }//end of fori

    }//end ofmain

}//end of class