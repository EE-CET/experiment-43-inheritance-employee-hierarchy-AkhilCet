import java.util.Scanner;

class Employee {
   String name;
   int age;
   String phoneNumber;
   String address;
   int salary;

   Employee(String n,int a,String pN,String ad,int s)
   {
      this.name = n;
      this.age = a;
      this.phoneNumber = pN;
      this.address = ad;
      this.salary = s;
   }
}

class Officer extends Employee{
   String specialization;

   Officer(String n,int a,String pN,String ad,int s,String sp)
   {
      super(n,a,pN,ad,s);
      this.specialization = sp;
   }
}

class Manager extends Employee{
   String department;

   Manager(String n,int a,String pN,String ad,int s,String d)
   {
      super(n,a,pN,ad,s);
      this.department = d;
   }
}


public class EmployeeInheritance {
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);


      String name1 = input.nextLine();
      int age1 = input.nextInt();
      input.nextLine(); // Consume newline left-over
      String phone1 = input.nextLine();
      String ad1 = input.nextLine();
      int sal1 = input.nextInt();
      input.nextLine(); // Consume newline left-over
      String spec1 = input.nextLine();

      Officer off1 = new Officer(name1,age1,phone1,ad1,sal1,spec1);

      String name2 = input.nextLine();
      int age2 = input.nextInt();
      input.nextLine(); // Consume newline left-over
      String phone2 = input.nextLine();
      String ad2 = input.nextLine();
      int sal2 = input.nextInt();
      input.nextLine(); // Consume newline left-over
      String dept1 = input.nextLine();
      Manager man1 = new Manager(name2,age2,phone2,ad2,sal2,dept1);

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
      
      input.close();
   }

    
}
