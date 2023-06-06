import java.util.HashMap;
import java.util.Scanner;

public class MarsExpedition {
    Scanner sc;
    String userName = "";
    String headingOut;
    int teamSize;
    String snack;
    HashMap<Character,String> vMap = new HashMap<Character,String>();
    String vehicle;

    public MarsExpedition(){
        sc = new Scanner(System.in);
        vMap.put('A', "Motorcyle");
        vMap.put('B', "Bugatti");
        vMap.put('C', "Soccer Mom Van");
        System.out.println("booting up");
    }

    public void setup(){
        System.out.println("What is your name");
        userName = sc.nextLine();
        System.out.println("Hi," + userName + "— Welcome to the Expedition prep program. Are you ready to head out into the new world? Type Y or N");
        headingOut = sc.nextLine();
        if(headingOut.equals("Y")){
            System.out.println("I knew you would say that. You are team leader for a reason.");
        }else {
            System.out.println("Too bad you are team leader. You have to go.");
        }

        System.out.println("How many more team members are we bringing");
        teamSize = sc.nextInt();
        if(teamSize > 2 || teamSize < 0){
            System.out.println("That’s way to many people. We can only send 2 more members");
            teamSize = 2;
        }

        System.out.println("You're allowed to bring what snack what do you bring?");
        snack = sc.next();
        System.out.println("Nice choice you will bringing a " + snack + " with you");

        System.out.println("Next choose your vehicle i.e A, B, or C");
        for(Character c : vMap.keySet()){
            System.out.println(c + ":" + vMap.get(c));
        }
        vehicle = vMap.get(sc.next().charAt(0));
        System.out.println(userName + ":" + teamSize + ":" + snack + ":" + vehicle);
        System.out.println("5.. 4... 3.. 2... 1... TAKEHOFF");
    }

    public static void main (String [] args){
        MarsExpedition me = new MarsExpedition();
        me.setup();
    }
}
