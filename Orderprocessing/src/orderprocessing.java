import java.util.Scanner;
public class orderprocessing{
        public static void main(String[] args) {
                int crtpin = 12345;
                int enterpin;
                Scanner scanner = new Scanner(System.in);
                do{
                        System.out.println("Enter the pin");
                        enterpin = scanner.nextInt();
                        if( enterpin != crtpin){
                                System.out.println("incorrect pin , enter correct pin");
                        }
                }while( enterpin != crtpin );

        //unloading boxes
        int boxes = 5;
        while(boxes > 0){
                System.out.println("boxes remaining "+(boxes-1));
                boxes--;
        }

        //Process a List of Customer Orders
                String[] orders = {
                "101","102","103","104","105"
                };
        for( String order : orders){
                System.out.println("orders :"+order);
        }

        // orders
        System.out.println("Final Report: Priority Orders");
                for (int i = 0; i < 31 && i < orders.length; i++) {
                        System.out.println("Priority Order: " + orders[i]);
                }


        }
}

