public class Animal{
    String name;
    String type;

    public Animal(String name,String type){
        this.name=name;
        this.type=type;
    }
    public void attack(Employee s){
        System.out.println(this.name + " is attacking "+ s.name);

    }
}