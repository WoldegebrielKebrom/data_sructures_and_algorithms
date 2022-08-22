package LinkedList;

public class Person {
    private String name;
    private String rollno;

    public Person(String name, String rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", rollno='" + rollno + '\'' +
                '}';
    }
}
