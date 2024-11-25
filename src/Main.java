import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void printStudents(List<Student> students, int course)
    {
        for(int i=0; i<students.size(); i++)
        {
           if(students.get(i) != null)
           {
               if(students.get(i).getCourse() == course)
               {
                   System.out.println(students.get(i));
               }
               
           }
        }
    }

    public static void main(String[] args)
    {
            List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", "CS101", 1, new int[]{3, 4, 5}));
        students.add(new Student("Bob", "CS101", 1, new int[]{2, 3, 4, 5}));
        students.add(new Student("Charlie", "CS101", 1, new int[]{5, 4, 4, 3, 2}));
        students.add(new Student("Diana", "CS101", 2, new int[]{4, 5, 5}));
        students.add(new Student("Eve", "CS102", 2, new int[]{3, 4, 3}));
        students.add(new Student("Frank", "CS102", 2, new int[]{2, 2, 3, 4, 5}));
        students.add(new Student("Grace", "CS102", 2, new int[]{5, 5, 4}));
        students.add(new Student("Hank", "CS102", 3, new int[]{3, 3, 3, 4, 5}));
        students.add(new Student("Ivy", "CS103", 3, new int[]{2, 2, 3, 4}));
        students.add(new Student("Jack", "CS103", 3, new int[]{5, 4, 3, 5, 5}));
        students.add(new Student("Karen", "CS103", 3, new int[]{4, 3, 5, 5}));
        students.add(new Student("Leo", "CS104", 4, new int[]{5, 5, 5, 4}));
        students.add(new Student("Mona", "CS104", 4, new int[]{3, 3, 4, 4, 5, 5}));
        students.add(new Student("Nina", "CS104", 4, new int[]{2, 4, 4, 5}));
        students.add(new Student("Oscar", "CS104", 4, new int[]{5, 3, 5, 4}));
        students.add(new Student("Paul", "CS105", 1, new int[]{2, 3, 4}));
        students.add(new Student("Quinn", "CS105", 1, new int[]{3, 5, 5, 5, 4}));
        students.add(new Student("Rachel", "CS105", 2, new int[]{4, 4, 3}));
        students.add(new Student("Steve", "CS105", 3, new int[]{2, 2, 3, 5, 4}));
        students.add(new Student("Tom", "CS105", 3, new int[]{5, 5, 4, 4}));


        boolean a;

        for(int i=0; i<students.size(); i++)
        {
            a= students.get(i).CheckStudent();
            if(!a)
            {
                System.out.println("Студент "+students.get(i).getName()+ " Был искулючен");
                students.set(i, null);

            }
        }


        printStudents(students,3);




    }
}