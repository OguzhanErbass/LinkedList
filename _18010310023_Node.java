
package _18010310023_oguzhan_erbas;

/*
 
 * @author Oğuzhan Erbaş - 18010310023
 */
public class _18010310023_Node {
    
    long tc;
    String ad;
    String soyad;
    int sira,sonsira=0;  // düğümün sirasini ve sonra kaç düğüm oldugunu  tutacak değişkenler.
    
    _18010310023_Node baglanti;
    
    
    public _18010310023_Node() // 1. kurucu fonksiyonumuz
    {
        
        tc =0;
        ad=null;
        soyad=null;
        
       
    }
    
    public _18010310023_Node(long Tc,String Ad,String Soyad)// 2. kurucu fonksiyonumuz
    {
        
        tc=Tc;              
        ad=Ad;
        soyad=Soyad;
        
        
    }
    
   
    
    
    
    
}
