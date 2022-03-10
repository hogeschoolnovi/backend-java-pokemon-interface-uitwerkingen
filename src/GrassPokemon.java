import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon{
    private static final String type = "grass";

    private List<String> attacks = Arrays.asList("LeafStorm", "SolarBeam", "LeechSeed", "LeaveBlade");

    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    public void leafStorm(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " performed LeafStorm " + enemy.getName());
        if(enemy.getType() == "grass"){
            System.out.println(enemy.getName() + " loses 20 hp");
            enemy.setHp(enemy.getHp() - 20);
        } else if (enemy.getType() == "water"){
            System.out.println(enemy.getName() + " loses 40 hp");
            enemy.setHp(enemy.getHp() - 40);
        }else if (enemy.getType() == "electric"){
            System.out.println(enemy.getName() + " loses 30 hp");
            enemy.setHp(enemy.getHp() - 30);
        }else if (enemy.getType() == "fire"){
            System.out.println(enemy.getName() + " loses 10 hp");
            enemy.setHp(enemy.getHp() - 10);
        }
        System.out.println(enemy.getHp());
    }

    public void solarBeam(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " performed a SolarBeam on " + enemy.getName());
        if(enemy.getType() == "grass"){
            System.out.println(enemy.getName() + " gaines 10 hp");
            enemy.setHp(enemy.getHp() - 20);
        } else if (enemy.getType() == "water"){
            System.out.println(enemy.getName() + " loses 50 hp");
            enemy.setHp(enemy.getHp() - 40);
        }else if (enemy.getType() == "electric"){
            System.out.println(enemy.getName() + " loses 20 hp");
            enemy.setHp(enemy.getHp() - 30);
        }else if (enemy.getType() == "fire"){
            System.out.println(enemy.getName() + " loses 5 hp");
            enemy.setHp(enemy.getHp() - 10);
        }
        System.out.println(enemy.getHp());
    }

    public void leechSeed(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " performed a LeechSeed on " + enemy.getName());
        if(enemy.getType() == "grass"){
            System.out.println(enemy.getName() + " loses 10 hp");
            System.out.println(name.getName() + " gaines 10 hp");
            enemy.setHp(enemy.getHp() - 20);
            name.setHp(enemy.getHp() + 20);
        } else if (enemy.getType() == "water"){
            System.out.println(enemy.getName() + " loses 50 hp");
            System.out.println(name.getName() + " gaines 50 hp");
            enemy.setHp(enemy.getHp() - 40);
            name.setHp(enemy.getHp() + 40);
        }else if (enemy.getType() == "electric"){
            System.out.println(enemy.getName() + " loses 20 hp");
            System.out.println(name.getName() + " gaines 20 hp");
            enemy.setHp(enemy.getHp() - 30);
            name.setHp(enemy.getHp() + 30);
        }else if (enemy.getType() == "fire"){
            System.out.println(enemy.getName() + " loses 5 hp");
            System.out.println(name.getName() + " gaines 5 hp");
            enemy.setHp(enemy.getHp() - 10);
            name.setHp(enemy.getHp() + 10);
        }
        System.out.println(enemy.getHp());
    }

    public void leaveBlade(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " performed a LeaveBlade on " + enemy.getName());
        if(enemy.getType() == "grass"){
            System.out.println(enemy.getName() + " loses 10 hp");
            enemy.setHp(enemy.getHp() - 20);
        } else if (enemy.getType() == "water"){
            System.out.println(enemy.getName() + " loses 50 hp");
            enemy.setHp(enemy.getHp() - 40);
        }else if (enemy.getType() == "electric"){
            System.out.println(enemy.getName() + " loses 20 hp");
            enemy.setHp(enemy.getHp() - 30);
        }else if (enemy.getType() == "fire"){
            System.out.println(enemy.getName() + " loses 5 hp");
            enemy.setHp(enemy.getHp() - 10);
        }
        System.out.println(enemy.getHp());
    }
}
