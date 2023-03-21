public class Hydra extends Monster {
    private int headCount;

    public Hydra(String name, String type, int headCount){
        super(name,type);
        this.headCount = headCount;
    }

    public int getHeadCount(){
        return headCount;
    }

    public void breatheWater(){
        System.out.println("Get Soaked!");
    }
}
