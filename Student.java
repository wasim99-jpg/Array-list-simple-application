
public class Student
{
    
    private String name;
    private int ID;
    private int score;

    public Student(){}
    
    public Student(String n,int i, int s){name=n;ID=i;score=s;}
    
    public void setAll(String n,int id,int sc)
    {
        name=n;
        ID=id;
        score=sc;
    }
    
    public String getName(){return name;}
    public int getID(){ return ID;}
    public int getScore(){ return score;}
    
    public String toString()
    {
        return "\nName : "+getName()+"\nID : "+getID()+"\nScore : "+getScore();
    }
}
