import java.time.LocalDate;

public class School {

    private String name;
    private String founder;
    private LocalDate buildDay;
    private int students;

    public School(){}

    public School(String name, String founder, LocalDate buildDay, int students){
        this.name=name;
        this.founder=founder;
        this.buildDay=buildDay;
        this.students=students;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setFounder(String founder) {
        this.founder = founder;
    }

    public String getFounder() {
        return founder;
    }

    public void setBuildDay(LocalDate buildDay) {
        this.buildDay = buildDay;
    }

    public LocalDate getBuildDay() {
        return buildDay;
    }

    public void setStudents(int students) {
        this.students = students;
    }

    public int getStudents() {
        return students;
    }
}

