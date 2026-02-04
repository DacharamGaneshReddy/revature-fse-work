public class flightsystems {
    public static void main( String[] args) {
        //passenger names
        String[] passengers = {
                "Ganesh","Abhishek","Nikhil","Ram"
        };

        // Access array size length
        System.out.println("Total seats : "+passengers.length);

        //iterating through the array
        for (int i=0;i< passengers.length;i++){
            System.out.println("seat "+(i+1) + ": "+passengers[i]);
        }

        // 1 . create a grid of seats 3 rows and 2 columns
        String[][] seatingcharts = new String[3][2];
        // filling seats  with rows and columns
        seatingcharts[0][0] = "Vip Mr smith";
        seatingcharts[0][1] = "Vip Mrs smith";
        seatingcharts[1][0] = "Empty";
        seatingcharts[1][1] = "Cap rogers";
        seatingcharts[2][0] = "Dr . strange";
        seatingcharts[2][1] = "empty";

        //3.finding and exact passenger(r3,seatA)
        System.out.println("\n Seat 3A belngs to : "+seatingcharts[2][0]);

        // 4. print all the passenger
        for(int i=0;i< seatingcharts.length;i++){
            for(int j=0;j< seatingcharts[i].length;j++){
                System.out.println("row"+(i+1)+" seat"+(j+1)+ " : " +seatingcharts[i][j]);
            }
        }

    }
}
