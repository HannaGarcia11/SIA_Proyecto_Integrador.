package sia.models;

public class administrador {
    private String nombre;
    private String contacto;
    private String correo;
    private String contraseña;

    public administrador(String nombre, String contacto, String correo, String contraseña){
        this.nombre = nombre;
        this.contacto = contacto;
        this.correo = correo;
        this.contraseña = contraseña;
    }

    //setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setContacto(String contacto){
        this.contacto = contacto;
    }

    public void setCorreo(String correo){
        this.correo = correo;
    }

    public void setContraseña(String contraseña){
        this.contraseña = contraseña;
    }

    //Getters

    public String getNombre(){
        return nombre;
    }

    public String getContacto(){
        return contacto;
    }

    public String getCorreo(){
        return correo;
    }

    public String getContraseña(){
        return contraseña;
    }
}
