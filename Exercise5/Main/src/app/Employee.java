/**
 * Employee
 */
public class Employee {
    private String name;
    private Employment[] empls = new Employment[8];
    private int howManyEmpl;

    public Employee(int howManyEmpl) {
        this.howManyEmpl = howManyEmpl;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Employment[] getEmpls() {
        return empls;
    }

    public int getHowManyEmpl() {
        return howManyEmpl;
    }

    //Define method addEmpl that has an input parameter of type Employment. The method does not return anything.
    //The method gets an employment object, adds it to array empls, and increments value of howManyEmpl.
    
    public void addEmpl(Employment empl) {
        empls[howManyEmpl] = empl; //wouldnt arrayList be easier tho?
        howManyEmpl++;
    }

    //Define method getMonthlySalary that calculates the employee salary of one month and returns it. The salary consists of all salaries of all employments of one employee.

    public double getMonthlySalary() {
        double total = 0;
        for(int i=0; i<howManyEmpl; i++) { //siaip empls.length butu geriau
            total+=empls[i].getSalary();
        }
        return total;
    }

    //Define method getWeekHours that calculates the employee working hours per week. The hours of all employments of the employee should be summed.

    public double getWeekHours() {
        double total = 0;
        for(int i=0; i<howManyEmpl; i++) { //siaip empls.length butu geriau
            total+=empls[i].getHours();
        }
        return total;
    }

    //Define method getAvgHourPrice that calculates the average wage per hour of the employee. Let us assume that one month consists of 4 weeks.

    public double getAvgHourPrice() {
        final double HOURS_IN_MONTH = 672; //7 * 4 * 24

        return getMonthlySalary() / HOURS_IN_MONTH;
    }

    //Define a static method getEmployee that gets an array of employees and the name of the employee. 
    //The method returns reference to the Employee object that has a name provided as a parameter to the method.
    //If no employee has such a name then the method returns null.

    public static Employee getEmployee(Employee[] employees, String name) {
        for(Employee employee : employees) {
            if(employee.getName().equals(name)) {
                return employee;
            }
        }
        return null;
    }


}