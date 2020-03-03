/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fachada;

import ModuloMercadeo.CreacionPlanes;
import ModuloMercadeo.SegmentacionClientes;
import ModuloServicio.Peticiones;
import ModuloServicio.Quejas;
import ModuloServicio.Reclamos;
import ModuloVentas.ConsultarCredito;
import ModuloVentas.OportunidadVentas;
import ModuloVentas.VentaProductos;

 
public class FachadaModulos {

    public OportunidadVentas oportunidadVentas;
    public Peticiones peticiones;
    public CreacionPlanes creacion;
    public SegmentacionClientes segmentacion;
    public Quejas quejas;
    public Reclamos reclamos;
    public VentaProductos ventaProductos;
    public ConsultarCredito consultarCredito;
    public FachadaModulos() {
        this.oportunidadVentas = new OportunidadVentas("Oportunidad Ventas");
        this.peticiones = new Peticiones("Petición ");
        this.creacion = new CreacionPlanes("Creanto planes");
        this.segmentacion = new SegmentacionClientes("Segmentación");
        this.quejas = new Quejas("Soy queja");
        this.reclamos = new Reclamos("Soy reclamo");
        this.ventaProductos = new VentaProductos("Venta de productos");
        this.consultarCredito = new ConsultarCredito("Consulta credito");
    }

    public void InicioMetodos() {
        System.out.println("Fachada Ventas " + this.oportunidadVentas.getNombre());
        System.out.println("Fachada historial " + this.consultarCredito.getNombre());
    }
}
