import java.util.Scanner;

public class hi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
           System.out.println("---------------! Student  registery !--------------");
         System.out.println("please tell us how many user do you have ? : ");
          int name =  input.nextInt();
          System.out.println("please tell us how many slots you need like  what are  are the content you ll be putting on ? please input in number : ");
          int name2= input.nextInt();
          input.nextLine();
          String[][] username = new String[name2][name];

            // filling up the  2d array 

            for ( int row = 0 ; row < username.length; row ++){
                for (  int coll  = 0 ;coll< username.length; coll++ ){
                    System.out.println("please input the student name for the collumb  : " + " {"+ row +"}" +  "{" + coll +"}  : " ) ;
                    username [row][coll] = input.nextLine();
                    
                }

                // lineare search 
                    boolean isfoud = true;
                    System.out.print(" input a name to search for : ");
                    String terget = input.nextLine();
                for ( int po = 0 ; po <  username.length; po ++ ){
                    for (int lo = 0 ; lo < username.length ; lo ++){
                        if (username[po][lo].equals(terget)) {
                            System.out.print("name found at index of : " +"{"+ po+"}" + "{"+lo+"} " + terget);
                            isfoud= false;
                            break;
                        } if (!isfoud) {
                            System.out.print("Student isnt regited yet !");
                        }
                    }
                }
               
                } input.close();
            }
            
           
            }
         
        
    
