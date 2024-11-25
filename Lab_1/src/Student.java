import java.util.*;

public class Student
{
    String Name, Group;
    int Course;
    int[] Rating;

    public Student(String name, String group, int course, int[] rating) {
        Name = name;
        Group = group;
        Course = course;
        Rating = rating;
    }


    public boolean CheckStudent()
    {
        int k=0;
        for(var i:Rating)
        {
            k+=i;
        }
        k=k/Rating.length;
        if(k <3)
        {
            return false;
        }
        if(Course<4)
        {
            Course++;
        }

        return true;
    }




    public String getName() {
        return Name;
    }

    public String getGroup() {
        return Group;
    }

    public int getCourse() {
        return Course;
    }

    public int[] getRating() {
        return Rating;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setGroup(String group) {
        Group = group;
    }

    public void setCourse(int course) {
        Course = course;
    }

    public void setRating(int[] rating) {
        Rating = rating;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", Group='" + Group + '\'' +
                ", Course='" + Course + '\'' +
                ", Rating=" + Arrays.toString(Rating) +
                '}';
    }
}
