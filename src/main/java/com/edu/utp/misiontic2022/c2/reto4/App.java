package com.edu.utp.misiontic2022.c2.reto4;

import java.sql.SQLException;

import com.edu.utp.misiontic2022.c2.reto4.model.dao.ProyectoBancoDao;
import com.edu.utp.misiontic2022.c2.reto4.view.ReportesView;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
     
       

            var r = new ReportesView();
            var banco = "Conavi";
            r.proyectosFinanciadosPorBanco(banco);

            var limiteinf = 60_0000d ;
            r.totalAdeudadoPorProyectosSuperioresALimite(limiteinf);

           r.lideresQueMasGastan();







      
    }
}
