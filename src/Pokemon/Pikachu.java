package Pokemon;

public class Pikachu extends Pokemon implements iElectric{


    public Pikachu() {
    }

    //Pokemon moves

    @Override
    protected void tackleAttack() {
        System.out.println("Tackle of Pikachu");
    }

    @Override
    protected void scratchAttack() {
        System.out.println("Scratch of Pikachu");
    }

    @Override
    protected void biteAttack() {
        System.out.println("Bite of Pikachu");
    }



    //Electric-type Pokemon Moves

    @Override
    public void thunderShock() {
        System.out.println("Thunder Shock of Pikachu");
    }

    @Override
    public void thunderPunch() {
        System.out.println("Thunder Punch of Pikachu");
    }




}
