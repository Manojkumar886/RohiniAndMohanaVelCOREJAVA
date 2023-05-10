package FundamentalJava.ConsoleApplication;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


//@-annotation
@Data//getter and setter and tostring
@NoArgsConstructor//Default Constructor
@AllArgsConstructor//Parameterized Constructor
public class ZealousCustomerDetails
{
    private String StudentName;
    private double Hours;
    private long StudentMobileno;
    private String CourseDetail;
    private float price;
    private String inchargeName;


}