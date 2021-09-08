package edu.escuelaing.arep;

import edu.escuelaing.arep.httpService.HttpService;
import edu.escuelaing.arep.tiempo.TiempoServic;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cliente {

    public static void main(String[] args){
        String stock = "Bogota";
        HttpService stockService = TiempoServic.getInstance().getService();


        stockService.setStock(stock);


        String response = "None";
        try{
            response = stockService.TimeSeries();
        }catch(IOException e){
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE,null,e);
        }
        System.out.println("El clima en "+stock+"es: "+response);


    }


}
