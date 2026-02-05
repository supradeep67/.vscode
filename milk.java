import java.util.Scanner;


public class milk {

    public static void main(String[] args) {
        Scanner nScanner= new Scanner(System.in);

        System.out.print("plase input your name : ");
        String name = nScanner.nextLine();

        System.out.println("wait creating a shopping cart fot the user : " + name);
        System.out.println("okey completed ! its "+ name +"'s shooping list ");

        //arrays useing pre built arrays 
        

        String[] product = {"milk","apple","juice", "greaps"};
        String [] size ={"big", "small","midium","semi big"};

        Double [] price = {19.99,25.33,55.99,59.99};

        ////
        System.out.println("here you might someting you may like ");
        for (int p = 0 ; p < product.length; p ++){
            System.out.println(   p +" : "+ product[p]);
        }

       // linear seach 
        System.out.print("please input what you need : " );
        String result = nScanner.next();
         nScanner.nextLine();
       boolean isfound = true;
      for (int  i = 0 ; i < product.length; i++){
        

         if (product[i].equals(result)) {
            System.out.println("item found at index of " + i );
           

             System.out.print("please input the size of the selected item : " + result + " : ");
             String nepo = nScanner.nextLine();
              
              

            if (size[i].equals(nepo)) {
                System.out.println("ok got it  at index of " + i);
                System.out.println("----------! your cart !--------");
                System.out.println("item : " + product[i] );
                System.out.println("size  : " + size[i]);
                System.out.print("price :" + price[i]);
                isfound = false;
                break;
                    
                
                    
            }if (!isfound) {
                System.out.print("the item are you looking for isnt avalble");
            }


         }
      } nScanner.close();




        
    }
}



