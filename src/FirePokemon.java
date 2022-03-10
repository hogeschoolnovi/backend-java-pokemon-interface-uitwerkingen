import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon{

    private static final String type = "fire";

    private List<String> attacks = Arrays.asList("Inferno", "PyroBall", "FireLash", "FlameThrower");


    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    public void inferno(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " performed Inferno on " + enemy.getName());
        if(enemy.getType() == "fire"){
            System.out.println(enemy.getName() + " loses 10 hp");
            enemy.setHp(enemy.getHp() - 10);
        } else if (enemy.getType() == "water"){
            System.out.println(enemy.getName() + " loses 50 hp");
            enemy.setHp(enemy.getHp() - 50);
        }else if (enemy.getType() == "grass"){
            System.out.println(enemy.getName() + " loses 40 hp");
            enemy.setHp(enemy.getHp() - 40);
        }else if (enemy.getType() == "electric"){
            System.out.println(enemy.getName() + " loses 20 hp");
            enemy.setHp(enemy.getHp() - 20);
        }
        System.out.println(enemy.getHp());
    }

    public void pyroBall(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " throws a PyroBall on " + enemy.getName());
        if(enemy.getType() == "fire"){
            System.out.println(enemy.getName() + " loses 10 hp");
            enemy.setHp(enemy.getHp() - 10);
        } else if (enemy.getType() == "water"){
            System.out.println(enemy.getName() + " loses 40 hp");
            enemy.setHp(enemy.getHp() - 40);
        }else if (enemy.getType() == "grass"){
            System.out.println(enemy.getName() + " loses 30 hp");
            enemy.setHp(enemy.getHp() - 30);
        }else if (enemy.getType() == "electric"){
            System.out.println(enemy.getName() + " loses 20 hp");
            enemy.setHp(enemy.getHp() - 20);
        }
        System.out.println(enemy.getHp());
    }

    public void fireLash(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " hits " + enemy.getName() + " with FireLash");
        if(enemy.getType() == "fire"){
            System.out.println(enemy.getName() + " loses 10 hp");
            enemy.setHp(enemy.getHp() - 10);
        } else if (enemy.getType() == "water"){
            System.out.println(enemy.getName() + " loses 40 hp");
            enemy.setHp(enemy.getHp() - 40);
        }else if (enemy.getType() == "grass"){
            System.out.println(enemy.getName() + " loses 30 hp");
            enemy.setHp(enemy.getHp() - 30);
        }else if (enemy.getType() == "electric"){
            System.out.println(enemy.getName() + " loses 30 hp");
            enemy.setHp(enemy.getHp() - 30);
        }
        System.out.println(enemy.getHp());
    }

    public void flameThrower(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " hits " + enemy.getName() + " with FlameThrower");
        if(enemy.getType() == "fire"){
            System.out.println(enemy.getName() + " loses 10 hp");
            enemy.setHp(enemy.getHp() - 10);
        } else if (enemy.getType() == "water"){
            System.out.println(enemy.getName() + " loses 40 hp");
            enemy.setHp(enemy.getHp() - 40);
        }else if (enemy.getType() == "grass"){
            System.out.println(enemy.getName() + " loses 30 hp");
            enemy.setHp(enemy.getHp() - 30);
        }else if (enemy.getType() == "electric"){
            System.out.println(enemy.getName() + " loses 20 hp");
            enemy.setHp(enemy.getHp() - 20);
        }
        System.out.println(enemy.getHp());
    }


}
