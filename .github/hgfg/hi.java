
import java.util.Scanner;


public class hi {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
    
       //  input for the 2d array   

       System.out.print(" please input how many rows you need ? : "  );
       int row = input.nextInt();

       System.out.print("please input the collumb number : ");
       int collumb = input.nextInt();

       String [][] students = new String[row][collumb] ;

       // filling up the arrays 

       for( int i = 0 ; i < students.length; i ++){
        for (int k = 0 ; k < students[i].length ; k ++ ){
            System.out.print(" please input the student name for the index no of : " +"{"+i+"}"+ "{"+k+"}"  + "  : " );
            students[i][k]= input.next();
        }
       }

       // lineare search 

       boolean isfound = false;
       

       System.out.print("plase input the student name to search for : ");
       String terget = input.next();
         
       for ( int s = 0 ; s < students.length; s ++ ){
        for (int r = 0 ; r <  students[s].length; r ++ ){

            if (students[s][r].equals(terget)) {
                System.out.print("student found in our databese at index id of : " +"{"+s+"}"+ "{"+r+"}" + "name : " + terget);
                isfound = true;
                break;
            }
            }
        }if (!isfound) {
                System.out.print("we could'n search for the student  : " + terget);
       }input.close();
       



    }
}
