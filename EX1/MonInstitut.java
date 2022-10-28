package TP5.EX1;

public class MonInstitut {

    public static void main(String[] args) {
        Specialite java=new Specialite("java", "JAVA/JEE");
        Specialite net=new Specialite("net", ".net");
        Specialite gdp=new Specialite("gdp", "Gestion de projet");
        Specialite cisco=new Specialite("cisco", "CISCO");
        Specialite php=new Specialite("php", "PHP");
    
        Professeur amal=new Professeur(java, "Amal", "SAFI", "55 054 593", "SafiAmal@gmail.com");
        Professeur kamal=new Professeur(java, "Kamel", "BEN HMIDA", "94 344 223", "KaemlBenhimda@gmail.com");
    
        Professeur nourdin=new Professeur(net, "Nourdine", "SAID", "95 099 113", "NourdineSaid@gmail.com");
    
        Professeur sonia=new Professeur(gdp, "Sonia", "SALIMI", "55 054 593", "SafiAmal@gmail.com");
    
        Professeur salem=new Professeur(cisco, "Salem", "BENARBIA", "92 044 333", "Salem@gmail.com");
    
        Professeur sohaib=new Professeur(php, "Sohaib", "MALEK", "99 305 593", "Sohaib@gmail.com");

        System.out.println(java.toString());
        System.out.println(amal.toString());
        System.out.println(kamal.toString());
        System.out.println(net.toString());
        System.out.println(nourdin.toString());
        System.out.println(sonia.toString());
        System.out.println(cisco.toString());
        System.out.println(salem.toString());
        System.out.println(php.toString());
        System.out.println(sohaib.toString());
    }
}
