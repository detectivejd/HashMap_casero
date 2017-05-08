package hashmapsimple;
public class Cuerpo {
    public static void main(String[] args) {
        ITest t = null;
        int opcion = -1;
        java.util.Scanner scanner = new java.util.Scanner(System.in); 
        while(opcion != 0){
            System.out.println("\t---Bienvenido al menú de pruebas del HashMap casero---");
            System.out.println("");
            System.out.println("1. Probando instancias (constructor)");
            System.out.println("2. Pruebas de put (altas)");
            System.out.println("3. Pruebas de get (obtener por clave)");
            System.out.println("4. Pruebas de constainsKey (verificar clave)");
            System.out.println("5. Pruebas de constainsValue (verificar valor)");
            System.out.println("6. Pruebas de remove y clear (bajas y limpieza)");
            System.out.println("0. Salir");
            System.out.println("");
            System.out.println("Por favor, elija su opción: ");
            opcion = Integer.parseInt(scanner.nextLine());
            System.out.println("");
            switch(opcion){
                case 1:
                    t = new ConstructorTest();
                    t.test();
                    break;
                case 2:
                    t = new UpTest();
                    t.test();
                    break;
                case 3:
                    t = new GetTest();
                    t.test();
                    break;
                case 4:
                    t = new ContainsKeyTest();
                    t.test();
                    break;
                case 5:
                    t = new ContainsValueTest();
                    t.test();
                    break;
                case 6:
                    t = new DownTest();
                    t.test();
                    break;    
                case 0:
                    System.out.println("Gracias por utilizarme ;)");
                    System.exit(0); 
                default:
                    System.out.println("Error! ingrese nuevamente");
                    break;
            }
            t= null;
            System.out.println("");
        }
    }
    
}
