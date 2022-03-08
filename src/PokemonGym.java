
public class PokemonGym {

    private PokemonTrainer brock = new PokemonTrainer("Brock");
    private FirePokemon charizard = new FirePokemon("Charrizard", 76, 150, "firenougats", "GRRRRRRRRRRRRRRR");
    private WaterPokemon blastoise = new WaterPokemon("Blastoise", 40, 110, "Pokeflakes", "Blaaaaasssssstooooiiiiissss");
    private GrassPokemon venusaur = new GrassPokemon("Venusaur", 50, 135, "Pokeleafs", "Veeeeeeeeennnnnuuuuuusaur");
    private Pokemon ditto = new Pokemon("Ditto", 60, 140, "Everything", "Dittto diiiito ", "grass");
    private ElectricPokemon raichu = new ElectricPokemon("Raichy", 80, 160, "Pokebrocks", "Raaaaiiiiicccchhhhuuuuuuu!!!!");
    private WaterPokemon gyarados = new WaterPokemon("Gyarados", 90, 180, "Pokeflakes", "Gyaaaaaaaaarrrraaaadoooos");

    public PokemonTrainer getBrock() {
        return brock;
    }

    public void setBrock(PokemonTrainer brock) {
        this.brock = brock;
    }

    public FirePokemon getCharizard() {
        return charizard;
    }

    public void setCharizard(FirePokemon charizard) {
        this.charizard = charizard;
    }

    public WaterPokemon getBlastoise() {
        return blastoise;
    }

    public void setBlastoise(WaterPokemon blastoise) {
        this.blastoise = blastoise;
    }

    public GrassPokemon getVenusaur() {
        return venusaur;
    }

    public void setVenusaur(GrassPokemon venusaur) {
        this.venusaur = venusaur;
    }

    public Pokemon getDitto() {
        return ditto;
    }

    public void setDitto(Pokemon ditto) {
        this.ditto = ditto;
    }

    public ElectricPokemon getRaichu() {
        return raichu;
    }

    public void setRaichu(ElectricPokemon raichu) {
        this.raichu = raichu;
    }

    public WaterPokemon getGyarados() {
        return gyarados;
    }

    public void setGyarados(WaterPokemon gyarados) {
        this.gyarados = gyarados;
    }
}