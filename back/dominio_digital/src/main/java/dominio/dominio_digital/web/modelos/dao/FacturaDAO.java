package dominio.dominio_digital.web.modelos.dao;

import dominio.dominio_digital.web.bd.Conexion;
import dominio.dominio_digital.web.modelos.entidades.Factura;
import dominio.dominio_digital.web.modelos.entidades.Producto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class FacturaDAO {
    
    private Conexion conexion;

    public FacturaDAO(Conexion conexion) {
        this.conexion = conexion;
    }

    public ArrayList<Factura> getFacturas(){
        ArrayList<Factura> facturas = new ArrayList<>();
        
        try{
            String sql = "SELECT * FROM facturas";
            PreparedStatement pst;
            pst = this.conexion.getConexion().prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                Factura f = new Factura();
                f.setId_factura(rs.getInt("id_factura"));
                f.setId_producto(rs.getInt("cantidad_producto"));
                f.setNombre(rs.getString("categoria_producto"));
                f.setPrecio_producto(rs.getDouble("descrip_producto"));
                f.setSubtotal_compra(rs.getDouble("nombre_producto"));
                f.setFecha(rs.getDate("precio_producto"));  
                f.setCategoria_producto(rs.getString("precio_producto"));  
                facturas.add(f);
            }
            
            rs.close();
            pst.close();
        }
        catch(SQLException e){
            System.out.println("Error: "+e.getMessage());
        }
        
        return facturas;
    }
    
    public Factura getFactura(int id){
        Factura f = new Factura();
        
        try{
            String sql = "SELECT * FROM facturas WHERE id = ?";
            PreparedStatement pst;
            pst = this.conexion.getConexion().prepareStatement(sql);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                
                f.setId_factura(rs.getInt("id_factura"));
                f.setId_producto(rs.getInt("cantidad_producto"));
                f.setNombre(rs.getString("categoria_producto"));
                f.setPrecio_producto(rs.getDouble("descrip_producto"));
                f.setSubtotal_compra(rs.getDouble("nombre_producto"));
                f.setFecha(rs.getDate("precio_producto"));  
                f.setCategoria_producto(rs.getString("precio_producto"));  
                
            }
            
            rs.close();
            pst.close();
        }
        catch(SQLException e){
            System.out.println("Error: "+e.getMessage());
        }
        
        return f;
    }
    
    
    public Factura addFactura(Factura f){
        
        try{
            String sql = "INSERT INTO facturas VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pst;
            pst = this.conexion.getConexion().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
                   
            pst.setInt(1, 0);    
            pst.setInt(2, f.getId_producto());             
            pst.setString(3, f.getNombre());
            pst.setDouble(4, f.getPrecio_producto());
            pst.setDouble(5, f.getSubtotal_compra());
            pst.setDate(6, f.getFecha());
            pst.setString(7, f.getCategoria_producto());            
            
            int filas = pst.executeUpdate();
            
            if(filas>0){
                ResultSet rs = pst.getGeneratedKeys();
                while(rs.next()){
                    int id = rs.getInt(1);
                    f.setId_producto(id);
                }
                rs.close();
            }
            
            pst.close();
        }
        catch(SQLException e){
            System.out.println("Error: "+e.getMessage());
        }
        
        return f;
    }
    
    
}
