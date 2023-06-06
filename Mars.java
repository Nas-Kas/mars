public class Mars {
    String colonyName = "cloud colony";
    int shipPopulation = 300;
    double meals = 4000;
    boolean landing = true;
    String landingLocation = "The Hill";

    public void determineLocation(String landingLocation){
        if(landingLocation.equals("The Plain")){
            System.out.println("Bbzzz Landing on the Plain");
        }else {
            System.out.println("ERROR!!! Flight plan already set. Landing on the Plain");
        }
    }

    public boolean landingCheck(int minutesLeft) throws InterruptedException {
        for(int minute = 0; minute < minutesLeft; minute++){
            if(minute % 2 == 0 && minute % 3 == 0){
                System.out.println("Keep Center");
            }
            else if(minute % 2 == 0){
                System.out.println("Right!");
            }else if(minute % 3 == 0){
                System.out.println("Left");
            }else{
                System.out.println("Calculating");
            }
            Thread.sleep(250);
        }
        System.out.println("Landed");
        return false;
    }

    public static void main(String [] args) throws InterruptedException {
        Mars planet = new Mars();
        planet.meals = planet.meals - (planet.shipPopulation * 0.75);
        planet.meals = planet.meals - (planet.shipPopulation * 0.75);

        System.out.println(planet.meals);
        planet.meals = planet.meals + (planet.meals * 0.5);
        planet.shipPopulation = planet.shipPopulation + 5;
        planet.determineLocation(planet.landingLocation);
        planet.landing = planet.landingCheck(30);

        GuessingGame g = new GuessingGame();
        g.playGame();

        MarsExpedition me = new MarsExpedition();
        me.setup();

        FindingsList fl = new FindingsList();
        fl.play();
    }

}
