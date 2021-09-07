
import java.io.Serializable;

public class Student implements Serializable
{

    int id;
    String name;
    Address address;//HAS-A  

    public Student(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString()
    {
       String bilgiler = "id : " + id
                        +"ismi : " + name;
       return bilgiler;
    } 
    
}
        