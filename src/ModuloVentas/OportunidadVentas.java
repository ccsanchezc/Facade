/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuloVentas;

import Implementador.ServicioCliente;

 
public class OportunidadVentas extends ServicioCliente {

    public OportunidadVentas(String nombre) {
        super(nombre);
    }

    @Override
    public String getNombre() {

        return nombre;
    }

}
