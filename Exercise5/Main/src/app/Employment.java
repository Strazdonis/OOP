/**
 * Employment
 * Project prj
 * double salary
 * String position
 * double hours
 */
public class Employment {
    private Project prj;
    private double salary;
    private String position;
    private double hours;

    public void setValues(Project prj, double salary, String position, double hours) {
        this.prj = prj;
        this.salary = salary;
        this.position = position;
        this.hours = hours;
    }

    //define set,get methods for each variable

    public void setPrj(Project prj) {
        this.prj = prj;
    }
    public Project getPrj() {
        return prj;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
    
    public void setPosition(String position) {
        this.position = position;
    }
    public String getPosition() {
        return position;
    }
    
    public void setHours(double hours) {
        this.hours = hours;
    }
    public double getHours() {
        return hours;
    }




}