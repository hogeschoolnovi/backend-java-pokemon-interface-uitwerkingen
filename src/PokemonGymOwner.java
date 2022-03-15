import java.util.Arrays;
import java.util.List;

public class PokemonGymOwner {

    private PokemonTrainer brock = new PokemonTrainer("Brock");
    private FirePokemon charizard = new FirePokemon("Charrizard", 76, 150, "firenougats", "GRRRRRRRRRRRRRRR");
    private WaterPokemon blastoise = new WaterPokemon("Blastoise", 40, 110, "Pokeflakes", "Blaaaaasssssstooooiiiiissss");
    private GrassPokemon venusaur = new GrassPokemon("Venusaur", 50, 135, "Pokeleafs", "Veeeeeeeeennnnnuuuuuusaur");
    private GrassPokemon ditto = new GrassPokemon("Ditto", 60, 140, "Everything", "Dittto diiiito ");
    private ElectricPokemon raichu = new ElectricPokemon("Raichy", 80, 160, "Pokebrocks", "Raaaaiiiiicccchhhhuuuuuuu!!!!");
    private WaterPokemon gyarados = new WaterPokemon("Gyarados", 90, 180, "Pokeflakes", "Gyaaaaaaaaarrrraaaadoooos");

    public PokemonGymOwner() {
    }


    public PokemonTrainer getBrock() {
        return brock;
    }

    public FirePokemon getCharizard() {
        return charizard;
    }

    public WaterPokemon getBlastoise() {
        return blastoise;
    }

    public GrassPokemon getVenusaur() {
        return venusaur;
    }

    public GrassPokemon getDitto() {
        return ditto;
    }

    public ElectricPokemon getRaichu() {
        return raichu;
    }

    public WaterPokemon getGyarados() {
        return gyarados;
    }

    public List<Pokemon> getPokemonList() {
        return Arrays.asList(getCharizard(), getBlastoise(), getDitto(), getGyarados(), getRaichu(), getVenusaur());
    }


}