import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner speler_A = new Scanner(System.in);
        PokemonGym gym = new PokemonGym();


//        System.out.println("First player please enter your name: ");
//        String userA = speler_A.nextLine();
//        PokemonTrainer player1 = new PokemonTrainer(userA);

        System.out.println("Enter your name please");
        PokemonTrainer trainerA = new PokemonTrainer(speler_A.nextLine());
//        System.out.println("Welcome to our Pokemon Game, " + trainerA.getName() +  "!");
//        System.out.println("Would you like to enter a new Gym?");
//        System.out.println("Y/N:");
//        if(speler_A.nextLine() == "Y"){
//            System.out.println(gym.getBrock().getName() + " welcomes you in his PokemonGym!");
//        }
//        System.out.println(gym.getBrock().getName() + " dares you for a fight!");
//        System.out.println("Would you accept this fight?");
//        System.out.println("Y/N:");
//        if (speler_A.nextLine() == "Y"){
//            System.out.println("The fight between " + trainerA.getName() + " and " + gym.getBrock().getName() + " begins in ");
//            System.out.println("3...");
//            System.out.println("2...");
//            System.out.println("1...");
//            System.out.println("Lets fight!");
//            List<String> names = null;
//            names.add(trainerA.getBlastoise().getName());
//            names.add(trainerA.getGyarados().getName());
//            names.add(trainerA.getCharizard().getName());
//            names.add(trainerA.getDitto().getName());
//            names.add(trainerA.getRaichu().getName());
//            names.add(trainerA.getVenusaur().getName());
//            trainerA.setPokemons(names);
            System.out.println("Choose your first Pokemon");
            System.out.println("You can choose out :" + trainerA.getPokemons());

            gym.getGyarados().rainDance(gym.getGyarados(), trainerA.getBlastoise());
            System.out.println(trainerA.getBlastoise().getAttacks());





    }

}
