package FundamentalJava.RohiniCollection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;
import java.util.TreeMap;

public class DemoTreeMap
{
    public static void main(String[] args)
    {
        TreeMap<String,StudentDetails1> object1=new TreeMap<>();

        StudentDetails1 student1=new StudentDetails1("Manojkumar","Madheswaran",21,89.9);
        StudentDetails1 student2=new StudentDetails1("Rohini","Arul",31,99.9);
        StudentDetails1 student3=new StudentDetails1("Mohanavel","Therila",23,88.9);
        StudentDetails1 student4=new StudentDetails1("Annamalai","Subramani",27,78.9);

        object1.put("ANNAMALAI",student4);
        object1.put("MANOJKUMAR",student1);
        object1.put("ROHINI",student2);
        object1.put("MOHANAVEL",student3);


        System.out.println(object1);

        System.out.println(object1.entrySet());///obejct converting an array


        for(Map.Entry  newobject:object1.entrySet())
        {
            System.out.println("my key name "+newobject.getKey()+"\t my value details "+newobject.getValue());
        }
    }
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class StudentDetails1 implements Comparable<StudentDetails1>
{
    String studentname;
    String studentFathername;
    int studentAge;
    double studentPercentage;

    @Override
    public int compareTo(StudentDetails1 object) {
        return this.studentFathername.compareTo(object.studentFathername);
    }
}
