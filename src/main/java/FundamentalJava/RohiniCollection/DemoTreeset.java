package FundamentalJava.RohiniCollection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.TreeSet;

public class DemoTreeset
{
//    Sorting a values
    public static void main(String[] args)
    {
        TreeSet<StudentDetails> object=new TreeSet<StudentDetails>();

        StudentDetails student1=new StudentDetails("Manojkumar","Madheswaran",21,89.9);
        StudentDetails student2=new StudentDetails("Rohini","Arul",31,99.9);
        StudentDetails student3=new StudentDetails("Mohanavel","Therila",23,88.9);
        StudentDetails student4=new StudentDetails("Annamalai","Subramani",27,78.9);

        object.add(student1);
        object.add(student2);
        object.add(student3);
        object.add(student4);

        System.out.println(object);

    }
}


@Data
@NoArgsConstructor
@AllArgsConstructor
class StudentDetails implements Comparable<StudentDetails>
{
    String studentname;
    String studentFathername;
    int studentAge;
    double studentPercentage;

    @Override
    public int compareTo(StudentDetails object) {
        return this.studentFathername.compareTo(object.studentFathername);
    }
}