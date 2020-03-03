/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloVentas;

import Implementador.ServicioCliente;


public class ConsultarCredito extends ServicioCliente{

    public ConsultarCredito(String nombre) {
        super(nombre);
    }

    @Override
    public String getNombre() {
        return nombre;
    }
    
}
