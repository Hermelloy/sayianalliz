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

![Akış Şeması](docs/akis-semasi.png)

## 5. Test Senaryoları (en az 8)

| No | Girilen sayılar | Beklenen sonuç | Programın sonucu | Doğru mu? |
|---|---|---|---|---|
| 1 | | | | |
| 2 | | | | |
| 3 | | | | |
| 4 | | | | |
| 5 | | | | |
| 6 | | | | |
| 7 | | | | |
| 8 | | | | |

## 6. Ek Görevler (Opsiyonel)
<!-- Max-min farkı, pozitiflerin ortalaması, asal sayı adedi için örnek çıktılar. -->

