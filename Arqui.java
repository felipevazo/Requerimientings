import java.util.scanner;
public class vehiculo {
  private Scanner entrada;
  private string color;
  private int velocidad;
    //Constructor
    public vehiculo() {
      this.color="rojo";
      this.velocidad=40;
      this.entrada=new Scanner(System.in);

    }
    
    //Métodos
  public void menuManejo()  {
    //Según opción a elegir, se cambia o define a 0 la velocidad del vehiculo
  }
  public void cambiarColor(String color){
  }
  public void consultarVelocidad (){
  }
  public void consultarColor (){
  }
 
  
  
  
  public void setColor(String color)
  {
    this.color=color;
  }
  
  public string getColor()
  {
    return this.color
  }
  
  public void setVelocidad(int velocidad)
  {
    this.velocidad=velocidad;
  }
  public int getVelocidad()
  {
    return this.velocidad;
  }
  

}
