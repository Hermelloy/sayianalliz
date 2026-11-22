<img width="896" height="1200" alt="Gemini_Generated_Image_7cteju7cteju7cte" src="https://github.com/user-attachments/assets/f947485a-6f13-4783-accf-251cc2d73c73" />
# Rapor

**Bilgekağan Okuducu:**
**698**

## 1. Algoritma Açıklaması
Program kullanıcıdan 0 girene kadar sayılar alır bu sayıların asal olma durumunu mükemmel olma durumunu  pozitif sayı sayısını negatif sayı sayısını tek sayı sayısını çift sayı sayısını en büyük sayıyı en küçük sayıyı sayıların toplamını ortalamasını en büyük en küçük sayı farkını hesaplar en büyük en küçük sayının farkını hesaplar


## 2. Girdi - İşlem - Çıktı

**Girdiler:**
-sayilar

**İşlemler:**
-0 olma durumunu kontrol eder
pozitif sayi adedi bul
negatif sayi adedi bul
asal olma durumunu kontrol et
sayilarin toplamını kontrol eder
sayilarin ortalamasını hesaplar
en büyük sayıyı bulur
en küçük sayıyı bulur
çift sayı sayısını hesaplar
tek sayı sayısını hesaplar
sayının mükemmel olma durumunu hesaplar
-

**Çıktılar:**
-

## 3. Sözde Kod (Pseudocode)

```
1.BAŞLA
    n = 0, p = 0, t = 0, c = 0          // negatif, pozitif, tek, çift sayaçları
    eb = 0, ek = 0, fark = 0            // en büyük, en küçük, fark
    toplam = 0, toplamp = 0             // genel toplam, pozitif toplam
    d = 0, j = 0, b = 0, notr = 0       // asal adedi, sayı adedi, basamak, mutlak değer
    ort = 0, ortp = 0                   // genel ortalama, pozitif ortalama

    YAZ "Sayı analiz programına hoş geldiniz. Çıkmak için 0 giriniz:"
    OKU sayi

    EĞER sayi == 0 İSE
        YAZ "Sıfır tuşladınız, analiz yapılmadan program sonlandırıldı."
    DEĞİLSE
        eb = sayi
        ek = sayi

        SAYI != 0 OLDUĞU SÜRECE DÖN
            j = j + 1

            // Pozitif / Negatif kontrolü ve pozitif toplam
            EĞER sayi < 0 İSE
                n = n + 1
            DEĞİLSE
                p = p + 1
                toplamp = toplamp + sayi
            SON

            // Çift / Tek kontrolü
            EĞER sayi MOD 2 == 0 İSE
                c = c + 1
            DEĞİLSE
                t = t + 1
            SON

            // En küçük / En büyük güncelleme
            EĞER sayi < ek İSE
                ek = sayi
            SON
            EĞER sayi > eb İSE
                eb = sayi
            SON

            toplam = toplam + sayi

            // Asal sayı kontrolü
            asal = DOĞRU
            EĞER sayi <= 1 İSE
                asal = YANLIŞ
            DEĞİLSE
                l = 2 İÇİN sayi - 1'E KADAR ARTIR (1)
                    EĞER sayi MOD l == 0 İSE
                        asal = YANLIŞ
                        DÖNGÜDEN_ÇIK
                    SON
                SON
            SON

            EĞER asal == DOĞRU İSE
                d = d + 1
                YAZ sayi, " asaldır"
            DEĞİLSE
                YAZ sayi, " asal değildir"
            SON

            // Mükemmel sayı kontrolü
            mukemmel = 0
            k = 1 İÇİN sayi - 1'E KADAR ARTIR (1)
                EĞER sayi MOD k == 0 İSE
                    mukemmel = mukemmel + k
                SON
            SON

            EĞER sayi > 0 VE mukemmel == sayi İSE
                YAZ sayi, " mükemmel bir sayıdır"
            DEĞİLSE
                YAZ sayi, " mükemmel bir sayı değildir"
            SON

            // Basamak sayısı hesaplama (pozitif ve negatif sayılar için)
            b = 0
            notr = MUTLAK_DEĞER(sayi)
            EĞER notr == 0 İSE
                b = 1
            DEĞİLSE
                notr > 0 OLDUĞU SÜRECE DÖN
                    notr = TAM_BÖL(notr, 10)
                    b = b + 1
                SON
            SON
            YAZ sayi, " sayısı ", b, " basamaklıdır"

            OKU sayi
        SON

        // Genel ortalama, pozitif ortalama ve fark
        ort = toplam / j
        EĞER p > 0 İSE
            ortp = toplamp / p
        DEĞİLSE
            ortp = 0
        SON
        fark = eb - ek

        // Sonuç raporu
        YAZ "Negatif: ", n, ", Pozitif: ", p, ", Çift: ", c, ", Tek: ", t
        YAZ "En büyük: ", eb, ", En küçük: ", ek, ", Fark: ", fark
        YAZ "Toplam: ", toplam, ", Genel ortalama: ", ort
        YAZ "Pozitif ortalama: ", ortp
        YAZ "Asal sayı adedi: ", d
    SON
BİTİR
2.
3.
```

