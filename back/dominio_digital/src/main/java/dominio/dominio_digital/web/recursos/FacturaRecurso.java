package dominio.dominio_digital.web.recursos;

import dominio.dominio_digital.web.bd.Conexion;
import dominio.dominio_digital.web.modelos.dao.FacturaDAO;
import dominio.dominio_digital.web.modelos.entidades.Factura;
import dominio.dominio_digital.web.utilidades.Mensaje;
import java.util.ArrayList;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/facturas")
public class FacturaRecurso {
    
    Conexion conexion = new Conexion();
    FacturaDAO facturaDAO = new FacturaDAO(conexion);
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<Factura> getFacturas(){
        ArrayList<Factura> facturas = this.facturaDAO.getFacturas();
        
        return facturas;
    }
    
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Factura getFactura(@PathParam("id") int id){
        Factura factura = this.facturaDAO.getFactura(id);
        return factura;
    }
       
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Factura addFactura(Factura factura){
        return this.facturaDAO.addFactura(factura);        
    }

    
}
