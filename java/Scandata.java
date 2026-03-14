import java.util.*;
class Scandata 
{
    public static void main(String args[])
    {
       String name,city;
       int age;
       Scanner s=new Scanner(System.in);
       System.out.println("enter the age:");
       age=s.nextInt();
       s.nextLine();
       System.out.println("enter the name:");
       name=s.nextLine();
       System.out.println("enter the city name:");
       city=s.nextLine();
       System.out.println("age="+age);
       System.out.println("city="+city);
       System.out.println("name="+name);
    }
}