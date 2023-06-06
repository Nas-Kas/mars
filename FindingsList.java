import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class FindingsList {
    Scanner sc;
    static String fossilChoice;
    public FindingsList(){
        sc = new Scanner(System.in);
    }

    public void rocks() throws InterruptedException {
        Thread.sleep(500);
        String [] s = new String []{"rock","weird rock","smooth rock", "not rock"};
        System.out.println("Everything is downloaded: " + Arrays.toString(s));
        System.out.println("There is a non-rock in here that i need to delete");
        s = new String [] {"rock", "weird rock", "smooth rock"};
        System.out.println("Perfect!: " + Arrays.toString(s));
    }

    public void fossil() throws InterruptedException {
        Thread.sleep(1000);
        HashMap<String,String> fossils = new HashMap<>();
        fossils.put("Bird Fossil","The fossil has wings implying it was capable of flight");
        fossils.put("Fish Fossil","The fossil is vaguely fish shaped implies there was once water");
        fossils.put("Tooth Fossil","The tooth from an unknown fossil");
        System.out.println("Fossil data downloaded");
        System.out.println("Which of the fossils would you like to learn more about Bird Fossil, Fish Fossil, or Tooth Fossil");
        fossilChoice = sc.nextLine();
        System.out.println(fossilChoice);
        System.out.println(fossils.get(fossilChoice));
    }

    public void supply() throws InterruptedException {
        Thread.sleep(700);
        HashSet<String> supplies = new HashSet<>();
        supplies.add("food");
        supplies.add("shelter");
        supplies.add("water");

        System.out.println("Supplies Before Expedition: ");
        for(String e : supplies){
            System.out.println(e);
        }
        supplies.remove("food");

        System.out.println("Supplies After Expedition: ");
        for(String e : supplies){
            System.out.println(e);
        }
    }
    public void play() throws InterruptedException {
        rocks();
        fossil();
        supply();
    }

    public static void main (String [] args) throws InterruptedException {
        FindingsList fl = new FindingsList();
        fl.play();
    }
}
