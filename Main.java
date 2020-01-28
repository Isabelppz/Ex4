public class Main{
    public static void main(String args[]){
        Employee s1= new Employee("Mark",35,7);
        Employee s2= new Employee ("Isabel",35,7);
       
        Animal a1= new Animal("Hines","Lab");
        Animal a2= new Animal("Oreo","Cat");

        a1.attack(s1);
        a2.attack(s2);
       
    }

}