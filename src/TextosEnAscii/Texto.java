package src.TextosEnAscii;
import src.tienda.IngresoDatos;

public class Texto {
 
    public Texto(){
    }

    public void nombreEmpresa(){
        System.out.println("\n\t _______  _______  _______  _______  ______  _______  ______  _______  ____     _______  _______ ");
        System.out.println("\t|   |   ||    ___||   |   ||       ||   __ \\|   _   ||   __ \\|_     _||    |__ |_     _||   _   |");
        System.out.println("\t|       ||    ___||       ||   -   ||      <|       ||   __ < _|   |_ |       | _|   |_ |       |");
        System.out.println("\t|__|_|__||_______||__|_|__||_______||___|__||___|___||______/|_______||_______||_______||___|___|");
    }

    public void menuPrincipal(){
        System.out.println("\n __ __  ___  _ _  _ _    ___  ___  _  _ _  ___  _  ___  ___  _   ");
        System.out.println("|  \\  \\| __|| \\ || | |  | . \\| . \\| || \\ ||  _|| || . \\| . || |  ");
        System.out.println("|     || _| |   || ' |  |  _/|   /| ||   || |__| ||  _/|   || |_ ");
        System.out.println("|_|_|_||___||_\\_|\\___/  |_|  |_\\_\\|_||_\\_|\\___/|_||_|  |_|_||___|\n");
    }

    public void alquilar(){
        System.out.println("   _    _                _  _              ");
        System.out.println("  /_\\  | |  __ _  _   _ (_)| |  __ _  _ __ ");
        System.out.println(" //_\\\\ | | / _` || | | || || | / _` || '__|");
        System.out.println("/  _  \\| || (_| || |_| || || || (_| || |   ");
        System.out.println("\\_/ \\_/|_| \\__, | \\__,_||_||_| \\__,_||_|   ");
        System.out.println("                    |_|                          \n");
    }

    public void devolver(){
        System.out.println("    ___                      _                    ");
        System.out.println("   /   \\  ___ __   __  ___  | |__   __  ___  _ __ ");
        System.out.println("  / /\\ / / _ \\\\ \\ / / / _ \\ | |\\ \\ / / / _ \\| '__|");
        System.out.println(" / /_// |  __/ \\ V / | (_) || | \\ V / |  __/| |   ");
        System.out.println("/___,'   \\___|  \\_/   \\___/ |_|  \\_/   \\___||_|   \n");
    }

    public void clientes(){
        System.out.println("   ___        _  _               _             ");
        System.out.println("  / _ \\  ___ | |(_)  ___  _   _ | |  __ _  ___ ");
        System.out.println(" / /_)/ / _ \\| || | / __|| | | || | / _` |/ __|");
        System.out.println("/ ___/ |  __/| || || (__ | |_| || || (_| |\\__ \\");
        System.out.println("\\/      \\___||_||_| \\___| \\__,_||_| \\__,_||___/\n");
    }

    public void peliculas(){
        System.out.println("   ___  _  _               _              ");
        System.out.println("  / __\\| |(_)  ___  _ __  | |_   ___  ___ ");
        System.out.println(" / /   | || | / _ \\| '_ \\ | __| / _ \\/ __|");
        System.out.println("/ /___ | || ||  __/| | | || |_ |  __/\\__ \\");
        System.out.println("\\____/ |_||_| \\___||_| |_| \\__| \\___||___/");
    }

    public static void limpiarPantalla(){
        for(int i=0; i<25; i++){
            System.out.print("\n");
        }
    }
    public static void esperar(){
        String tmp = IngresoDatos.getTexto("\n...Pulse enter para continuar...\n");
    }

    
}