package sia.models;

public class estudiante {
    //Atributos
    private int id;
    private String nombre;
    private String curso;
    private String contacto;

    //Constructor
    public estudiante(int id, String nombre, String curso, String contacto){
        this.id = id;
        this.nombre = nombre;
        this.curso = curso;
        this.contacto = contacto;
    }

    //Setters
    public void setId(int id){
        this.id = id;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setCurso(String curso){
        this.curso = curso;
    }

    public void setContacto(String contacto){
        this.contacto = contacto;
    }

    //Getters
    public int getId(){
        return id;
    }

    public String getNombre(){
        return nombre;
    }

    public String getCurso(){
        return curso;
    }

    public String getContacto(){
        return contacto;
    }
    
}
