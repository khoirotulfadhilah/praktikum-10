
package Praktikum10.Tugas;


public class NilaiMataKuliah extends MataKuliah{
  Double bobot_uts;  
  Double bobot_uas;
  Double bobot_lain2;
  Double nilai_uts;
  Double nilai_uas;
  Double nilai_lain2;
  Double nilai_akhir;
  String Grade;

  Mahasiswa mhs;
  public Double hitungNilai(){
      nilai_akhir = ((0.3*nilai_uts)+(0.3*nilai_uas)+(0.4*nilai_lain2));
      return nilai_akhir;
  }
  public void hitungGrade(){
      if(nilai_akhir>=80 && nilai_akhir<=100){
          
      }else if(nilai_akhir >=76 && nilai_akhir <=79){
          
      }else if(nilai_akhir >=70 && nilai_akhir<=75){
          
      }else if(nilai_akhir >=66 && nilai_akhir <=69){
          
      }else if(nilai_akhir >=60 && nilai_akhir <=65){
          
      }
  }
}
