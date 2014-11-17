
public class PrviDanVjezbe {
	public static void main(String[] args) {
		String JMBG = "0404993170007";
		String dan = JMBG.substring(0,2);
		String mjesec = JMBG.substring(2, 4);
		String godinaRodjenja = JMBG.substring(4,7);
		String polRegijaRodjenja = JMBG.substring(7, 13);
		System.out.println(dan + '.' + mjesec  + '.' + '1'+  godinaRodjenja);
		
		
		
	}

}
