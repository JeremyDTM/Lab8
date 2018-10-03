package logicadenegocios;

import java.util.*;

public class Biblioteca{
  private String nombre = null;
  private ArrayList<Cliente> clientes;
  private ArrayList<Libro> libros;
  private ArrayList<Autor> autores;
  
  public Biblioteca(String pNombre){
    nombre=pNombre;
    clientes = new ArrayList<Cliente>();
    libros = new ArrayList<Libro>();
    autores = new ArrayList<Autor>();
  }
  
  public void registrarLibro(String libroNombre,int libroIdentificador,int autorIdentificador,String autorNombre){
    Autor autor = new Autor(autorIdentificador,autorNombre);
    Libro libro=new Libro(libroNombre,libroIdentificador,autor);
    libros.add(libro);
  }
  
  public void registrarAutor(int autorIdentificador,String autorNombre){
    Autor autor= new Autor(autorIdentificador,autorNombre);
    autores.add(autor);
  }
  
  public void registrarCliente(String  pIdentificador ){
    Cliente cliente = new Cliente();
  }
  
  public void prestarLibro(int pIdentificadorCliente,int pIdentificadorLibro){
    if(validarCliente(pIdentificadorCliente)){
      if(validarLibro(pIdentificadorLibro)){
        Libro libro =buscarLibro(pIdentificadorLibro);
        Cliente cliente=buscarCliente(pIdentificadorCliente);
        cliente.registrarNuevoPrestamo(libro);
      }else{
        throw new BookNotFoundException(pIdentificadorCliente);
      }
    }else{
      throw new ClientNotFoundException(pIdentificadorCliente);
    }
  }
  
  public Libro buscarLibro(int pIdentificador){
    for(int indice=0;indice<libros.size();indice++){
      if(pIdentificador==libros.get(i).getIdentificador()){
          return libros.get(i);
       }
    }
    throw new BookNotFoundException(pIdentificador);
  }
  
  public boolean validarLibro(int pIdentificador){
    for(int indice=0;indice<libros.size();indice++){
      if(pIdentificador==libros.get(i).getIdentificador()){
          return true;
      }
    }
    return false;
  }
  
  public Cliente buscarCliente(int pIdentificador){
    for(int indice=0;indice<clientes.size();indice++){
      if(pIdentificador==clientes.get(i).getCedula()){
        return clientes.get(i);
      }
    }
    throw new ClientNotFoundException(pIdentificador);
  }
  
  public boolean validarCliente(int pIdentificador){
    for(int indice=0;indice<clientes.size();indice++){
      if(pIdentificador==clientes.get(i).getCedula()){
        return true;
      }
    }
    return false;
  }
  
  public Autor buscarAutor(int pIdentificador){
    for(int indice=0;indice<autores.size();indice++){
      if(pIdentificador==autores.get(i).getCedula()){
        return autores.get(i);
      }
    }
    throw new AutorNotFoundException(pIdentificador);
  }
}
