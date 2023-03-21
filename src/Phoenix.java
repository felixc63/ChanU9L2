public class Cat extends Animal{
    private boolean hasPlayedWith;

    public Cat(String name, int age, boolean vaccinated, String color, boolean hasPlayedWith){
        super(name,age,vaccinated,color);
        this.hasPlayedWith = hasPlayedWith;
    }

    public boolean isHasPlayedWith(){
        return hasPlayedWith;
    }

    public void play(){
        hasPlayedWith = true;
        System.out.println("I'm having fun");
    }

    public void meow(){
        System.out.println("MEOW!");
    }
}
