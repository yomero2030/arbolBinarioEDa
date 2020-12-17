package TDA;
import java.util.Scanner;

public class FrutasTDA {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        arbol x = new arbol();
        
        String nombre;
        float peso;

        System.out.print("\nIngrese el numero de datos a capturar: ");
        int z = sc.nextInt();

        for(int i = 1; i <=z ; i++){
            sc.nextLine();  
            System.out.print("Ingresa el nombre: ");
            nombre = sc.nextLine();
            System.out.print("Ingresa el peso: ");
            peso = sc.nextFloat();
            x.alta(new Fruta(nombre, peso));        
        }

        System.out.println("\nDatos en preorden:");
        x.imprimirpreorden();
        System.out.println("\nDatos en Indorden");
        x.imI();
        sc.close();
    }

}