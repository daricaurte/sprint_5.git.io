package dominio.dominio_digital.web.modelos.entidades;

import java.sql.Date;


public class Factura {
    private Integer id_factura;
    private Integer id_producto;
    private String nombre;
    private Double precio_producto;
    private Double subtotal_compra;
    private Integer descuento_compra;
    private Date fecha;
    private String categoria_producto;

    public Factura() {
    }

    public Factura(Integer id_factura, Integer id_producto, String nombre, Double precio_producto, Double subtotal_compra, Integer descuento_compra, Date fecha, String categoria_producto) {
        this.id_factura = id_factura;
        this.id_producto = id_producto;
        this.nombre = nombre;
        this.precio_producto = precio_producto;
        this.subtotal_compra = subtotal_compra;
        this.descuento_compra = descuento_compra;
        this.fecha = fecha;
        this.categoria_producto = categoria_producto;
    }

    public Integer getId_factura() {
        return id_factura;
    }

    public void setId_factura(Integer id_factura) {
        this.id_factura = id_factura;
    }

    public Integer getId_producto() {
        return id_producto;
    }

    public void setId_producto(Integer id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio_producto() {
        return precio_producto;
    }

    public void setPrecio_producto(Double precio_producto) {
        this.precio_producto = precio_producto;
    }

    public Double getSubtotal_compra() {
        return subtotal_compra;
    }

    public void setSubtotal_compra(Double subtotal_compra) {
        this.subtotal_compra = subtotal_compra;
    }

    public Integer getDescuento_compra() {
        return descuento_compra;
    }

    public void setDescuento_compra(Integer descuento_compra) {
        this.descuento_compra = descuento_compra;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getCategoria_producto() {
        return categoria_producto;
    }

    public void setCategoria_producto(String categoria_producto) {
        this.categoria_producto = categoria_producto;
    }
}

   