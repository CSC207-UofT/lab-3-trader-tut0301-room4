public class Mule implements Domesticatable, Tradable {
    @Override
    public String sound() {
        return "Kihkihkih";
    }

    @Override
    public int getPrice() {
        return 5;
    }
}