## 4. Akış Şeması

![Akış Şeması](<img width="896" height="1200" alt="Gemini_Generated_Image_7cteju7cteju7cte" src="https://github.com/user-attachments/assets/ba995ec9-53be-4abf-8edc-b19189be87e0" />
)

## 5. Test Senaryoları (en az 8)

| No | Girilen sayılar | Beklenen sonuç | Programın sonucu | Doğru mu? |
|---|---|---|---|---|
| 1 |0 |Analiz yapılmadan programın sonlandığına dair uyarı mesajı (0 analize dahil edilmemeli). |Analiz yapılmadan programın sonlandığına dair uyarı mesajı (0 analize dahil edilmemeli). |Doğru|
| 2 |7,0 |için: Asal (evet), Mükemmel sayı (hayır), 1 basamaklı

Rapor: Negatif 0, Pozitif 1, Çift 0, Tek 1, En büyük 7, En küçük 7, Fark 0, Toplam 7, Genel ortalama 7.0, Pozitif ortalama 7.0, Asal adedi 1 | için: Asal (evet), Mükemmel sayı (hayır), 1 basamaklı

Rapor: Negatif 0, Pozitif 1, Çift 0, Tek 1, En büyük 7, En küçük 7, Fark 0, Toplam 7, Genel ortalama 7.0, Pozitif ortalama 7.0, Asal adedi 1|doğru |
| 3 |6,28,0 |6 için: Asal değil, Mükemmel sayı (evet), 1 basamaklı

28 için: Asal değil, Mükemmel sayı (evet), 2 basamaklı

Rapor: Negatif 0, Pozitif 2, Çift 2, Tek 0, En büyük 28, En küçük 6, Fark 22, Toplam 34, Genel ortalama 17.0, Pozitif ortalama 17.0, Asal adedi 0 |6 için: Asal değil, Mükemmel sayı (evet), 1 basamaklı

28 için: Asal değil, Mükemmel sayı (evet), 2 basamaklı

Rapor: Negatif 0, Pozitif 2, Çift 2, Tek 0, En büyük 28, En küçük 6, Fark 22, Toplam 34, Genel ortalama 17.0, Pozitif ortalama 17.0, Asal adedi 0 |doğru |
| 4 |10,-4,3,0 |10: Asal değil, Mükemmel değil, 2 basamaklı

-4: Asal değil, Mükemmel değil, 1 basamaklı

3: Asal, Mükemmel değil, 1 basamaklı

Rapor: Negatif 1, Pozitif 2, Çift 2, Tek 1, En büyük 10, En küçük -4, Fark 14, Toplam 9, Genel ortalama 3.0, Pozitif ortalama 6.5, Asal adedi 1 |10: Asal değil, Mükemmel değil, 2 basamaklı

-4: Asal değil, Mükemmel değil, 1 basamaklı

3: Asal, Mükemmel değil, 1 basamaklı

