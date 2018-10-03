package logicadenegocios;


/**
 * Write a description of class BookNotFounException here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AutorNotFoundException extends Exception {
  private int identificador ;
  
  public AutorNotFoundException(int pIdentificador){
    identificador=pIdentificador;
  }
  
  public int getIdentificador(){
    return identificador;
  }
}
