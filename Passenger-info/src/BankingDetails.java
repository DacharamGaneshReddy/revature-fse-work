import java.util.Scanner;
public class BankingDetails {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Customer Name :");
        String Name = scanner.nextLine();
        System.out.println("Enter Customer Age:");
        int Age = scanner.nextInt();
        System.out.println("Enter Customer Acc No:");
        int AccNo = scanner.nextInt();
        System.out.println("Enter Ifsc code :");
        int Ifsc = scanner.nextInt();
        System.out.println("customer details are:"+"\n"+"NAme :"+Name+"\n"+"Age :"+Age+'\n'+"Account Number: "+AccNo+"\n"+"IFSC code:"+Ifsc);
    }

}