public class Mars {
    public static void main(String[] args) throws InterruptedException {
        //The main method contains a String, int, double, and boolean
        String colonyName = "Zazu"; //string
        int shipPopulation = 300; //int
        double meals = 4000.00; //double
        boolean landing = true; //boolean

        landingCheck(5);

        meals = meals - (shipPopulation * 0.75);
        meals = meals - (shipPopulation * 0.75);
        System.out.println(meals);
        meals = meals + (meals * .5);
        shipPopulation = shipPopulation + 5;


        //Include an if-else statement
        String landingLocation = "The Ocean";
        if (landingLocation.equalsIgnoreCase("The Plain")) {
            System.out.println("Bbzzz landing on The Plain");
        } else {
            System.out.println("ERROR!!! Flight plan already set. Landing on The Plain");
        }
        new GuessingGame();

        new MarsExpedition();

        new FindingsList();
    }
    //Call the landingCheck function
    public static void landingCheck(int minutesLeft) throws InterruptedException {

        for (int minute = 0; minute <= minutesLeft; minute++) {
            if (((minute % 3) == 0) && ((minute % 2) == 0)) {
                System.out.println("Keep Center");
            } else if ((minute % 2) == 0) {
                System.out.println("Right");
            } else if ((minute % 3) == 0) {
                System.out.println("Left");
            } else {
                System.out.println("Calculating");
            }
            Thread.sleep(250);
        }
        System.out.println("Landed");

    }

}
