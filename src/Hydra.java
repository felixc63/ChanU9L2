public class Dog extends Animal{
    private boolean hasBeenWalked;

    public Dog(String name, int age, boolean vaccinated, String color, boolean hasBeenWalked){
        super(name,age,vaccinated,color);
        this.hasBeenWalked = hasBeenWalked;
    }

    public boolean isHasBeenWalked(){
        return hasBeenWalked;
    }

    public void walk(){
        hasBeenWalked = true;
        System.out.println("I'm getting walked");
    }

    public void bark(){
        System.out.println("RUFF!");
    }
}
