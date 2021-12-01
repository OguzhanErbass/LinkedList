
package _18010310023_oguzhan_erbas;

/*
 *
 * @author Oğuzhan Erbaş - 18010310023
 */
public class _18010310023_Linkedlist {
    
    
    _18010310023_Node Start;
    public int boyut;
    int Sira;
    
    
    public _18010310023_Linkedlist()
    {
        boyut=0;
        Start = null;
        
    }
    
  
    public void insert( _18010310023_Node n) // Ekleme işlem yapar
    {
         _18010310023_Node ptr,temp=null;
         boolean ins = false;
         if(Start==null) {  // eğer liste boş ise atama yapar
             Start=n;
             n.sira++; // liste bos oldugu için daha önceki 0 olan sira degerini arttırıp 1 yapar.
             boyut++;
             n.sonsira=boyut-n.sira; // gelen n dugumunden sonra kaç dügümü oldugunu göstermek bulmak için boyuttan kendi sırasını çıkarırız.
         }
         
         else if(n.tc<Start.tc)    // eleman var iken başa eklemek
         {
             Start.sira++; 
             n.baglanti=Start; 
             Start=n;
             n.sira++;
             boyut++;
              n.sonsira=boyut-n.sira;// gelen n dugumunden sonra kaç dügümü oldugunu göstermek bulmak için boyuttan kendi sırasını çıkarırız.
             
         }
         
         
         else 
         
         {
             temp=Start;
             ptr=Start.baglanti;
             
             while (ptr!=null)   // araya ekleme yapar
                 
             {
                 
                 if (n.tc>=temp.tc&&n.tc<=ptr.tc)
                 {
                    
                    temp.baglanti=n; 
                    n.baglanti=ptr;
                   n.sira=temp.sira+1; // eklenen elemanın sıra degeri önceki elemanın sıra degerinden bir fazla olur.
                   
                     ins=true;
                     
                     break;
                 }
                 
                 else
                 {
                     temp=ptr;
                     ptr=ptr.baglanti;
                 }
                 
                 
             }
             
             if(ins==false){
                 temp.baglanti=n;
             }
             
           
             
         }
         
          boyut++;  // boyut değişkenini artırır
          n.sonsira=boyut-n.sira;  // boyuttan kendi sırasını çıakrıp kaç dugum kaldıgını atar
          
          
          
          
    }
    
    public long delete(long tc)
    {
        
        
       _18010310023_Node onceki, tmp=null;
       
        
         
         tmp=Start;
         
         if(tmp!=null&&Start.tc==tc){ // aranan düğüm ilk düğümde ise
             
             
             tmp=Start.baglanti;
             Start=tmp;
              boyut--; // eleman silindiği için boyut değişkenini azaltır
             tmp=null;
             Sira=tmp.sira;   //tmp nodunun sıra değerını atar.
             return Sira;   // sıra degerini döndürür
             
         }
         
         else
         {
             onceki= Start;
             tmp=Start.baglanti;     // aranan tc ilk dügümde degil ise aramaya baslıyoruz
             
             while(tmp!=null)
             
             {
                 
                
               if (tmp.tc==tc)  // temp tc ve gelen tc degerleri eşiit ise silme islemini yapar
               {
                      Sira=tmp.sira; // tmp nodunun sıra değerini alır
                   onceki.baglanti=tmp.baglanti; // onceki degerin baglantısını sonraki degere atar
                   onceki=tmp;// onceki degeri bir saga kaydırarak tempe getirir
                   onceki=null;
                   tmp=null;        // temp e null atayarak siler
                     
                    boyut--;
                    
                 
                   return Sira;
               }
                tmp=tmp.baglanti;     //tmp degerini ve onceki deger birer saga kaydırır
                 onceki=onceki.baglanti;
                 
               
             
                 
             }
             
             
             
             
         }
        return -1; // eger durumların hicbiri gerçekleşmez ise -1 degeri döndürür
         
        
        
    }
    
        public _18010310023_Node NodeSearch(long tc)
        
        {
            
            _18010310023_Node arama = null; // arama adında node olusturduk
            arama=Start;
            
            while (arama!=null)
            {
                
            
                if (arama.tc==tc){
                    //eğer aranan düğümü bulmus isek ekrana o düğümun verilerini yazdırırız.
                    return arama;
                }
                
                
                arama=arama.baglanti;
            }
            
               
            System.out.println("Kayıt bulunamadi");
             return null;
            
            
        }
        
        public _18010310023_Node Return_kayit(int Sira)
        {
            _18010310023_Node ArananSira; // aranansira adinda node olusturduk
            ArananSira =Start;
            while(ArananSira!=null)
            {
                ArananSira=ArananSira.baglanti;
                if (ArananSira.sira==Sira){
                    break;
                    
                }
               
                       
                else{
                
                System.out.println("Kayit bulunamadi..");
                       break; 
                }
                
            }
      return ArananSira;
            
            
        }
        
        public int KayitSayisi(){
            
         
           return boyut;  /* Daha öncesinde her eleman eklememde ve çıkarmamda
                          boyut değişkeninin değerini artırıp azalttıgım için 
                          listede kaç kayıt oldugu boyut değişkeninde yazmaktadır.
                          */
            
        }
        
        
        public void yazdir(_18010310023_Node dugum)
        {
            _18010310023_Node x;
            x=dugum;
            //Gelen dugumun verilerini yazdırır.
            String Adi =x.ad;
            String Soyadi = x.soyad;
            Long Tc =x.tc;
           System.out.println("Tc : "+Tc+" Adi : "+Adi+"Soyad : "+Soyadi);   
            
        }

 

   
        
        
        
    }
    
