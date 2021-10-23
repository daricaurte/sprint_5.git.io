package dominio.dominio_digital.web.recursos;

import dominio.dominio_digital.web.bd.Conexion;
import dominio.dominio_digital.web.modelos.dao.ProductoDAO;
import dominio.dominio_digital.web.modelos.entidades.Producto;
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

@Path("/productos")
public class ProductoRecurso {
    
    Conexion conexion = new Conexion();
    ProductoDAO productoDAO = new ProductoDAO(conexion);
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<Producto> getProductos(){
        ArrayList<Producto> productos = this.productoDAO.getProductos();
        
        return productos;
    }
    
    @GET
    @Path("/{id_producto}")
    @Produces(MediaType.APPLICATION_JSON)
    public Producto getProducto(@PathParam("id") int id){
        Producto producto = this.productoDAO.getProducto(id);
        return producto;
    }
       
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Producto addProducto(Producto producto){
        return this.productoDAO.addProducto(producto);        
    }
    
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Mensaje editarProducto(Producto producto){
        Mensaje mensaje = new Mensaje();
        boolean resultado = this.productoDAO.updateEstudiante(producto);
        if(resultado){
            mensaje.setMensaje("SI");
        }
        else{
            mensaje.setMensaje("NO");
        }
        
        return mensaje;
    }
    
    @DELETE
    @Path("/{id_producto}")
    @Produces(MediaType.APPLICATION_JSON)
    public Mensaje deleteProducto(@PathParam("id_producto") int id){
        Mensaje mensaje = new Mensaje();
        
        boolean resultado = this.productoDAO.deleteProducto(id);
        
        if(resultado){
            mensaje.setMensaje("SI");
        }
        else{
            mensaje.setMensaje("NO");
        }
        
        return mensaje;
    
    }
    
}
