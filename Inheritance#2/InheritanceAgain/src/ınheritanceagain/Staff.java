package ınheritanceagain;

import java.util.Scanner;

public class Staff {
        Scanner scanner =new Scanner(System.in);
    private String name;
    private int salary;
    private String department;

    public Staff(String name, int salary, String department) {
        this.department = department;
        this.name = name;
        this.salary = salary;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void giveInfo() {
      System.out.println("Isim : " + name);
        System.out.println("Maas : " + salary);
        System.out.println("Departman : " + department);
       
    }

    public void changeDepartment() {

        
        System.out.print("Departmanınız güncelleniyor\n" +
                       "Güncel departmaninizi giriniz : ");
        String current = scanner.nextLine();
        this.department = current;
        System.out.println("Yeni departmanınız :" + department);
                     giveInfo();
    }

    public void ıkramiye(int miktar) {
        salary = salary + miktar;

        System.out.println(salary + " maaslı işinizde " + miktar + "zam yapılmıştır. ");

    }

}
