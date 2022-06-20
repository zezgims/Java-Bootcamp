## Homework Week 2

# Bir fatura ödeme / sorgulama / ödeme iptali işlemleri yapan proje kodu.

- Faturaları ilişkilendireceğimiz bir MemberAccount class, MemberAccountService gibi create/read/update/delete işlemleri yapan bir servis class,
- Fatura için amount, process_date, bill_type , id bilgileri tutulsun.
- Faturanın ödeme/sorgulama/ ödeme iptal metodlarının bulunması gereken servis class ı olacak.
- MemberAccount ın id+ismin ilk 2 harfinden oluşan bir memberCode bilgisi de olmalı ki faturayı bu koda göre sorgulayıp ödeme yapacak. 
MemberAccount ad, soyad, id, code, balance , cep telefonu bilgileri içermeli.
- FaturaService class ını inherit edecek bir de Client class olsun. (inheritance anlatırken bir örnekleme yapmıştık).
- Service teki fatura metodlarını bu client üzerinden call edelim.
- Bir de client ta fatura tipine göre sorgulama metodunu overload olacak şekilde 2 farklı impelementasyonunu gösterelim. 
(Fatura model class ta fatura tipi için bir attribute olmalı. Fatura tipleri ; 1- telefon ise sorgulama parametresinde fatura tipi ve 
memberCode + cep telefonu numarası ile sorgulansın/ 2- internet 3 - su faturası. Bu fatura tipleri değerler int olarak alınsın)
- Client ta metodları çağırırken parametreye fatura tipini ve memberCode u alarak fatura işlem metodlarını çağıralım. 
(fatura sorgulamada bir üst satırdaki overload için 2 farklı sorgulama metodu olacağından bir tanesinde parametre daha fazla olacak tabii)
- Fatura tipi ve memberCode her fatura metodunda parametre olacak. Ödeme ve ödeme iptal de bunlara ek olarak amount (yani fatura tutarı ) ve 
fatura tarihini de parametreye ekleyelim.
- Bir de custom exception class oluşturalım. Ödeme ve ödeme iptal de girilen tutar ile müşteri hesabındaki tutar yeterli değilse exception mesajı oluştursun.
- Fatura işlemleri servisindeki her metodun dönüş tipi Response.java tipinde olsun. Bu Response class String code, String date içermeli. 
Main metodlardan dönen response.getCode().equals("0") ise işlem başarılı mesajı verelim, "1" ise başarısız işlem mesajı verelim. Date bilgisini de ekrana 
yazdığımız mesajın yanına ekleyelim. "Başarılı işlem. Oluşturulma tarihi :" +date gibi.
