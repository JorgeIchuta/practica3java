public class Editorial {
    private String nombre;
    private int cantidadL;
    private String[][] libro = new String[50][6];
    public Editorial(){
        this.nombre="Cuervo";
        this.cantidadL=2;
        this.libro[0][0]="cien anios";this.libro[0][1]="gabriel g.";this.libro[0][2]="150";this.libro[0][3]="drama";this.libro[0][4]="1980";this.libro[0][5]="20.5";
        this.libro[1][0]="el caballero";this.libro[1][1]="alonzo";this.libro[1][2]="200";this.libro[1][3]="drama";this.libro[1][4]="1993";this.libro[1][5]="15.4";
    }
    public Editorial(String nombre, int cantidadL, String[][] libro) {
        this.nombre = nombre;
        this.cantidadL = cantidadL;
        this.libro = libro;
    }   
    public void mostrar(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Cantidad libros: "+cantidadL);
        for (int i = 0; i < cantidadL; i++) {
            System.out.println("Titulo: "+this.libro[i][0]);
            System.out.println("Autor: "+this.libro[i][1]);
            System.out.println("Nropaginas: "+this.libro[i][2]);
            System.out.println("GeneroLiterario: "+this.libro[i][3]);
            System.out.println("Anio: "+this.libro[i][4]);
            System.out.println("Precio: "+this.libro[i][5]);
        }
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getCantidadL() {
        return cantidadL;
    }
    public void setCantidadL(int cantidadL) {
        this.cantidadL = cantidadL;
    }
    public String[][] getLibro() {
        return libro;
    }
    public void setLibro(String[][] libro) {
        this.libro = libro;
    }
    public boolean buscarlibro(String librox){
        for (int i = 0; i < this.cantidadL; i++) {
            if (libro[i][0] == librox) {
                return true;
            }
        }
        return false;
    }
    public void mostrarlibroMNP(){
        int mayor = nrohojasmayor();
        for (int i = 0; i < cantidadL; i++) {
            int nroHojas = Integer.parseInt(libro[i][2]);
            if (nroHojas == mayor) {
                System.out.println(libro[i][0]);
            }
        }
    }

    public int nrohojasmayor() {
        int may = 0; 
        for (int i = 0; i < cantidadL; i++) {
            int nroHojas = Integer.parseInt(libro[i][2]);
            if (nroHojas > may) {
                may = nroHojas; 
            }
        }
        return may; 
    }
    
}
