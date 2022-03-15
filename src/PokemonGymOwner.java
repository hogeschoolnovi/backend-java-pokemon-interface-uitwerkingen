import java.util.Arrays;
import java.util.List;

public class PokemonGymOwner {

    private List<Pokemon> pokemonList ;
    private PokemonTrainer brock = new PokemonTrainer("Brock");
    private String village;
    private FirePokemon charizard = new FirePokemon("Charrizard", 76, 150, "firenougats", "GRRRRRRRRRRRRRRR");
    private WaterPokemon blastoise = new WaterPokemon("Blastoise", 40, 110, "Pokeflakes", "Blaaaaasssssstooooiiiiissss");
    private GrassPokemon venusaur = new GrassPokemon("Venusaur", 50, 135, "Pokeleafs", "Veeeeeeeeennnnnuuuuuusaur");
    private GrassPokemon ditto = new GrassPokemon("Ditto", 60, 140, "Everything", "Dittto diiiito ");
    private ElectricPokemon raichu = new ElectricPokemon("Raichy", 80, 160, "Pokebrocks", "Raaaaiiiiicccchhhhuuuuuuu!!!!");
    private WaterPokemon gyarados = new WaterPokemon("Gyarados", 90, 180, "Pokeflakes", "Gyaaaaaaaaarrrraaaadoooos");

    public PokemonGymOwner() {
    }

    public PokemonGymOwner(PokemonTrainer brock, String village, FirePokemon charizard, WaterPokemon blastoise, GrassPokemon venusaur, GrassPokemon ditto, ElectricPokemon raichu, WaterPokemon gyarados) {
        this.brock = brock;
        this.village = village;
        this.charizard = charizard;
        this.blastoise = blastoise;
        this.venusaur = venusaur;
        this.ditto = ditto;
        this.raichu = raichu;
        this.gyarados = gyarados;
    }

    public PokemonTrainer getBrock() {
        return brock;
    }

    public String getVillage() {
        return village;
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
        List<Pokemon> list = Arrays.asList(getCharizard(), getBlastoise(), getDitto(), getGyarados(), getRaichu(), getVenusaur());
        return list;
    }


}