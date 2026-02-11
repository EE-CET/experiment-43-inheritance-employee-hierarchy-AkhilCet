import java.util.Scanner;

class Employee {
   String name;
   int age;
   double phoneNumber;
   string address;
   float salary;

   Employee(String n,int a,double pN,string ad,float s)
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

   Officer(String n,int a,double pN,string ad,float s,String sp)
   {
      super(n,a,pN,ad,s);
      this.specialization = sp;
   }
}

class Manager extends Employee{
   string department;

   Officer(String n,int a,double pN,string ad,float s,String d)
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
      float sal = input.nextFloat();
      String spec = input.nextLine();

      Officer off1 = new Officer(name,age,phone,ad,sal,spec);

      name = input.nextLine();
      age = input.nextInt();
      phone = input.nextDouble();
      ad = input.nextLine();
      sal = input.nextFloat();
      spec = input.nextLine();
      
      Manager man1 = new Manager(name,age,phone,ad,sal,spec);

      Syetem.out.println("Offcier:")
      Syetem.out.println(off1.name)
      Syetem.out.println(off1.age)
      Syetem.out.println(off1.phoneNumber)
      Syetem.out.println(off1.address)
      Syetem.out.println(off1.salary)
      Syetem.out.println(off1.specialization)

      Syetem.out.println("Manager:")
      Syetem.out.println(man1.name)
      Syetem.out.println(man1.age)
      Syetem.out.println(man1.phoneNumber)
      Syetem.out.println(man1.address)
      Syetem.out.println(man1.salary)
      Syetem.out.print(man1.department)
      
   }
    
}
