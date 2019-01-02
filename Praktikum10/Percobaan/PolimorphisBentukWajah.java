
package Praktikum10.Percobaan;

public class PolimorphisBentukWajah {
    /**
     * Main method
     */
    public static void main(String[] args) {
        System.out.println("\n Program polimorfis");
        System.out.println("=====================");
        //membuat objek-objek raut dari wajah
        BentukWajah objbentuk=new BentukWajah();
        Senyum objsenyum=new Senyum();
        Tertawa objtertawa = new Tertawa();
        Marah objmarah = new Marah();
        Sedih objsedih = new Sedih();
        //polimorphism dari bentukwajah ada 5 dimulai dari 0-4
        BentukWajah []Bentuk= new BentukWajah[0];
        Bentuk[0]=objbentuk;
        Bentuk[1]=objsenyum;
        Bentuk[2]=objtertawa;
        Bentuk[3]=objmarah;
        Bentuk[4]=objsedih;
        System.out.println("Bentuk[0] : "+Bentuk[0].respons());
        System.out.println("Bentuk[1] : "+Bentuk[1].respons());
        System.out.println("Bentuk[2] : "+Bentuk[2].respons());
        System.out.println("Bentuk[3] : "+Bentuk[3].respons());
        System.out.println("Bentuk[4] : "+Bentuk[4].respons());



    }
}
