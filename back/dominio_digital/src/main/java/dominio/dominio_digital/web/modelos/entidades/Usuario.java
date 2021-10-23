package dominio.dominio_digital.web.modelos.entidades;

import java.sql.Date;

public class Usuario {

    private int id;
    private String username;
    private String password;
    private String hash;
    private String nombres;
    private String apellidos;
    private Integer celular;
    private String sexo;
    private Date nacimiento;
    private Integer descuento;

    public Usuario() {
    }

    public Usuario(int id, String username, String password, String hash, String nombres, String apellidos, Integer celular, String sexo, Date nacimiento, Integer descuento) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.hash = hash;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.celular = celular;
        this.sexo = sexo;
        this.nacimiento = nacimiento;
        this.descuento = descuento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getCelular() {
        return celular;
    }

    public void setCelular(Integer celular) {
        this.celular = celular;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public Integer getDescuento() {
        return descuento;
    }

    public void setDescuento(Integer descuento) {
        this.descuento = descuento;
    }

   
    
    
}
