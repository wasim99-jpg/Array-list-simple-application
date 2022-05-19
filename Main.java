
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.util.Scanner;
public class Main
{
   
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        MyArrayList studList = new MyArrayList();
        String name;
        int id;
        int sc;
        Student stud = new Student();
        System.out.print("number of student:");
        //how many student do you want to insert?
        int num = in.nextInt();
        
        //loop for inserting data
        for(int i=0;i<num;i++)
        {
            System.out.print("\nEnter name : ");
            name=in.next();
            
            System.out.print("\nstudent ID : ");
            id=in.nextInt();
            
            System.out.print("\nstudent score : ");
            sc=in.nextInt();
            
            //after inputing all the data, it will store in the stud
            stud = new Student(name,id,sc);
            
            //by adding insertAtFront() it will add our data at the front of the arrayList
            studList.insertAtBack(stud);

        }
        
        //print out student details
        System.out.print("\nstudent details : ");
        for(int i=0;i<studList.size();i++)
        {
            //everytime we need to print out details from arraylist we need to use get()
            System.out.print(studList.get(i));
        }
        
        int total=0;
        for(int i=0; i<studList.size();i++)
        {
            stud = (Student)studList.get(i);
            total = total + stud.getScore();
        }
        System.out.println("\nTotal = " + total);
    }
}
