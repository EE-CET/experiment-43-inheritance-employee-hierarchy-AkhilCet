import java.util.Scanner;

class Employee {
   String name;
   int age;
   double phoneNumber;
   string address;
   int salary;

   Employee(String n,int a,double pN,string ad,int s)
   {
      this.name = n;
      this.age = a;
      this.phoneNumber = pN;
      this.address = ad;
      this.salary = s;
   }
}

class Officer extends Employee{
   string specialization;

   Officer(String n,int a,double pN,String ad,int s,String sp)
   {
      super(n,a,pN,ad,s);
      this.specialization = sp;
   }
}

class Manager extends Employee{
   string department;

   Manager(String n,int a,double pN,String ad,int s,String d)
   {
      super(n,a,pN,ad,s);
      this.department = d;
   }
}


public class EmployeeInheritance {
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      String name = input.nextLine();
      int age = input.nextInt();
      double phone = input.nextDouble();
      String ad = input.nextLine();
      int sal = input.nextInt();
      String spec = input.nextLine();

      Officer off1 = new Officer(name,age,phone,ad,sal,spec);

      name = input.nextLine();
      age = input.nextInt();
      phone = input.nextDouble();
      ad = input.nextLine();
      sal = input.nextInt();
      spec = input.nextLine();
      
      Manager man1 = new Manager(name,age,phone,ad,sal,spec);

      System.out.println("Offcier:");
      System.out.println(off1.name);
      System.out.println(off1.age);
      System.out.println(off1.phoneNumber);
      System.out.println(off1.address);
      System.out.println(off1.salary);
      System.out.println(off1.specialization);

      System.out.println("Manager:");
      System.out.println(man1.name);
      System.out.println(man1.age);
      System.out.println(man1.phoneNumber);
      System.out.println(man1.address);
      System.out.println(man1.salary);
      System.out.print(man1.department);
      
   }
    
}
