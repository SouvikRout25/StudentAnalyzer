import java.util.ArrayList;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Subho",325));
        studentList.add(new Student("Arin", 350));
        studentList.add(new Student("Rohan", 345));
        studentList.sort((o1, o2) -> o2.getMarks()- o1.getMarks());
        for(Student element : studentList){
            System.out.println(element);
        }
        System.out.println();
        studentList.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
        for (Student student : studentList){
            System.out.println(student);
        }
    }

}
