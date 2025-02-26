package week6;
import java.util.Objects;

class Student {
    private String name;
    private int number;

    public Student(int number, String name) {
        this.name = name; this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Student) {
            return name == ((Student) o).name && (number == ((Student) o).number);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, name);
    }
}

public class week6_2 {
    public static void main(String[] args) {
        Student s1 = new Student(16, "dlwlrma");
        Student s2 = new Student(16, "dlwlrma");

        if(s1.hashCode() != s2.hashCode()){
            System.out.println("s1 != s2");
        }
        else if(!s1.equals(s2)){
            System.out.println("s1 != s2");
        }
        else{
            System.out.println("s1 == s2");
        }
    }
}
