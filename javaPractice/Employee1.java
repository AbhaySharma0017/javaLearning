class Employee1{
    private int empId;
    private float salary;

    public Employee1(int empId, float salary){
      this.empId = empId;
      this.salary = salary;
    }
    int getId(){
        return empId;
    }
    float getSalary(){
        return salary;
    }
}