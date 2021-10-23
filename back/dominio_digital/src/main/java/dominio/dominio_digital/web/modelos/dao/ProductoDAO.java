package dominio.dominio_digital.web.modelos.dao;

import dominio.dominio_digital.web.bd.Conexion;
import dominio.dominio_digital.web.modelos.entidades.Producto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class ProductoDAO {
    
    private Conexion conexion;

    public ProductoDAO(Conexion conexion) {
        this.conexion = conexion;
    }

    public ArrayList<Producto> getProductos(){
        ArrayList<Producto> productos = new ArrayList<>();
        
        try{
            String sql = "SELECT * FROM productos";
            PreparedStatement pst;
            pst = this.conexion.getConexion().prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                Producto p = new Producto();
                p.setId_producto(rs.getInt("id_producto"));
                p.setCantidad_producto(rs.getInt("cantidad_producto"));
                p.setCategoria_producto(rs.getString("categoria_producto"));
                p.setDescrip_producto(rs.getString("descrip_producto"));
                p.setNombre_producto(rs.getString("nombre_producto"));
                p.setPrecio_producto(rs.getDouble("precio_producto"));                
                productos.add(p);
            }
            
            rs.close();
            pst.close();
        }
        catch(SQLException e){
            System.out.println("Error: "+e.getMessage());
        }
        
        return productos;
    }
    
    public Producto getProducto(int id){
        Producto p = new Producto();
        
        try{
            String sql = "SELECT * FROM productos WHERE id = ?";
            PreparedStatement pst;
            pst = this.conexion.getConexion().prepareStatement(sql);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                
                p.setId_producto(rs.getInt("id_producto"));
                p.setCantidad_producto(rs.getInt("cantidad_producto"));
                p.setCategoria_producto(rs.getString("categoria_producto"));
                p.setDescrip_producto(rs.getString("descrip_producto"));
                p.setNombre_producto(rs.getString("nombre_producto"));
                p.setPrecio_producto(rs.getDouble("precio_producto"));  
                
            }
            
            rs.close();
            pst.close();
        }
        catch(SQLException e){
            System.out.println("Error: "+e.getMessage());
        }
        
        return p;
    }
    
    
    public Producto addProducto(Producto p){
        
        try{
            String sql = "INSERT INTO productos VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement pst;
            pst = this.conexion.getConexion().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
                   
            pst.setInt(1, p.getId_producto());    
            pst.setInt(2, p.getCantidad_producto());             
            pst.setString(3, p.getCategoria_producto());
            pst.setString(4, p.getDescrip_producto());
            pst.setString(5, p.getNombre_producto());
            pst.setDouble(6, p.getPrecio_producto());
            
            int filas = pst.executeUpdate();
            
            if(filas>0){
                ResultSet rs = pst.getGeneratedKeys();
                while(rs.next()){
                    int id = rs.getInt(1);
                    p.setId_producto(id);
                }
                rs.close();
            }
            
            pst.close();
        }
        catch(SQLException e){
            System.out.println("Error: "+e.getMessage());
        }
        
        return p;
    }
    
    public boolean updateEstudiante(Producto p){
        boolean resultado = false;
         System.out.println(p);        
        try{
            String sql = "UPDATE productos SET cantidad_producto = ?, categoria_producto  = ?,"
                    + " descrip_producto = ?, nombre_producto = ?, precio_producto = ? WHERE id_producto = ?";
            PreparedStatement pst;
            pst = this.conexion.getConexion().prepareStatement(sql);
            pst.setInt(2, p.getCantidad_producto());             
            pst.setString(3, p.getCategoria_producto());
            pst.setString(4, p.getDescrip_producto());
            pst.setString(5, p.getNombre_producto());
            pst.setDouble(6, p.getPrecio_producto());
            pst.setInt(5, p.getId_producto());
            
            int filas = pst.executeUpdate();
            
            if(filas>0){
                resultado = true;
            }
            
            pst.close();
        }
        catch(SQLException e){
            System.out.println("Error: "+e.getMessage());
        }
        
        return resultado;
    }
    
    public boolean deleteProducto(int id){
        boolean resultado = false;
        try{
            String sql = "DELETE FROM estudiantes WHERE id = ?";
            PreparedStatement pst;
            pst = this.conexion.getConexion().prepareStatement(sql);
            pst.setInt(1, id);
            
            int filas = pst.executeUpdate();
            
            if(filas>0){
                resultado = true;
            }
            
            pst.close();
        }
        catch(SQLException e){
            System.out.println("Error: "+e.getMessage());
        }
        
        return resultado;
    }
    
    
    
}
