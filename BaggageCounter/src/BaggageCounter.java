public class BaggageCounter{
    public static void main() {
        double baggageweight = 25.13;
        double baggageweightlimit = 23.0;
        double baggagefeeperKG = 1000;
        boolean hasprioritystatus = false;
        boolean issecurityCleared = true;

        //1. Arithematic operations calculate express weight
        double excessweight = baggageweight - baggageweightlimit;

        // 2. realation operation: check if baggage is overweight
        boolean isoverweight = baggageweight > baggageweightlimit;

        // 3. Assignment and Arithematic operaions
        double totalExtraFee = 0.0;
        if(isoverweight){
            totalExtraFee = excessweight * baggagefeeperKG ;
        }

        //4. logical operator : final clearnce
        // rule :
        boolean canFly = (!isoverweight || hasprioritystatus) && issecurityCleared;

        //output
        System.out.println("Excess Weight :"+excessweight +"kg");
        System.out.println("baggage fee :"+ totalExtraFee);
        System.out.println("boarding status :" + canFly);
    }
}