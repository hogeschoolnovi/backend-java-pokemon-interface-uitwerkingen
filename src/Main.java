import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner speler_A = new Scanner(System.in);


//        System.out.println("First player please enter your name: ");
//        String userA = speler_A.nextLine();
//        PokemonTrainer player1 = new PokemonTrainer(userA);

        PokemonGym gym = new PokemonGym();
        gym.getGyarados().rainDance(gym.getGyarados(), gym.getBlastoise());
    }

}
