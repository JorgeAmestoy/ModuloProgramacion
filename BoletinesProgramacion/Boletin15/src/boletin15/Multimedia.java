
package boletin15;


public class Multimedia {
    
    private String titulo;
    private String autor;
    private String formato;
    private String duracion;

    public Multimedia() {
    }

    public Multimedia(String titulo, String autor, String formato, String duracion) {
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.duracion = duracion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }
    
    
    
    
    

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getFormato() {
        return formato;
    }

    public String getDuracion() {
        return duracion;
    }

    @Override
    public String toString() {
        return "titulo = " +titulo + ", autor=" + autor + ", formato=" + formato + ", duracion=" + duracion;
    }
    
    
    
    
    
    
}
