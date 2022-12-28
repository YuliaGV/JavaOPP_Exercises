package Pokemon;

public abstract class Pokemon {

    protected int numPokedex;
    protected String name;
    protected double weight;
    protected String gender;
    protected int season;

    protected abstract void tackleAttack();   //ataque de placaje
    protected abstract void scratchAttack();  //arañazo
    protected abstract void biteAttack();     //mordisco


}
