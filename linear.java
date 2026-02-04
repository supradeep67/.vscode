import java.util.Scanner;

public class linear {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            System.out.println("---------!wellcome to your offline dictonary!---------");
           System.out.print(" how many slots you need ? : ");
             int need = input.nextInt();
             String[] words = new String[need];
             String[] englishword = new String[need];
             //kanji & english meaning 
             System.out.println("-----------! add kanji and thire english meaning !------------");
             for( int i = 0 ; i < words.length; i++ ) {
                System.out.print(" plase intput the kanji for the index id for  " +i +":");
               words[i] = input.next();
                 System.out.print("please input the english meaning for the index id of : " + i +" : " );
                englishword[i] = input.next(); 
             }
               System.out.print("which kanji you want to search for : ");
               String foundString = input.next();
               String targeString = foundString;
               for(int i = 0; i < words.length; i ++ ){
                if (words[i].equals(targeString)) {
                  System.out.print("word found ! the kanji is:" + foundString + " and the english meaning is : " + englishword[i] );
                  break;

                  
                  
                }
              }
              input.close();

            }
          }
        



