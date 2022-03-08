import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon{

    private static final String type = "water";

    private List<String> attacks = Arrays.asList("Surf", "HydroPump", "HydroCanon", "RainDance");

    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    public List<String> getAttacks() {
        return attacks;
    }

    public void surf(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " performed surf attack on " + enemy.getName());
        if(enemy.getType() == "water"){
            System.out.println(enemy.getName() + " loses 20 hp");
            enemy.setHp(enemy.getHp() - 20);
        } else if (enemy.getType() == "fire"){
            System.out.println(enemy.getName() + " loses 40 hp");
            enemy.setHp(enemy.getHp() - 40);
        }else if (enemy.getType() == "electric"){
            System.out.println(enemy.getName() + " loses 30 hp");
            enemy.setHp(enemy.getHp() - 30);
        }else if (enemy.getType() == "grass"){
            System.out.println(enemy.getName() + " loses 20 hp");
            enemy.setHp(enemy.getHp() - 20);
        }
        System.out.println(enemy.getHp());
    }

    public void hydroPump(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " performed hydro-pump on " + enemy.getName());
        if(enemy.getType() == "water"){
            System.out.println(enemy.getName() + " loses 20 hp");
            enemy.setHp(enemy.getHp() - 20);
        } else if (enemy.getType() == "fire"){
            System.out.println(enemy.getName() + " loses 45 hp");
            enemy.setHp(enemy.getHp() - 45);
        }else if (enemy.getType() == "electric"){
            System.out.println(enemy.getName() + " loses 30 hp");
            enemy.setHp(enemy.getHp() - 30);
        }else if (enemy.getType() == "grass"){
            System.out.println(enemy.getName() + " loses 20 hp");
            enemy.setHp(enemy.getHp() - 20);
        }
        System.out.println(enemy.getHp());
    }

    public void hydroCanon(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " performed hydro-canon on " + enemy.getName());
        if(enemy.getType() == "water"){
            System.out.println(enemy.getName() + " loses 20 hp");
            enemy.setHp(enemy.getHp() - 20);
        } else if (enemy.getType() == "fire"){
            System.out.println(enemy.getName() + " loses 50 hp");
            enemy.setHp(enemy.getHp() - 50);
        }else if (enemy.getType() == "electric"){
            System.out.println(enemy.getName() + " loses 30 hp");
            enemy.setHp(enemy.getHp() - 30);
        }else if (enemy.getType() == "grass"){
            System.out.println(enemy.getName() + " loses 20 hp");
            enemy.setHp(enemy.getHp() - 20);
        }
        System.out.println(enemy.getHp());
    }

    public void rainDance(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " performed rain-dance " + enemy.getName());
        if(enemy.getType() == "water"){
            System.out.println(enemy.getName() + " gains 20 hp");
            enemy.setHp(enemy.getHp() + 20);
        } else if (enemy.getType() == "fire"){
            System.out.println(enemy.getName() + " loses 5 hp");
            enemy.setHp(enemy.getHp() - 5);
        }else if (enemy.getType() == "electric"){
            System.out.println( "has no effect on " + enemy.getName());
        }else if (enemy.getType() == "grass"){
            System.out.println(enemy.getName() + " gains 10 hp");
            enemy.setHp(enemy.getHp() + 10);
        }
        System.out.println(enemy.getHp());
    }
}
