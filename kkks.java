
import java.util.Scanner;

public class kkks {

    public static void main(String[] args) {
        Scanner dog = new Scanner(System.in);
        System.out.println("-----------name registory system---------");
      System.out.print(" how many slots you need ? : ");
      int kokoko = dog.nextInt();
     String.valueOf(kokoko);
     String[] words = new String[kokoko];
     for(int i = 0 ; i < words.length ; i++){
        System.out.print("plase input the word you  want to fill up : " +i +":");
        words[i] = dog.next();
     }
    boolean isfound= true;

    while (isfound) {
        System.out.print("what word you want  to sarch for  the id ? : ");
        int uopString = dog.nextInt();
        dog.nextLine(); 
        System.out.println(" the word your looking for is : " +  words[uopString]);
        
        System.out.print("do you want to continue ? yes/ exit : ");
        String choiceString = dog.next();
        if (choiceString.equals("exit")) {
             isfound = false;
        }
        
     
    }

        dog.close();
    }
}