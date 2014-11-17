
public class provjeraValidnosti {
	public static void main(String[] args) {
		String JMBG = "0404993170007";
		char a = JMBG.charAt(0);
		char b =  JMBG.charAt(1);
		char c = JMBG.charAt(2);
		char d = JMBG.charAt(3);
		char e = JMBG.charAt(4);
		char f = JMBG.charAt(5);
		char g = JMBG.charAt(6);
		char h = JMBG.charAt(7);
		char i = JMBG.charAt(8);
		char j = JMBG.charAt(9);
		char k = JMBG.charAt(10);
		char l = JMBG.charAt(11);
		char z = JMBG.charAt(12);
		
		int nulti = a - 48;
		int prvi = b - 48;
		int drugi = c - 48;
		int treci = d - 48;
		int cetvrti = e - 48;
		int peti = f - 48;
		int sesti = g - 48;
		int sedmi = h - 48;
		int osmi = i - 48;
		int deveti = j -48;
		int deseti = k -48;
		int jedanaesti = l - 48;
		int dvanaesti = z - 48;
		int rezultat = 7 * nulti + 6 * prvi + 5 * drugi + 4 * treci + 3 * cetvrti + 2 * peti + 7 * sesti + 6 * sedmi + 5 * osmi + 4 * deveti + 3 * deseti + 2 * jedanaesti;
		System.out.println(rezultat);

		int rezultatNovi = rezultat % 11;
		System.out.println(rezultatNovi);
		
	
				
	}

}
