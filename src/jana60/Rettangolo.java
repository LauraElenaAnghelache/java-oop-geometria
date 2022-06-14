package jana60;

public class Rettangolo {
		/*una classe Rettangolo con due attributi interi: base e altezza. La classe ha due metodi che calcolano e restituiscono, rispettivamente, l’area e il perimetro del rettangolo.
		*una classe Main contenente il metodo main, nel quale chiedete all’utente di inserire, da console, i valori di base e di altezza con cui istanziare un nuovo oggetto Rettangolo. Dopo averlo istanziato, stampate a video il perimetro e l’area.
        */
		int larghezza, altezza;
		int area()
		{  
			return larghezza * altezza;
		}
		int perimetro()
		{
			return (larghezza + altezza) * 2;
		}
		String stampaASchermo()
		{ 
			return "Questo rettangolo ha area " + area()+ " e perimetro " +perimetro()+ ".";
		}
		
	}


