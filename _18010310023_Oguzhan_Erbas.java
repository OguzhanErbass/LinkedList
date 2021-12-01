
package _18010310023_oguzhan_erbas;

import java.io.*;
import java.util.Scanner;





/**
 *
 * @author Oğuzhan Erbaş - 18010310023
 */
public class _18010310023_Oguzhan_Erbas {

   
    public static void main(String[] args) throws IOException {
            
          
        _18010310023_Linkedlist liste = new _18010310023_Linkedlist();
        
        
        String satir,tc,ad,soyad;
        String[] dizi=null;
       
        
        try{
            
            BufferedReader textoku = new BufferedReader (new FileReader("kayit_dosyasi.txt"));
            
            for (int sayac = 0; sayac < 5000; sayac++) {
                
                satir = textoku.readLine(); //texti okuyup satir adli string değişkene atar.
                
                dizi =satir.split(","); // virgül den itibaren parçalar ve diziye gönderir
                
                tc= dizi[0];//dizinin 0. indeksini tc adlı değişkene gönderir
                ad=dizi[1];//dizinin 1. indeksini tc adlı değişkene gönderir
                soyad=dizi[2];//dizinin 2. indeksini tc adlı değişkene gönderir
                liste.insert(new _18010310023_Node (Long.valueOf(tc),ad,soyad));
                
            }
            
           
            Scanner girdi =new Scanner(System.in);  // kullanıcan tc ve sıra degerlerini alabilmek için Scanner sınıfı kullandım
    
            System.out.println("Silmek istediğiniz kayıtın Tc'sini giriniz..");

            System.out.println("Silmiş oldugunuz Kayıt Sirasi : "+ liste.delete(girdi.nextLong())); // kullanıcının girdiği Tc nin kaydını siler ve sıra sayısını döndürür..
    
            System.out.println("Kayit sayisi"+ liste.KayitSayisi());
           
           String isim= "lvxmlqtdta";
            String soyisim="rtadurkhwy";
            
            
            
            Long Tc=4532327123L;
            String Adi="lvxmlqtdta";
            String Soyadi="rtadurkhwy";
            System.out.println("Başarıyla kayıt edildi.");
            
             liste.insert(new _18010310023_Node (Tc,Adi,Soyadi)); // elemen ekleme
            System.out.println("Kayit sayisi"+ liste.KayitSayisi());//kayıt sayısını yazdırır
            
           
            
            
            double startTime = System.nanoTime(); //kronometre baskangıç
                  _18010310023_Node x = null;
                   x =liste.NodeSearch(9714239499L);
          
            double endTime =System.nanoTime();//kronometre bitis
           
              double gecensure = endTime - startTime; // gecen sureyi nanosaniye cinsinden alıyoruz
              //mili saniye cinsinden bazen 1milisaniye bazende 0 cıktıgı için nanosaniye olarak yaptım.
              double seconds = (double)gecensure/1000000;//milisaniyeye çevirdik
              
               System.out.println("Aramada gecen Zaman : "+gecensure+" milisaniye");//geçen süreyi yazdırır
           
            System.out.println("Aranan dugum elemanları :");
           liste.yazdir(x);// x dugumunu yazdırır
           
           _18010310023_Node k =liste.Return_kayit(2); // sırası ikinci olan dugumu  k dugumune aktarır
            System.out.println("Sirasi return edilen kayit elemanlari");
           liste.yazdir(k); // k dugumunu yazdırır
           
        }
        
         catch (IOException iox)
         {
             //eğer try komutunun içinde hata olusursa ekrana yazdır.
            System.out.println("kayit_dosyasi.txt"+" adli dosya okunamiyor."); 
         
        
    }
        
        
  
          
          
          
          
}
}
