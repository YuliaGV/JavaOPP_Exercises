package Pokemon;

public class Charmander extends Pokemon implements iFire {

    public Charmander() {
    }

    //Pokemon moves


    @Override
    protected void tackleAttack() {
        System.out.println("Tackle of Charmander");
    }

    @Override
    protected void scratchAttack() {
        System.out.println("Scratch of Charmander");
    }

    @Override
    protected void biteAttack() {
        System.out.println("Bite of Charmander");
    }


    //Fire-type Pokemon moves

    @Override
    public void firePunch() {
        System.out.println("Fire Punch of Charmander");
    }

    @Override
    public void flamethrower() {
        System.out.println("Flamethrower of Charmander");
    }

    @Override
    public void ember() {
        System.out.println("Ember of Charmander");
    }
}
