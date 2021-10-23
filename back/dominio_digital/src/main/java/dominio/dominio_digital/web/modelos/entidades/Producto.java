package dominio.dominio_digital.web.modelos.entidades;


public class Producto {
    private Integer id_producto;
    private String nombre_producto;
    private String descrip_producto;
    private Double precio_producto;
    private Integer cantidad_producto;
    private String categoria_producto;

    public Producto() {
    }

    public Producto(Integer id_producto, String nombre_producto, String descrip_producto, Double precio_producto, Integer cantidad_producto, String categoria_producto) {
        this.id_producto = id_producto;
        this.nombre_producto = nombre_producto;
        this.descrip_producto = descrip_producto;
        this.precio_producto = precio_producto;
        this.cantidad_producto = cantidad_producto;
        this.categoria_producto = categoria_producto;
    }

    public Integer getId_producto() {
        return id_producto;
    }

    public void setId_producto(Integer id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public String getDescrip_producto() {
        return descrip_producto;
    }

    public void setDescrip_producto(String descrip_producto) {
        this.descrip_producto = descrip_producto;
    }

    public Double getPrecio_producto() {
        return precio_producto;
    }

    public void setPrecio_producto(Double precio_producto) {
        this.precio_producto = precio_producto;
    }

    public Integer getCantidad_producto() {
        return cantidad_producto;
    }

    public void setCantidad_producto(Integer cantidad_producto) {
        this.cantidad_producto = cantidad_producto;
    }

    public String getCategoria_producto() {
        return categoria_producto;
    }

    public void setCategoria_producto(String categoria_producto) {
        this.categoria_producto = categoria_producto;
    }


    
    
}
