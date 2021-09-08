package edu.escuelaing.arep.tiempo;

import edu.escuelaing.arep.httpService.HttpService;

public class TiempoApi extends HttpService {

    String stock = "Bogota";
    String function = "TIME_SERIES_INTRADAY";
    String URL = "http://api.openweathermap.org/data/2.5/weather?q="+stock+"&appid=63429292f7ee01de230f2efd22bb6449";
    @Override
    public String getURL() {
        System.out.println(URL);
        return URL;

    }

    @Override
    public void setStock(String stock) {
        stock = stock.replace("\"", "");
        this.stock = stock;
        System.out.println(stock);
        URL =  "http://api.openweathermap.org/data/2.5/weather?q="+stock+"&appid=63429292f7ee01de230f2efd22bb6449";
    }
    @Override
    public void setFuncion(String funcion){
        funcion = funcion.replace("\"", "");
        this.function = funcion;
        URL = "http://api.openweathermap.org/data/2.5/weather?q="+stock+"&appid=63429292f7ee01de230f2efd22bb6449";
    }

}
