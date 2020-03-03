import java.util.ArrayList;

public class T {
    public static void main(String[] args) throws Exception {
        Project googlas = new Project();
        googlas.setName("google");
        Project bingas = new Project();
        bingas.setName("bing"); //trash
        System.out.println(googlas.getName() + ", " + bingas.getName());

        Project projects[] = {googlas, bingas};

        Project rastas_googlas = Project.getProject(projects, "google");
        Project rastas_bingas = Project.getProject(projects, "bing");
        Project rastas_null = Project.getProject(projects, "duckduckgo");

        System.out.println(rastas_googlas.getName());
        System.out.println(rastas_bingas.getName());
        //System.out.println(rastas_null.getName()); //ismes klaida del null reiksmes

        //Checking. Create an object of type Employment in the main method of class T. Assign values for the object using method setValues (use any Project object from the previous exercise).
        //Check all set and get methods from class Employment. Print the name of the employment project.

        Employment goo = new Employment();
        goo.setValues(googlas, 600.0, "dev", 29.2);

        System.out.println("googlas: " + goo.getPrj()  + ", " + goo.getPrj().getName() + ", " + goo.getSalary() + ", " + goo.getPosition() + ", " + goo.getHours() );

        goo.setPrj(bingas);
        goo.setSalary(750.0);
        goo.setPosition("lead dev");
        goo.setHours(35.0);

        System.out.println("bingas: " + goo.getPrj()  + ", " + goo.getPrj().getName() + ", " + goo.getSalary() + ", " + goo.getPosition() + ", " + goo.getHours() );
    
        // Create an object of type Employee in the main method of class T. Assign the name for it and check how many employments it has. 
        // Then add an employment for the employee and check how many employments the employee has now.

        Employee dede = new Employee(4);

        dede.setName("Juozas");

        System.out.println(dede.getHowManyEmpl());

        dede.addEmpl(goo);

        System.out.println(dede.getHowManyEmpl());



        
        //Using this array create arrays of Project objects and Employee objects. How many projects are in the example? How many employees are in the example? 
        //Assume that you do not see this 2-dimensional array and that it can be different, thus, do not use constants, use dynamic array size, etc.  
        //Print monthly salary, hours per week, hourly wage of each employee. Test all methods, e.g. check how many projects Ugnius works on and what they are, 
        //how much he earns in each project, and what his position is.

        String[][] data = {
            //name, project, hours per week, salary, position
            {"Liepa", "TEMP", "15", "1000", "programmer"},
            {"Liepa", "MobileApp", "25", "1700", "project manager"},
            {"Ugnius", "TEMP", "20", "2000", "project manager"},
            {"Ugnius", "MedCentre", "20", "4000", "project manager"},
            {"Laimis", "TEMP", "20", "1200", "programmer"},
            {"Laimis", "MedCentre", "20", "2000", "programmer"},
            {"Giedrius", "TEMP", "40", "4000", "senior programmer"},
            {"Lainius", "MobileApp", "30", "3000", "programmer"},
            {"Lainius", "MedCentre", "10", "1000", "analyst"} 
        };


        /*

            THIS IS VERY VERY VERY INNEFICIENT, ARRAYLIST WOULD BE BETTER

        */

        String names[] = new String[data.length];
        String projs[] = new String[data.length];
        int diff_ppl=0;
        int diff_prj=0;
        boolean dupe_name = false;
        boolean dupe_proj = false;
        for(String[] row : data) {
            dupe_name = false;
            dupe_proj = false;
            for(String name : names) {
                if(name != null && name.equals(row[0])) { //neuzpildyti laukeliai yra null
                    dupe_name = true;
                    continue; //no point looping further
                }
            }
            for(String proj : projs) {
                if(proj != null && proj.equals(row[1])) { //neuzpildyti laukeliai yra null
                    dupe_proj = true;
                    continue; //no point looping further
                }
            }
            if(!dupe_name) {
                names[diff_ppl] = row[0];
                diff_ppl++;
            }
            if(!dupe_proj) {
                projs[diff_prj] = row[1];
                diff_prj++;
            }
        }

        Project data_projects[] = new Project[diff_prj];
        Employee data_employees[] = new Employee[diff_ppl];
        for(int i=0; i<diff_prj; i++) {
            data_projects[i] = new Project();
            data_projects[i].setName(projs[i]);
        }
        for(int i=0; i<diff_ppl; i++) {
            data_employees[i] = new Employee(0);
            data_employees[i].setName(names[i]);
        }
        for(String[] row : data) {
            for(Employee employee : data_employees) {
                String name = employee.getName();
                if(name.equals(row[0])) {
                    Employment temp_empl = new Employment();
                    Project temp_prj = new Project();
                    temp_prj.setName(row[1]);
                    temp_empl.setValues(temp_prj, Double.parseDouble(row[3]), row[4], Double.parseDouble(row[2]));
                    employee.addEmpl(temp_empl);
                }
            }
        }

        for(Employee empl : data_employees) {
            System.out.println(empl.getName() + " - week hours: " + empl.getWeekHours() + ", avg hour price: " + empl.getAvgHourPrice() + ", monthly salary: " + empl.getMonthlySalary() + ", employments: " + empl.getHowManyEmpl());
        }


    }
}