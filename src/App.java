public class App {
    public static void main(String[] args) throws Exception {
        Editorial e1 = new Editorial();
        Libro l1 = new Libro();
        Libro l2 = new Libro("mi planta");
        Libro l3 = new Libro("metamorfosis","frank k.");
        e1.mostrar();
        System.out.println("------------------------------------");
        l1.mostrar();
        System.out.println("------------------------------------");
        l2.mostrar();
        System.out.println("------------------------------------");
        l3.mostrar();
        //b)
        System.out.println("------------------------------------");
        if (e1.buscarlibro("cien anios")) {
            System.out.println("Si existe");
        }
        //c)
        System.out.println("------------------------------------");
        e1.mostrarlibroMNP();
        //d)
        System.out.println("------------------------------------");
        l1.actualizarprecio(20);
        l1.mostrar();
    }
}
