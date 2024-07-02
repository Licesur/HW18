public class Dog extends Pet{
    public Dog(String name, int age, double weight) {
        this.setName(name);
        this.setAge(age);
        this.setWeight(weight);
    }
    public void move(){
        System.out.println("Собака по кличке " + getName() + " бежит по земле");
    }
}
