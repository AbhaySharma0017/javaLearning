import java.util.Scanner;
class Person{
  private String firstName;
  private String lastName;

  public Person(String firstName, String lastName)
  {
    this.firstName = firstName;
    this.lastName = lastName;
  }   
   public Person(){

  }
  //  void set(String firstName, String lastName)
  //  {
  //    this.firstName = firstName;
  //    this.lastName = lastName;
  //  }
    String getFirstName()
   {
    return firstName;
   }
   String getLastName()
   {
    return lastName;
   }
}

class Employee extends Person{
    private int id;
    private String jobTitle;

    public Employee(String firstName,String lastName,int id,String jobTitle){
    super(firstName,lastName);
    this.id = id;
    this.jobTitle = jobTitle;
    }   
    // void set( int id, String jobTitle)
    // {
    //     this.id = id;
    //     this.jobTitle = jobTitle;
    // }      
    int getId()
    {
        return id;
    } 
    String getJobTitle()
    {
        return jobTitle;
    }
}

class MainTest{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the number of employees: ");
      int size = Integer.parseInt(sc.nextLine());
      Employee e[] = new Employee[size];

      for(int i=0; i<e.length; i++)
      {
        System.out.print("Enter  first name of employee: ");
        String firstName  = sc.nextLine();

        System.out.print("Enter last name of employee: ");
        String lastName= sc.nextLine();

        System.out.print("Enter id of employee: ");
        int id = Integer.parseInt(sc.nextLine());

        System.out.print("Enter job title of employee: ");
        String jobTitle = sc.nextLine();

        e[i] = new Employee(firstName,lastName,id,jobTitle);
      }

      for(int i=0; i<e.length; i++)
      {
        System.out.print("FirstName: "+e[i].getFirstName()+" LastName: "+e[i].getLastName()+" Id: "+e[i].getId()+" Job Title: "+e[i].getJobTitle());
        System.out.println();
      }
    }
}