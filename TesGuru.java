import java.util.Scanner;
//Driver Class
public class TesGuru {

    public static void main(String[] args) {
      Scanner in = new Scanner (System.in);
      System.out.println("Nama");

      
      
      String nama = in.nextLine();
      System.out.println("Mapel :");
      String Mapel = in.nextLine();     
      System.out.println("Alamat:");
      String Alamat = in.nextLine();  
      System.out.println("ID :");
    

      //membuat obyek
      Guru aulia = new Guru (1, "aulia", "malang", "rpl");
      Guru pasha = new Guru(2, "Bu Phasa", "Malang","Rpl");
      Guru feni = new Guru(3, "feni", "malang", "mtk");
      Guru munif = new Guru(4, "munif", "malang", "agama");
      Guru bidin = new Guru(5, "bidin", "malang", "mtk");
        
    aulia.id =1;
    aulia.setNama("Bu aul");
    aulia.setMapel("Rpl");
    aulia.setAlamat("Malang");
    
    pasha.id =2;
    pasha.setNama("Bu Pasha");
    pasha.setMapel("Rpl");
    pasha.setAlamat("Malang");
    
    feni.id =3;
    feni.setNama("Bu feni");
    feni.setMapel("Mtk");
    feni.setAlamat("Malang");
    
    munif.id =4;
    munif.setNama("Pak munif");
    munif.setMapel("Agama");
    munif.setAlamat("Malang");

    bidin.id =5;
    bidin.setNama("Pak bidin");
    bidin.setMapel("Mtk");
    bidin.setAlamat("Malang");
    
    System.out.println("Ini Data Bu Aulia");
    System.out.println(aulia.id);
    System.out.println(aulia.getNama());
    System.out.println(aulia.getAlamat());
    
    System.out.println("Ini Data Bu Pasha");
    System.out.println(pasha.id);
    System.out.println(pasha.getNama());
    System.out.println(pasha.getAlamat());

    System.out.println("Ini Data Bu feni");
    System.out.println(feni.id);
    System.out.println(feni.getNama());
    System.out.println(feni.getAlamat());

    System.out.println("Ini Data Pak Munif");
    System.out.println(munif.id);
    System.out.println(munif.getNama());
    System.out.println(munif.getAlamat());

    System.out.println("Ini Data Pak bidin");
    System.out.println(bidin.id);
    System.out.println(bidin.getNama());
    System.out.println(bidin.getAlamat());

    aulia.print();
    pasha.print();
    feni.print();
    munif.print();
    bidin.print();
    }
}
