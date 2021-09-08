package edu.escuelaing.arep.tiempo;

import edu.escuelaing.arep.httpService.HttpService;

public class TiempoServic {
    private static TiempoServic _instance = new TiempoServic();
    private HttpService service;

    private TiempoServic(){
        service = new TiempoApi();
    }

    public static TiempoServic getInstance(){
        return _instance;
    }

    public HttpService getService(){
        return service;
    }

    public void setService(HttpService service){
        this.service = service;
    }



}
