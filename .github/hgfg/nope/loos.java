import java.util.Scanner;

class japanese {
    String name ;
    String kanji ;
    String meaning ;
    int jlpt ;
    boolean ismasterd ;

    japanese (String name ,String kanji, String meaning, int jlpt ){
        this.kanji= kanji;
        this.jlpt= jlpt;
        this.meaning = meaning;
        this.name= name ;
    }  void work(){
        System.out.print(name + "is learnig " + kanji + "meaning =  " + meaning + "and the jlpt of this level is :  N" + jlpt);
        
    }
} 

public class loos {

        public static void main(String[] args) {
            Scanner input =new Scanner(System.in);

            System.out.print("plase input the user name : ");
            String targetname = input.nextLine();
            System.out.print("please input how any kanji are you learning ? in number  : " + targetname + " :  ");
            int slots = input.nextInt();

          

            japanese newdeck[]= new japanese[slots];

            // loop for feeling the kanji 

            for ( int i = 0 ; i < newdeck.length; i ++){
                System.out.print( " please input the kanji : ");
                String k = input.nextLine();
                input.nextLine();
                System.out.print("please add the meaning of the kanji : " + " : " );
                String m = input.nextLine();
                System.out.print(" please input the jlpt level for the kanji : " );
                int j = input.nextInt();
                input.nextInt();
                newdeck[i] = new japanese(targetname, k, m, j);

            } 
            boolean isfound = true;
            System.out.println(" plese input the kanji to track the progress : ");
            String result = input.nextLine();
          for ( int  i = 0 ; i < newdeck.length; i ++){
              if (newdeck[i].kanji.equals(result)) {
                System.out.println(" found the kanji : " + result);
                newdeck[i].work();
                isfound = false;
                break;
              } if (!isfound) {
                System.out.print("the kanji isnt iin our deck ! " +  result);
              }
          }input.close();
            
        }  
        
}