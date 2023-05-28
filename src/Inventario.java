public class Inventario {
    Libro libro;
    int cantLibro;
    char estadoLibro;
    public Inventario(){
        this.libro=null;
        this.cantLibro=0;
        this.estadoLibro=' ';
    }
    public Inventario(Libro libro,int cantLibro,char estadoLibro){
        this.libro=libro;
        this.cantLibro=cantLibro;
        this.estadoLibro=estadoLibro;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public int getCantLibro() {
        return cantLibro;
    }

    public void setCantLibro(int cantLibro) {
        this.cantLibro = cantLibro;
    }

    public char getEstadoLibro() {
        return estadoLibro;
    }

    public void setEstadoLibro(char estadoLibro) {
        this.estadoLibro = estadoLibro;
    }
}