Rapor: Negatif 1, Pozitif 2, Çift 2, Tek 1, En büyük 10, En küçük -4, Fark 14, Toplam 9, Genel ortalama 3.0, Pozitif ortalama 6.5, Asal adedi 1 |dogru |
| 5 |-12,-5,0 |-12: Asal değil, Mükemmel değil, 2 basamaklı

-5: Asal değil, Mükemmel değil, 1 basamaklı

Rapor: Negatif 2, Pozitif 0, Çift 1, Tek 1, En büyük -5, En küçük -12, Fark 7, Toplam -17, Genel ortalama -8.5, Pozitif ortalama 0.0 (veya pozitif sayı yok uyarısı, asla NaN değil), Asal adedi 0 |-12: Asal değil, Mükemmel değil, 2 basamaklı

-5: Asal değil, Mükemmel değil, 1 basamaklı

Rapor: Negatif 2, Pozitif 0, Çift 1, Tek 1, En büyük -5, En küçük -12, Fark 7, Toplam -17, Genel ortalama -8.5, Pozitif ortalama 0.0 (veya pozitif sayı yok uyarısı, asla NaN değil), Asal adedi 0 |dogru |
| 6 |1,2,9,0 |1: Asal değil, Mükemmel değil, 1 basamaklı

2: Asal, Mükemmel değil, 1 basamaklı

9: Asal değil, Mükemmel değil, 1 basamaklı

Rapor: Negatif 0, Pozitif 3, Çift 1, Tek 2, En büyük 9, En küçük 1, Fark 8, Toplam 12, Genel ortalama 4.0, Pozitif ortalama 4.0, Asal adedi 1 |1: Asal değil, Mükemmel değil, 1 basamaklı

2: Asal, Mükemmel değil, 1 basamaklı

9: Asal değil, Mükemmel değil, 1 basamaklı

Rapor: Negatif 0, Pozitif 3, Çift 1, Tek 2, En büyük 9, En küçük 1, Fark 8, Toplam 12, Genel ortalama 4.0, Pozitif ortalama 4.0, Asal adedi 1 |dogru |
| 7 |5,84,999,0 |Basamaklar sırasıyla: 5 → 1, 84 → 2, 999 → 3, 1000 → 4

Rapor: Negatif 0, Pozitif 4, Çift 2, Tek 2, En büyük 1000, En küçük 5, Fark 995, Toplam 2088, Genel ortalama 522.0, Pozitif ortalama 522.0, Asal adedi 1 |Basamaklar sırasıyla: 5 → 1, 84 → 2, 999 → 3, 1000 → 4

Rapor: Negatif 0, Pozitif 4, Çift 2, Tek 2, En büyük 1000, En küçük 5, Fark 995, Toplam 2088, Genel ortalama 522.0, Pozitif ortalama 522.0, Asal adedi 1 |dogru |
| 8 |11,11,11,,0 |Her 11 için: Asal, Mükemmel değil, 2 basamaklı

Rapor: Negatif 0, Pozitif 3, Çift 0, Tek 3, En büyük 11, En küçük 11, Fark 0, Toplam 33, Genel ortalama 11.0, Pozitif ortalama 11.0, Asal adedi 3 |Her 11 için: Asal, Mükemmel değil, 2 basamaklı

Rapor: Negatif 0, Pozitif 3, Çift 0, Tek 3, En büyük 11, En küçük 11, Fark 0, Toplam 33, Genel ortalama 11.0, Pozitif ortalama 11.0, Asal adedi 3 |dogru |

## 6. Ek Görevler (Opsiyonel)
*GİRDİLER*   *ÇIKTILAR*
|15,-8,6,9,0| |girdiginiz sayilarin 1.0 tanesi negatif, 3.0 tanesi pozitif; 2.0 tanesi cift, 2.0 tanesi tektir.
Girdi�iniz sayilarin en buyugu 15.0 en kucugu -8.0'dir. Bu iki sayinin farki: 23.0'dir. Girdiginiz asal sayi sayisi 0.0'dir.
girilen t�m sayilarin ortalamsi 5.5 yalnizca pozitif sayilarin ortalamsi 10.0'dir. Girilen sayilarin toplami 22.0'dir|

