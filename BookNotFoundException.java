package logicadenegocios;


/**
 * Write a description of class BookNotFounException here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BookNotFoundException extends Exception {
  private int identificador ;
  
  public BookNotFoundException(int pIdentificador){
    identificador=pIdentificador;
  }
  
  public int getIdentificador(){
    return identificador;
  }
}
