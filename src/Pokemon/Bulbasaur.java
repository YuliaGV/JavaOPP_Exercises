package Pokemon;

public class Bulbasaur extends Pokemon implements iGrass{

    public Bulbasaur() {
    }

    //Pokemon moves
    @Override
    protected void tackleAttack() {
        System.out.println("Tackle of Bulbasaur");
    }

    @Override
    protected void scratchAttack() {
        System.out.println("Scratch of Bulbasaur");
    }

    @Override
    protected void biteAttack() {
        System.out.println("Bite of Bulbasaur");
    }


    //Grass-type Pokemon moves

    @Override
    public void drainPunch() {
        System.out.println("Drain Punch of Bulbasaur");
    }

    @Override
    public void stunSpore() {
        System.out.println("Stun Spore of Bulbasaur");
    }
}
