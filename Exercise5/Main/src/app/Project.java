/**
 * Project
 */
public class Project {
    private String name;
    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static Project getProject(Project[] projects, String name) {
        for(Project project : projects) {
            if(project.getName().equals(name)) {
                return project;
            }
        }
        return null;
    }

    
    
}