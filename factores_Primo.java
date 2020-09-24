package TRABAJOS_PROGRAMACION;
import java.util.Scanner;                 //importar libreria
public class factores_Primo {

	public static void main(String[] args) {
		int factor;                                                      //denotamos un variable entera llaamda factor
        try (Scanner number = new Scanner(System.in)) {
			System.out.println("Numero que desea descomponer");        //Imprime el mensaje "Numero que desea descomponer"
			int numero = number.nextInt();                                //la variable que ingreso se registra como un entero llamada "Numero"

			for (factor=2; factor<=numero; factor++) {                //ciclo for el cual la variable factor empieza en 2 y termina hasta que factor sea menos o igual que el numero con un contador en el factor
			    while (numero%factor==0) {                             // este while toma el factor del ciclo for el cual de en el residuo de numero dividido entre el factor de 0
			        System.out.println(numero + " | " + factor);    //Se imprime cada resultado dentro del ciclo
			        numero/=factor;                                    //esta operacion divide el numero con el factor haciendo que numero disminuya
			    }
			}
		}

	}

}
