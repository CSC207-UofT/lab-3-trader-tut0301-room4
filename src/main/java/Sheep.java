import java.util.Objects;

public class Sheep implements Tradable, Domesticatable{
    /*
     * Creates a new Sheep object with the specified woolLevel,
     * "Low", "Average", or "High".
     */
    private String woolLevel;

    public Sheep(String woolLevel){
        this.woolLevel = woolLevel;
    }

    @Override
    public String sound(){
        return "Baaahhh";
    }

    @Override
    public int getPrice(){
        if(Objects.equals(this.woolLevel, "Low")){
            return 10;
        }else if(Objects.equals(this.woolLevel, "Average")){
            return 15;
        }else{
            return 20;
        }
    }
}
