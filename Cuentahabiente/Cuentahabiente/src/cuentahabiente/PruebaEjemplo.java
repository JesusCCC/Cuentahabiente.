/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentahabiente;

/**
 *
 * @author arman
 */

public class PruebaEjemplo {
    
    public static void main(String[] args) {
        Cuentahabiente[] lista = new Cuentahabiente[5];
        lista[0] = new Cuentahabiente(20021120, "Armando", 23111.8f);
        lista[1] = new Cuentahabiente(20020305, "Oliver", 49700.45f);
        lista[2] = new Cuentahabiente(20020102, "Daniel", 82700.2f);
        lista[3] = new Cuentahabiente(20020920, "Luz", 93890.75f);
        lista[4] = new Cuentahabiente(20020517, "Eduardo", 1000.0f);

        for (Cuentahabiente cuentahabiente : lista) {
            System.out.println(cuentahabiente.getNombre() + ", tiene una cuenta de tipo: '" + cuentahabiente.evaluarNivelCliente() + "'") ;  
        }
}
}
