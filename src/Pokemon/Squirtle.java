package Pokemon;

public class Squirtle extends Pokemon implements iWater{


    public Squirtle() {
    }


    //Pokemon moves

    @Override
    protected void tackleAttack() {
        System.out.println("Tackle of Squirtle");
    }

    @Override
    protected void scratchAttack() {
        System.out.println("Scratch of Squirtle");
    }

    @Override
    protected void biteAttack() {
        System.out.println("Bite of Squirtle");
    }

    //Water-type Pokemon moves


    @Override
    public void hydroPump() {
        System.out.println("Hydropump of Squirtle");
    }

    @Override
    public void bubble() {
        System.out.println("Bubble of Squirtle");
    }

    @Override
    public void waterGun() {
        System.out.println("Water Gun of Squirtle");
    }
}
