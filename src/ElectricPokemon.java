import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon{
    private static final String type = "electric";

    private List<String> attacks = Arrays.asList("ThunderPunch", "ElectroBall", "Thunder", "VoltTackle");

    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    @Override
    public void eats(){
        System.out.println(super.getName() + " eats electric-" + super.getFood());
    }

    public void thunderPunch(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " hits " + enemy.getName() + " with a TunderPunch!");
        if(enemy.getType() == "fire"){
            System.out.println(enemy.getName() + " loses 20 hp");
            enemy.setHp(enemy.getHp() - 20);
        } else if (enemy.getType() == "water"){
            System.out.println(enemy.getName() + " loses 40 hp");
            enemy.setHp(enemy.getHp() - 40);
        }else if (enemy.getType() == "grass"){
            System.out.println(enemy.getName() + " loses 30 hp");
            enemy.setHp(enemy.getHp() - 30);
        }else if (enemy.getType() == "electric"){
            System.out.println(enemy.getName() + " loses 10 hp");
            enemy.setHp(enemy.getHp() - 10);
        }
        System.out.println(enemy.getHp());
    }
    public void electroBall(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " throws a ElectroBall on " + enemy.getName());
        if(enemy.getType() == "fire"){
            System.out.println(enemy.getName() + " loses 20 hp");
            enemy.setHp(enemy.getHp() - 20);
        } else if (enemy.getType() == "water"){
            System.out.println(enemy.getName() + " loses 40 hp");
            enemy.setHp(enemy.getHp() - 40);
        }else if (enemy.getType() == "grass"){
            System.out.println(enemy.getName() + " loses 30 hp");
            enemy.setHp(enemy.getHp() - 30);
        }else if (enemy.getType() == "electric"){
            System.out.println(enemy.getName() + " loses 10 hp");
            enemy.setHp(enemy.getHp() - 10);
        }
        System.out.println(enemy.getHp());
    }

    public void thunder(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " hits " + enemy.getName() + " with Thunder");
        if(enemy.getType() == "fire"){
            System.out.println(enemy.getName() + " loses 20 hp");
            enemy.setHp(enemy.getHp() - 20);
        } else if (enemy.getType() == "water"){
            System.out.println(enemy.getName() + " loses 50 hp");
            enemy.setHp(enemy.getHp() - 40);
        }else if (enemy.getType() == "grass"){
            System.out.println(enemy.getName() + " loses 40 hp");
            enemy.setHp(enemy.getHp() - 30);
        }else if (enemy.getType() == "electric"){
            System.out.println(enemy.getName() + " gaines 10 hp");
            System.out.println(name.getName() + " gaines 10 hp");
            enemy.setHp(enemy.getHp() + 10);
            name.setHp(name.getHp() + 10);
        }
        System.out.println(enemy.getHp());
    }
    public void voltTackle(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " uses a VoltTackle on " + enemy.getName());
        if(enemy.getType() == "fire"){
            System.out.println(enemy.getName() + " loses 20 hp");
            enemy.setHp(enemy.getHp() - 20);
        } else if (enemy.getType() == "water"){
            System.out.println(enemy.getName() + " loses 40 hp");
            enemy.setHp(enemy.getHp() - 40);
        }else if (enemy.getType() == "grass"){
            System.out.println(enemy.getName() + " loses 30 hp");
            enemy.setHp(enemy.getHp() - 30);
        }else if (enemy.getType() == "electric"){
            System.out.println(enemy.getName() + " loses 10 hp");
            enemy.setHp(enemy.getHp() - 10);
        }
        System.out.println(enemy.getHp());
    }
}
