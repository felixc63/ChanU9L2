public class Animal {
    private String name;
    private int age;
    private boolean vaccinated;
    private String color;
    public Animal(String name, int age, boolean vaccinated, String color){
        this.name = name;
        this.age = age;
        this.vaccinated = vaccinated;
        this.color = color;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public boolean isVaccinated(){
        return vaccinated;
    }

    public String getColor(){
        return color;
    }

    public void adopt(){
        System.out.println("I have been adopted");
    }

    public void feed(){
        System.out.println("Yummy");
    }

    public void pickUp(){
        System.out.println("I have been picked up");
    }
}
