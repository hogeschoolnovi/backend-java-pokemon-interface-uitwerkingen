import java.util.List;

public class PokemonTrainer {

    private String name;
    private String[] backPack = new String[10];

    public PokemonTrainer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getBackPack() {
        return backPack;
    }

    public void setBackPack(String[] backPack) {
        this.backPack = backPack;
    }
}
