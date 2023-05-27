public class GUARD_CLAUSES {
    public static void main(String[] args) {
        //IF_ELSE(args);
        Using_guard_clauses(args);
    }
    public static void IF_ELSE(String[] args) { //MODO NOOB
        // Representar el estado de la conexión a Internet,el inicio de sesión y si el usuario tiene privilegios de administrador.

        boolean wifi = false;
        boolean login = false;
        boolean admin = false;

        if (wifi == true) {
            if (login == true) {
                if (admin == true) {
                    // Si se cumplen todas las condiciones, imprimir un mensaje de ingreso.
                    System.out.print("Has ingresado");
                } else {
                    System.out.println("Tienes que ser un admin");
                }
            } else {
                System.out.println("Tienes que logear");
            }
        } else {
            System.out.println("Tienes que conectarte a un wifi");
        }
    }

    // Ejemplo de como optimizar el codigo anterior con GUARD CLAUSES
    public static void Using_guard_clauses(String[] args) {// MODO PRO

        boolean wifi = true;
        boolean login = false;
        boolean admin = false;
        // Verificar si se tiene acceso a una conexión wifi.
        if (!wifi) {
            // Si no se tiene acceso a una conexión wifi, imprimir un mensaje indicándolo y salir del programa.
            System.out.println("Tienes que conectarte a un wifi");
            return; //con return se termina la ejecución del programa, por lo que evita que el resto del codigo se ejecute.
        }
        // Verificar si se ha iniciado sesión.
        if (!login) {
            // Si no se ha iniciado sesión, imprimir un mensaje indicándolo y salir del programa.
            System.out.println("Tienes que logear");
            return;
        }
        // Verificar si el usuario tiene privilegios de administrador.
        if (!admin) {
            // Si no se tienen privilegios de administrador, imprimir un mensaje indicándolo y salir del programa.
            System.out.println("Tienes que ser un admin");
            return;
        }
        // Si se cumplen todas las condiciones, imprimir un mensaje de ingreso.
        System.out.print("Has ingresado");
    }
}
