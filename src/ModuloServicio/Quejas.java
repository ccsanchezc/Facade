/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloServicio;

import Implementador.ServicioCliente;

 
public class Quejas extends ServicioCliente {

    public Quejas(String nombre) {
        super(nombre);
    }

    @Override
    public String getNombre() {
        return nombre;
    }

}
