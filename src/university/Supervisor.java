package university;

import java.util.ArrayList;
import java.util.List;

public class Supervisor implements Faculty {

    private String name;
    private String departmentName;

    private List<Faculty> facultyList;

    public Supervisor(String name, String departmentName) {
        this.name = name;
        this.departmentName = departmentName;
        this.facultyList = new ArrayList<>();
    }

    @Override
    public String getDetails() {
        return (name + " is the " + departmentName);
    }

    public void add(Faculty professor) {
        facultyList.add(professor);
    }

    public void remove(Faculty professor) {
        facultyList.remove(professor);
    }

    public List<Faculty> getFacultyList() {
        return facultyList;
    }


}
