package iasa.lesson3;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Cathedra {
    private final String name;
    private Optional<Teacher> head = Optional.empty();
    private List<Teacher> teachers = new ArrayList<>();
    private List<Group> groups = new ArrayList<>();

    public Cathedra(String name) {
        this.name = name;
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void addGroup(Group group) {
        groups.add(group);
    }

    public void setHead(Teacher teacher) {
        head = Optional.of(teacher);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cathedra: name:").append(this.name).append("\n");
        sb.append("Teachers list:\n");
        teachers.forEach(t -> sb.append(t.toString()).append("\n"));
        sb.append("Groups list:\n");
        groups.forEach(g -> sb.append(g.toString()).append("\n"));
        if (this.head.isPresent()) {
            sb.append("head:").append(head.get().toString()).append("\n");
        }
        return sb.toString();
    }
}
