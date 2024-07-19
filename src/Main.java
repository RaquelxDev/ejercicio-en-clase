//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        public static void holamundo() {
            System.out.println("mira mamá, mi primer programa en java!!");
            System.out.println("hola mundo!");
        }
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menu de Ejercicios");
            System.out.println("1.Hola Mundo");
            System.out.println("6. - Pa juera");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    holamundo();
                    break;
                case 6:
                    System.out.println("saliendo del programa");
                    break;
                default:
                    System.out.prntln("opcion no valida, intente otra vez");
            }
            }while (opcion = 6) ;

    }

}//end main
