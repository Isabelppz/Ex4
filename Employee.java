public class Employee extends User{

   public int IDNumber;
   
   public Employee(String name,int age, int IDNumber){
       super(name,age);
       this.IDNumber=IDNumber;
}
public void EmployeeDisplay(){
    System.out.println("Name: " + this.name);
    System.out.println("Age: "+ this.age);
    System.out.println("ID Number:"+ this.IDNumber);
}
}