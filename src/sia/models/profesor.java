package sia.models;

public class profesor {
    //Atributos
    private String nombre;
    private String materia;
    private String correo;
    private String contacto;

    //Constructor
    public profesor(String nombre, String materia, String correo, String contacto){
        this.nombre = nombre;
        this.materia = materia;
        this.correo = correo;
        this.contacto = contacto;
    }

    //Setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setMateria(String materia){
        this.materia = materia;
    }

    public void setCorreo(String correo){
        this.correo = correo;
    }

    public void setContacto(String contacto){
        this.contacto = contacto;
    }

    //Getters

    public String getNombre(){
        return nombre;
    }

    public String getMateria(){
        return materia;
    }

    public String getCorreo(){
        return correo;
    }

    public String getContacto(){
        return contacto;
    }
}
