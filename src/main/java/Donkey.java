public class Donkey implements Drivable, Domesticatable, Tradable {
    private int speed;
    public Donkey(){
        this.speed = 12;
    }

    @Override
    public String sound() {
        return "Eo Eo";
    }

    @Override
    public void upgradeSpeed() {
        this.speed++;
    }

    @Override
    public void downgradeSpeed() {
        this.speed--;
    }

    @Override
    public int getMaxSpeed() {
        return this.speed;
    }

    @Override
    public int getPrice() {
        return 8;
    }
}
