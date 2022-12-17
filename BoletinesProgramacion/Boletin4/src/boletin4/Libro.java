
package boletin4;


public class Libro {
    
    String titulo;
    String autor;
    int ano;
    short numPaginas;
    float valoracion;

    public Libro() {
    }

    public Libro(String titulo, String autor, int ano, short numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.numPaginas = numPaginas;
          }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public short getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(short numPaginas) {
        this.numPaginas = numPaginas;
    }

    public float getValoracion() {
        return valoracion;
    }

    public void setValoracion(float valoracion) {
        this.valoracion = valoracion;
    }
    
    
    public void mostrarLibro(){
        
        System.out.println("titulo: " +titulo+ "\n autor: " +autor+ " \n ano: " +ano+ " \n numero paginas" +numPaginas+ "\n valoracion: " +valoracion);
        
    }
    
    
    
    
    
}
