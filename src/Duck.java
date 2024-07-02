public class Duck extends Pet{
    public Duck(String name, int age, double weight) {
        this.setName(name);
        this.setAge(age);
        this.setWeight(weight);
    }
    public void move(){
        System.out.println("Утка по кличке " + getName() + " летит в облаках");
    }
}
