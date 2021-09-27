/* A sample class that implements the given interfaces.
 */
public class Camel implements Tradable, Domesticatable, Drivable {

    private int maxSpeed;

    public Camel() {
        this.maxSpeed = 1;
    }

    @Override
    public String sound() {
        return "Eeeeghh!";
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed++;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed--;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice() {
        return 30;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +")";
    }
}
