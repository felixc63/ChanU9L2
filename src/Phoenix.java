public class Phoenix extends Monster {
    private int intensity;

    public Phoenix(String name, String type, int intensity){
        super(name,type);
        this.intensity = intensity;
    }

    public int getIntensity(){
        return intensity;
    }

    public void breatheFire(){
        System.out.println("Feel the Flame!");
    }
}
