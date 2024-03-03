import java.util.ArrayList;
import java.util.List;

public class StudentGroup {
    private Teacher teacher;
    private Integer numberGroup;
    private List<Student> students;

    public StudentGroup(Integer numberGroup, Teacher teacher, ArrayList<Student> students) {
        this.teacher = teacher;
        this.numberGroup = numberGroup;
        this.students = students;
    }

    @Override
    public String toString() {
        return "Студенческая группа номер - " + numberGroup +
                ", преподаватель в группе - " + teacher +
                ", стурднты в группе - " + students;
    }
}
