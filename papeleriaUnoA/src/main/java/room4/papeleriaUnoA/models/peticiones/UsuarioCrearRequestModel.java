package room4.papeleriaUnoA.models.peticiones;

import javax.xml.crypto.Data;

public class UsuarioCrearRequestModel {
    
    private int id;
    private String tipo;
    private String nombre;
    private int cedula;
    private String email;
    private String password;
    private int telefono;
    private Data creado;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return this.cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getTelefono() {
        return this.telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Data getCreado() {
        return this.creado;
    }

    public void setCreado(Data creado) {
        this.creado = creado;
    }





}
