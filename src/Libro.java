public class Libro {
    private String titulo;
    private String autor;
    private int nropaginas;
    private String genlit;
    private int anio;
    private double precio;

    public Libro(){
        this.titulo="El sentido";
        this.autor="victor f.";
        this.nropaginas=150;
        this.genlit="drama";
        this.anio=1870;
        this.precio=10.5;
    }
    public Libro(String titulo){
        this.titulo=titulo;
        this.autor="victor f.";
        this.nropaginas=150;
        this.genlit="drama";
        this.anio=1870;
        this.precio=10.5;
    }
    public Libro(String titulo, String autor){
        this.titulo=titulo;
        this.autor=autor;
        this.nropaginas=150;
        this.genlit="drama";
        this.anio=1870;
        this.precio=10.5;
    }

    public Libro(String titulo, String autor, int nropaginas, String genlit, int anio, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.nropaginas = nropaginas;
        this.genlit = genlit;
        this.anio = anio;
        this.precio = precio;
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

    public int getNropaginas() {
        return nropaginas;
    }

    public void setNropaginas(int nropaginas) {
        this.nropaginas = nropaginas;
    }

    public String getGenlit() {
        return genlit;
    }

    public void setGenlit(String genlit) {
        this.genlit = genlit;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void mostrar(){
        System.out.println("Titulo: "+titulo);
        System.out.println("Autor: "+autor);
        System.out.println("NroPaginas: "+nropaginas);
        System.out.println("GeneroLiterario: "+genlit);
        System.out.println("Anio: "+anio);
        System.out.println("Precio: "+precio);
    }
    public void actualizarprecio(int precioz){
        int aniosactivo = 2025 - this.anio;
        if (aniosactivo > 5) {
            this.precio = precioz;
            System.out.println("Se actualizo el precio");
        }else{
            System.out.println("El libro no nesesita modificacion");
        }
    }
}
