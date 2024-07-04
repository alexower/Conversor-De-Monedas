public class Main {
    public static void main(String[] args) {

        Conexion api = new Conexion();
        Moneda datos = api.conectarApi("MXN");
        System.out.println(datos);
    }
}
