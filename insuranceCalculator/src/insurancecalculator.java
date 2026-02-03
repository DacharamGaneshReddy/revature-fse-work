import java.util.Scanner;
public class insurancecalculator{
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter driver age :");
        int age = scanner.nextInt();

        System.out.println("Enter Car type:");
        String cartype = scanner.next();

        System.out.println("enter the base premium");
        double basepremium = scanner.nextDouble();

        System.out.println("enter final premium");
        double finalpremium = scanner.nextDouble();

        if(age <25){
            System.out.println("risk category : young driver(high risk)");
            finalpremium = basepremium + 100.0;
        }else if(age >=25 && age<=60){
            System.out.println("risk category : standard (low  risk)");
            finalpremium = basepremium;
        }else{
            System.out.println("risk category : senior driver (modorate  risk)");
            finalpremium = basepremium + 50.00;
        }
        /*part2
           switch case
         */
        switch(cartype) {
            case "Luxury":
                System.out.println("Adding luxury vehicle surcharge");
                finalpremium += 150.00;
                break;
            case "sedan":
                System.out.println(" adding avg sedan rates");
                finalpremium += 100.00;
                break;
            case "Suv":
                System.out.println(" adding Suv safety fee");
                finalpremium += 50.00;
                break;
            default:
                System.out.println(" Unknown cars : apply generic fee");
                finalpremium += 25.00;
                break;

        }
        // part 3
        System.out.println(" your final premium is :"+ finalpremium);


    }
}