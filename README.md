# AREP-PARCIAL PRIMER CORTE


------------------------------------
REQUERIMIENTOS
Su compañía lo ha seleccionado para construir una aplicación web simple desplegada en Heroku para uno de los clientes más importantes.
La aplicación debe consultar el estado del clima en lugares específicos de la tierra.  La aplicación recibirá en un campo la descripción
 de una ciudad, por ejemplo “London” para Londres   y deberá mostrar la información del clima para esa ciudad. Para esto utilice el API
 gratuito de https://openweathermap.org/ (Puede crear una cuenta para obtener la llave para realizar consultas). La petición debe pasar
 por su servicio web desplegado en Heroku, es decir desde su servicio en Heroku se debe invocar el servicio web de clima. El usuario no 
sabrá qué servicio está usted invocando por detrás. Utilice el servicio "Current Weather Data" de openweathermap.org.



-------------------------------------
1. clone el Respositorio con el siguiente comando:
-------------------------------------
git clone https://github.com/JuanManuelHerreraMoya/AREP-PARCIAL1.git
------------------------------------
2. Abra el Proyecto en su editor de preferencia

3. Para prepara el proyecto ejecure el siguiente comando en consola dentro de la carpeta del proyecto:
--------------------------------------------------------
mvn package
--------------------------------------------------------
4.Para ejecutar el API y comporbar su funcinamiento debe ejecutar la Clase Cliente.java
----------------------------------------
5. El resultado se vera de la siguiente manera
-----------------------------------------
El clima en Myrtle Beaches: {"coord":{"lon":-78.8867,"lat":33.6891},"weather":[{"id":501,"main":"Rain","description":"moderate rain","icon":"10d"}],
"base":"stations","main":{"temp":300.4,"feels_like":304.49,"temp_min":299.88,"temp_max":301.47,"pressure":1010,"humidity":89},"visibility":10000,
"wind":{"speed":7.2,"deg":190,"gust":8.75},"rain":{"1h":1.54},"clouds":{"all":75},"dt":1631133576,"sys":{"type":1,"id":5034,"country":"US","sunrise":1631098469,
"sunset":1631143929},"timezone":-14400,"id":4588718,"name":"Myrtle Beach","cod":200}


Esto especifica todo el tiempo en la ciudad que uno elija, en este ejemplo es Myrtle Beach, South Carolina





