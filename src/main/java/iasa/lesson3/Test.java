package iasa.lesson3;

public class Test {
    public static void groupTest(String[] args) {
        Group g1 = new Group("IS-ZP-71", new Date(), new Date());
        g1.add(new Student("Alex", new Date()));
        g1.add(new Student("Victor", new Date()));
        g1.add(new Student("Ira", new Date()));
        g1.add(new Student("Masha", new Date()));
        g1.setStudents(null);
        g1.setHead(new Student("Alex", new Date()));
        System.out.println(g1.toString());
    }

    public static void main(String[] args) {
        Cathedra ca = new Cathedra("MMCA");
        ca.addTeacher(new Teacher("T1", new Date()));
        ca.addTeacher(new Teacher("T2", new Date()));
        ca.addTeacher(new Teacher("T3", new Date()));
        ca.addTeacher(new Teacher("T4", new Date()));

        Group g1 = new Group("IS-ZP-71", new Date(), new Date());
        g1.add(new Student("Alex", new Date()));
        g1.add(new Student("Victor", new Date()));
        g1.add(new Student("Ira", new Date()));
        g1.add(new Student("Masha", new Date()));
        g1.setHead(new Student("Alex", new Date()));

        ca.addGroup(g1);
        ca.addGroup(new Group("ZP-IS-72", new Date(), new Date()));

        System.out.println(ca.toString());
    }
}
