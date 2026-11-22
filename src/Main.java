import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float i=1;
        float n=0;
        float p=0;
        float t=0;
        float c=0;
        float eb=0;
        float ek=0;
        float toplam=0;
        float ort;
        float a=0;
        float j;
        float b;
        float toplamp=0;
        float ortp;
        float fark;
        float d=0;
        int notr;
       
        
        System.out.println("sayi analiz programına hosgeldiniz istediginiz kadar sayi girebilirsiniz fakat sifir girince sayi giris hakkiniz biter");
        int sayi=sc.nextInt();
        if (sayi==0) {System.out.println("sifir tusladiniz islem baslamadan bitti");
        }else{
            eb=sayi;
            ek=sayi;
        for (j = 0; i!=0;) {
            i=sayi;
            if (sayi!=0){
             int mukemmel=0;
                j=j+1;
            if (sayi<0){n=n+1;
            }else if (sayi>0){p=p+1;
            toplamp=sayi+toplamp;
            }if (sayi%2==0){c=c+1;
             }else {t=t+1;
            }if (ek>sayi){ek=sayi;
            }if (eb<sayi){eb=sayi;
            }toplam=toplam+sayi;
             
            
            
           
            boolean asal=true;
            if (sayi<=1) {
                asal=false;
            }else {
            
                for (int l = 2; l < sayi; l++) {
                    
                
            if (sayi%l==0){
                asal=false;
            break;
                   }
                }
            }
            
            if (asal) {
                d++;
                System.out.println(sayi+" asaldir");
                }else {
                System.out.println(sayi+" asal degildir");
            }
            
           
                for (int k = 1; k < sayi; k++) {
                    
                
            if (sayi%k==0){mukemmel=mukemmel+k;
            } 
            
            }if (mukemmel==sayi){System.out.println("sayi mukemmel bir sayidir");
            }else {System.out.println("sayi mukemmel bir sayi degildir");
            
            }b=0;
            notr=Math.abs(sayi);
            if (notr==0) {
                b=1;
            }else {
            
            while (notr>0) {
            notr=notr/10;
            b++;
            }System.out.println("sayi "+b+" basamaklidir");
            
             sayi =sc.nextInt();
        
                
            }
            
            }
        } ort=toplam/j;
            ortp=toplamp/p;
            fark=eb-ek;
            System.out.println("girdiginiz sayilarin "+n+" tanesi negatif, "+p+" tanesi pozitif; "+c+" tanesi cift, "+t+" tanesi tektir.");
            System.out.println("Girdiğiniz sayilarin en buyugu " + eb + " en kucugu " + ek+ "'dir. Bu iki sayinin farki: " + fark + "'dir. Girdiginiz asal sayi sayisi " + d + "'dir.");
            System.out.println("girilen tüm sayilarin ortalamsi " + ort + " yalnizca pozitif sayilarin ortalamsi " + ortp + "'dir. Girilen sayilarin toplami "+toplam+"'dir");
     
            
   
    


            
        }

        scanner.close();
}
}
