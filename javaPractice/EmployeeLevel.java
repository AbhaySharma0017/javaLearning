import java.util.Scanner;
class EmployeeLevel extends Employee1{
   public static void main(String args[])
   {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of employees: ");
    int size = Integer.parseInt(sc.nextLine());

    Employee1 e1 = new Employee1[size];
    for(int i=0; i<e1.length; i++)
    {
        System.out.print("Enter ID of employee: ");
        int id = Integer.parseInt(sc.nextLine());

        System.out.println("Enter salary of user: ");
        float salary = Float.parseFloat(sc.nextLine());

        e1[i] = new Employee1(id,salary);
    }
    for(int i=0; i<e1.length; i++)
    {
        System.out.print("Id: "+e1.getId()+" /n Salary: "+e1.getSalary());
        if(e1.getSalary() <= 100)
        {
            System.out.print("Level : 1");
        }
        else{
            System.out.print("Level : 2");
        }
    }
   }
}