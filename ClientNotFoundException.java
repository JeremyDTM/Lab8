package logicadenegocios;


/**
 * Write a description of class ClientNotFoundException here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClientNotFoundException extends Exception{
  private int identificador ;

  /**
  * Constructor for objects of class ClientNotFoundException
  */
  public ClientNotFoundException(int pIdentificador){
    identificador=pIdentificador;
  }
  public int getIdentificador(){
    return identificador;
  }
}
