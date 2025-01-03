import java.util.ArrayList;

public class Trainer {

    String name;
    ArrayList<Pokemon> pokemons = new ArrayList<>();

    public Trainer(String name) {
        this.name = name;
    }

    public void addPokemonToCollection(Pokemon pokemon){
        this.pokemons.add(pokemon);
    }

    public void releaseAllPokemons(){
        for(Pokemon pokemon : pokemons){
            pokemon.sayHello();
        }
    }
}
