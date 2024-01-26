/*
vamos a crear una app para poder tener una 
plantilla de registro
*/

public class Persona{
    private int id; 
    private String nombre;
    private int edad;
    
    //constructor
    //se encarga de iniciar las instancia del objeto
    //tipos n se puede agregar el 
    //sobreecarga nombrar de la misma forma a un metodo
    public Persona(){

    }
    
    public Persona (int id, String nombre, int edad){
         this.id = id;
          this.nombre = nombre;
          this.edad = edad;
    }
    public int getId(){
        return id;
    }
    
    //funcion debe retornar un resultado
    //metodo recibe datos y puede o no mandar un resultado
    
    public void setId(int id){
         this.id = id;
    }//esto es un metodo
    
    public String getNombre(){
        return nombre;
    }
    
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }//esto es un metodo
    
    public int getEdad(){
        return edad;
    }
    
    
    public void setEdad(int edad){
         this.edad = edad;
    }//esto es un metodo
    
    
    }
