class Person{
    private int id;
    private String name;
    private double salary;

    public void getId(int id){
        this.id = id;
    }
    public void getName(String name){
        this.name = name;
    }
    public void getSalary(double salary){
        this.salary = salary;
    }
    public Person(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public String toString(){
        return "Id: "+ id +" Name: "+name+" Salary: "+salary;
    }

    Person(){

    }

}
class Employee extends Person{
    private int age;

    public Employee(int id, String name, double salary, int age){
        super(id, name, salary);
        this.age = age;
    }
    public String toString(){
        return super.toString()+" Age: "+age;
    }
}
class ToString{
    public static void main(String args[]){
      System.out.println("Hello...");
      Person p1 = new Person(101,"Abhay",1000);
      System.out.println(p1);

      Employee e1 = new Employee(101,"Sharma",10000,21);
      System.out.println(e1);

    }
}