public class Dog implements Drivable, Domesticatable, Tradable {

    private int speed;

    public Dog() {
        this.speed = 6;
    }

    @Override
    public String sound() {
        return "woof" ;
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
        return 12;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.speed +")";
}   }
