package jana60;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*una classe Rettangolo con due attributi interi: base e altezza. La classe ha due metodi che calcolano e restituiscono, rispettivamente, l’area e il perimetro del rettangolo.
        *una classe Main contenente il metodo main, nel quale chiedete all’utente di inserire, da console, i valori di base e di altezza con cui istanziare un nuovo oggetto Rettangolo. Dopo averlo istanziato, stampate a video il perimetro e l’area.
       */
		Scanner scan = new Scanner(System.in);
		Rettangolo ret = new Rettangolo();
		
		System.out.println("Inserire larghezza rettangolo: ");
		ret.larghezza = scan.nextInt();
		System.out.println("Inserire altezza rettangolo: ");
		ret.altezza = scan.nextInt();
		
		System.out.println(ret.stampaASchermo());
		
		scan.close();
		
		
		
	}

}
