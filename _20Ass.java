class NoDepartmentException extends RuntimeException{
    public NoDepartmentException(String msg){
        super(msg);
    }
}
interface Collage{
    String CollageName = "Govt Collage Indore";
}
class Teacher{
    String name;
    String Qualification;
    public Teacher(String name,String Qualification){
        this.name=name;
        this.Qualification=Qualification;
    }
    public void Display(){
     System.out.println("Teacher name ="+name);
     System.out.println("Student Qualification ="+Qualification);
    }
}
class Department extends Teacher implements Collage{
    int depNo;
    String depName;
    public Department (String Name, String Qualification , int depNo , String depName){
    super(Name , Qualification);
    this.depNo=depNo;
    this.depName=depName;
    }
    public  void display(){
        super.Display();
        System.out.println("Department Name ="+depName);
        System.out.println("Department No"+depNo);
        System.out.println("Collage Name"+ CollageName);
    }
}
 class Drive{
    public static void main(String[] args) {
      try{
        int depNoFromUser=20;
        Department  a=new Department("Savri Tambulkar", "B.com", depNoFromUser ,"Commerce" );
        a.display();
      }  
      catch(NoDepartmentException e){
        System.out.println(e.getMessage());

      }
    }
    public static void validdatadepartment(int depNo) throws NoDepartmentException {
        if(! (depNo==10||depNo==20||depNo==30)){
          throw new NoDepartmentException("InvalidDepartmentNo Plece Enter 10 20 30 ");
        }
    }
}