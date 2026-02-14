import java.util.Scanner;

public class databese {

    public static void main(String[] args) {
        
        Scanner input= new Scanner(System.in);

        System.out.print("please input the numbers of the students :");
        int i = input.nextInt();
        System.out.println("plase input the collumb number : "  );
        int s = input.nextInt();
        
        
        // 2d arrays

        String[][] database = new String[i][s];

        // filling up , 

        for ( int k = 0 ; k < database.length; k ++){
            System.out.println("please input the name of the student : ");
            database[k][0]= input.nextLine();
            input.nextLine(); 

            // input for the jlpt level 

            System.out.println("please input the jlpt level for the student  : " );
            database[k][1]= input.next();
            

            // input for the mobile number : 

           

            // input for email 

            System.out.print("plase input the email id for the student : ");
            database[k][2] = input.next();

            // the menu 

            boolean isfinish = true;

            while (isfinish) {
                System.out.println("---------------!MENU BAR!-------------");

               System.out.println("plase to proceede the option form below .");
               System.out.println(" type 1 to see the full list of the registed students : ");
               System.out.println(" type 2 to search by name a student ");
               System.out.println("type 3 to exit ");
               int choice = input.nextInt();

               if (choice == 1) {
                System.out.println("\nNAME\t\tROLL\tLEVEL\tEMAI;");
                System.out.print("-------------------------------");
                for (int g = 0 ; g < database.length; i++){
                    for ( int o = 0 ; o < database[g].length; o ++){
                        System.out.print(database[i][g] + "\t \t \t");
                    }
                }
               }if (choice == 2) {
                System.out.print("please input the student name to search for : " );
                String terget = input.next();
                for ( int l = 0 ; l < database.length; l ++){
                    for (int p = 0 ; p < database[l].length; p ++ ){
                        if (database[i][p].equals(terget)) {
                            System.out.println("name found in our database at index of : " + l + p );
                             System.out.println("\nNAME\t\tROLL\tLEVEL\tEMAI;");
                              System.out.print("-------------------------------");
                              System.out.print(database[i][p] + "\t\t\t");
                        } isfinish=false;
                        break;
                    }
                }
               }if (choice==3) {
                System.out.print("good bye");
               }
               
            }if (!isfinish) {
                System.out.print("we coundntfind the name ! ");
            }

            
        }input.close();
    }
}