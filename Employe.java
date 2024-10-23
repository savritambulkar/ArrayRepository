import java.io.Serializable;
public class Employe implements Serializable
{
   private int Employe_Id;
    private String Employe_Name;
    transient private String Employe_Contect;
    public Employe (  int Employe_Id,String Employe_Name,String Employe_Contect)
    {
        this.Employe_Id=Employe_Id;
        this.Employe_Name=Employe_Name;
        this.Employe_Contect=Employe_Contect;
    }
    public Employe()
    {

    }
    public int getId()
    {
     return Employe_Id;
    }
    public String getName()
    {
        return Employe_Name;

    }
    public String getContect()
    {
        return Employe_Contect;
    }
}

