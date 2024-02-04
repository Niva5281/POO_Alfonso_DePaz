package edu.alfonso_depaz.reto2.process;
import java.util.Scanner;
import java.util.Arrays
//**esta clase es la que ejecuta el programa completo
//**empezamos declarando el array dirigido al constructor, el constructor se declara mas adelante
public class usuario_contraseña {
    public usuario_contraseña() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Nombre[] nombres = new Nombre[2];
        nombres[0] = new Nombre();
        Nombre[] nombres1 = {new Nombre("Niva", "QWER");}

        //**se genera un bucle hasta encontrar el usuario y contraseña

        boolean found = false;
        int sjf = 0;
        while (!found && sjf < nombres1.length) {
            System.out.println("Introduzca el usuario:");
            String nm_l = scanner.nextLine();
            if (nombres1[sjf].usua.equals("niva")) {
                found = true;
            }
            System.out.println("Introduzca la contraseña:");
            if (nombres1[sjf].contraseña.equals("QWER")) {
                found = true;
            }
        }
        //**Se informa de que la contraseña y el usuario son correctos
        //**Hecho esto se ejecutan los programas restantes
        System.out.println("¡Usuario y conntraseña correctos!" + found);
        System.out.println("a continuación le preguntaremos el numero de cajas a vender");
        System.out.println("y su precio");
        System.out.println("...");
        System.out.println("Cajas:");

        cajas_de_papel[] cajas_de_papels = new cajas_de_papel[2];
        cajas_de_papels[0] = new cajas_de_papel();
        cajas_de_papel[] cajas_de_papels1 = {new cajas_de_papel(0, 0);}

        ej_cajas.ej_capturar_de_cajas_de_papel();

        System.out.println("Hecho esto, le mostraremos las siguientes opciones...");
        System.out.println("Comprar cajas");
        System.out.println("Vender cajas");
        System.out.println("Mostrar el reporte de cajas");
        System.out.println("Salir del programa");
        String opcion;
        switch (opcion) {
            case "Comprar cajas":
                System.out.println("Usted ha escogido comprar cajas");
                com_cajas_de_papel();

            case "Vender cajas":
                System.out.println("Usted ha escogiodo vender cajas");
                vender_cajas_de_pap();

            case "salir del programa":
                System.out.println("Cerrando el programa");
                break;

            case "Motrar el reporte de cajas":
                System.out.println("Usted ha escogido mostrar el reporte de las cajas");
                mostrar_reporte_de_pap();

        }

    }

    class Nombre {
        private final String usua;
        private final String contraseña;

        public Nombre(String usua, String contraseña) {
            this.usua = usua;
            this.contraseña = contraseña;
        }
    }

    static class cajas_de_papel {
        private static int[] num_de_cajas;
        private static int[] precio_de_cajas;

        public cajas_de_papel(int num_de_cajas, int precio_de_cajas) {
            this.num_de_cajas = num_de_cajas;
            this.precio_de_cajas = precio_de_cajas;
        }

        public static int[] getNum_de_cajas() {
            return num_de_cajas;
        }

        public static int[] getPrecio_de_cajas() {
            return precio_de_cajas;
        }
    }

    public static class ej_cajas{
        public static void ej_capturar_de_cajas_de_papel(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese la cantidad de cajas: ");
            int cantidadCajas = scanner.nextInt();
            scanner.nextLine();
            int[] num_de_cajas = new int[cantidadCajas];

            System.out.println("Ingrese el precio de cada una de las cajas");
            int precio_Cajas = scanner.nextInt();
            scanner.nextLine();
            int[] precio_de_cajas = new int[precio_Cajas];
        }
        public static void ej_vender_de_cajas_papel(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese la cantidad de cajas a vender: ");
            int cantidadCajas = scanner.nextInt();
            scanner.nextLine();
            int[] num_de_cajas = new int[cantidadCajas];

            System.out.println("Ingrese el precio de venta de cada una de las cajas");
            int precio_Cajas = scanner.nextInt();
            scanner.nextLine();
            int[] precio_de_cajas = new int[precio_Cajas];
        }
        public static void ej_calucular_monto() {

        }
        public static void ej_mostrar_cajas_de_papel(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Cantidad de cajas:"+cajas_de_papel.getNum_de_cajas());
            System.out.println("Cantidad de cajas:"+cajas_de_papel.getPrecio_de_cajas());
        }
    }


}