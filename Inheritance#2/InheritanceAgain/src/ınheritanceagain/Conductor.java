
package ınheritanceagain;

public class Conductor extends Staff{
    
      private int responsablePerson;

    public int getResponsablePerson() {
        return responsablePerson;
    }

    public void setResponsablePerson(int responsablePerson) {
        this.responsablePerson = responsablePerson;
    }
    
    
    public Conductor(String name,int salary,String deparment,int responsablePerson){
        
        super(name, salary, deparment);
       this.responsablePerson = responsablePerson;
       
    }
    public void giveInfo()
    {
        super.giveInfo();
        System.out.println("Sorumlu oldugu kişi sayisi : " + responsablePerson);
    }
    
}
