package iasa.lesson3;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Group {
    private String name;
    private List<Student> students;
    private Optional<Student> head;
    private Date startDate;
    private Date finishDate;

    void setStudents(List<Student> ls) {
        students = ls;
    }

    List<Student> students() {
        return students;
    }

    public Group(String name, Date startDate, Date finishDate) {
        this(name, startDate, finishDate, new ArrayList<>(), Optional.ofNullable(null));
    }

    public Group(String name, Date startDate, Date finishDate, List<Student> students) {
        this(name, startDate, finishDate, students, Optional.ofNullable(null));
    }

    public Group(String name, Date startDate, Date finishDate, List<Student> students, Optional<Student> head) {
        this.name = name;
        this.students = students;
        this.head = head;
        this.startDate = startDate;
        this.finishDate = finishDate;
    }

    public void add(Student student) {
        students.add(student);
    }

    public boolean excude(Student student) {
        return students.remove(student);
    }

    public boolean inGroup(Student student) {
        return students.contains(student);
    }

    public Optional<Student> getHead() {
        return head;
    }

    public boolean setHead(Student student) {
        if (inGroup(student)) {
            head=Optional.of(student);
            return true;
        }
        return false;
    }

    public void removeHead() {
        head=Optional.ofNullable(null);
    }

    public boolean isHead(Student student) {
        return head.isPresent() && head.get().equals(student);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Group:").append(this.name).append("\n")
        .append("Start date:").append(this.startDate)
        .append("Finish date:").append(this.finishDate).append("\n");
        students.forEach(student -> sb.append(student.toString()).append("\n"));
        if (this.head.isPresent()) {
            sb.append("head:").append(head.get().toString()).append("\n");
        }
        return sb.toString();
    }
}
