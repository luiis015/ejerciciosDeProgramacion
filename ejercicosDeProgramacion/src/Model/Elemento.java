package Model;

public class Elemento {
    protected  int id;
    protected String titulo ;
    protected Persona autor;
    protected int tamanio;
    protected String formato;

    public Elemento(String titulo, int tamanio, int id, String formato, Persona autor) {
        this.titulo = titulo;
        this.tamanio = tamanio;
        this.id = id;
        this.formato = formato;
        this.autor = autor;
    }

    public Elemento() {
    }

    // getter y seters
    public Persona getAutor() {
        return autor;
    }

    public void setAutor(Persona autor) {
        this.autor = autor;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public void mostrarDatos (){
        System.out.println("ID" + id + ",Titulo"+ titulo +  ",Autor" + autor.getNombre() + ",tamaño" + tamanio + "MG, Formato:" + formato);

    }
}
