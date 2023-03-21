public class Monster {
    private String name;
    private String type;
    public Monster(String name, String type){
        this.name = name;
        this.type = type;
    }

    public String getName(){
        return name;
    }

    public String getType(){
        return type;
    }

    public void roar(){
        System.out.println("RAHHHHH");
    }
}
