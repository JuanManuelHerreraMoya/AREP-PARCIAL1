package edu.escuelaing.arep.tiempo;

import edu.escuelaing.arep.httpService.HttpService;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cliente {

    public static void main(String[] args){
        String stock = "Myrtle Beach";
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
