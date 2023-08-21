# Valuutavahetus

autor : Markus Männil

## Süsteemi kirjeldus

Admin: 
nimi : admin
salasõna : admin (lihtsuse huvides) 

### Backend : src/main/java/com/valuuta/SmitValuuta


Andmebaas on lihtne ainult ühe tabeliga kuna otsustasin admini informatsiooni hoida mälus.
Tavalise spring boot'i tavade järgi käib andmebaasi ja API vaheline vestlus läbi repository ja service'i.
API-d asuvad ValuutaController failis, endpoint (/api/v1/user/Valuuta) on kasutajale mõeldud ning ei vaja
autoriseerimist.
Lisaks on veel neli endPointi (api/v1/admin/** ) valuuta, post/valuuta , update/valuuta , delete/valuuta,
mida kasutab admini pool. Ning vajab sisse logimist. Kuna ei saanud tööle Jwt läbi audentimist siis tegin basic
autentimise.

Jookseb localhost:8080/ peal.


## Frontend : valuuta_front/src/components 


Frontendis on neli vaadet UserPage, AdminPage, LisaValuuta, MuudaValuuta.
Admini leht asub /admin portil ning lehele minnes küsib sisse logimist. 
Admini lehel saab iga valuutat muuta ja kustutada ning saab ka lisada valuutasi. 

Jookseb localhost:3000/ peal.

## Kasutatud tehnoloogiad

* Spring boot
* H2 in memory database
* Spring security
* React.js

## Jooksutamine

Esiteks tuleks tööle panna backend jooksutades SmitValuutaApplicationit (/com/valuuta/SmitValuuta/SmitValuutaApplication.java)  
<br/>
Frontendi jooksutamiseks tuleks \valuuta_front kaustas jooksutada käsk npm start.
