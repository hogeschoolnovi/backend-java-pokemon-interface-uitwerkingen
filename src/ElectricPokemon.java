public class ElectricPokemon extends Pokemon{
    private static final String type = "electric";

    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    @Override
    public void eats(){
        System.out.println(super.getName() + " eats electric-" + super.getFood());
    }

    public void thunderPunch(){
        System.out.println(super.getName() + " strikes with a thunder punch");
    }

    public void electroBall(){
        System.out.println(super.getName() + " throws a electro ball");
    }

    public void thunder(){
        System.out.println( super.getName() + " performed thunder");
    }

    public void voltTackle(){
        System.out.println(super.getName() + " performed a volt tackle");
    }
}
