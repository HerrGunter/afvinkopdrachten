package javaapplication4;


public class Student {
    private String Studentnaam;
    private int Studentnummer;
    
    Student(){}
    
    Student(String s,int i){
        Studentnaam = s;
        Studentnummer = i;
    }
    
    public String getnaam(){
    return Studentnaam;
    }
    
    public void setNaam(String naam){
        this.Studentnaam = naam;
        
    }
    
    public int getStudentnummer(){
        return Studentnummer;
    }
    
    public void setStudentnummer(int Studentnummer){
        this.Studentnummer = Studentnummer;
    }

    
}
