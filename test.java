import java.util.Scanner
;


// public class
public class test {
   public static void main(String[] args) {
    Scanner mc= new Scanner(System.in);
    System.out.println("--------------------! WELLCOME TO THE STUDENT NAME REGISTER!----------------------");

    System.out.println(" how many slote you need to store students number  ? : ");
    int slote = mc.nextInt();

     // creating the nedded arrays to store !
    String[] japanese= new String[slote];
    String[]english= new String[slote];
    String[]studentclass = new String[slote]; 
    String [] mobilenumber = new String[slote];
    String [] emailStrings = new String[slote];
     System.out.println("-------------------!PLEASE FILL UP THE FROM !----------------");
    for ( int i = 0 ; i < japanese.length; i++){

        System.out.println("please input your student name  for the index  "+ i +" : ");
        japanese[i]= mc.nextLine();
        mc.nextLine();
        System.out.print(" please input the  student grade  index id of  : " +i+" : " );
        english[i]= mc.nextLine();
        System.out.print(" please input the  student subject list   index id of  : " +i +" : ");
        studentclass[i]= mc.nextLine();
        System.out.print(" please input the mobile number of the  student , index id of  : " +i +" : " );
        mobilenumber[i]= mc.nextLine();
        System.out.print(" please input the plase student email id   index id of  : " +i +" : " );
        emailStrings[i]= mc.nextLine();

    }
      // search engine
      System.out.println("-------------------!探しによこそう!------------------");
     System.out.print("please input the student name to sarch for :");
     String fString= mc.nextLine();
      String tagertedString =fString ;
     
      System.out.println("----------------!SEARCHING!--------------");
        for(int i = 0; i < japanese.length; i++ ){
            if (japanese[i].equals(tagertedString)) {
                System.out.println("the data is in our databese ! at index no of : " + i );

                System.out.println("Student name is :   " + japanese[i]);
                System.out.println("student subject list is : " +  studentclass[i]);
                System.out.println("student mobile number is :   " + mobilenumber[i]);
                System.out.println(" student grade is :   "  + english[i]);

               
                break; 
            } 
                }
                mc.close();
            }
            
        }
        
      

