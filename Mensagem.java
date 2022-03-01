
public class Mensagem {
	public static void diaMensagem(int hora) {
		
		switch(hora) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				diaMadrugada();
				break;
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
			case 11:
				diaManha();
				break;
			case 12:
				meioDia();
				break;
			case 13:
			case 14:
			case 15:
			case 16:
			case 17:
				diaTarde();
				break;
			case 18:
			case 19:
			case 20:
			case 21:
			case 22:
			case 23:
			case 00:
				diaNoite();
				break;
			default:
				System.out.println("Hora Inválida");
		}
		
	}
	public static void diaManha() {
		System.out.println("Bom dia!");
	}
	public static void meioDia() {
		System.out.println("É meio dia!");
	}
	public static void diaTarde() {
		System.out.println("Boa tarde!");
	}
	public static void diaNoite() {
		System.out.println("Boa noite!");
	}
	public static void diaMadrugada(){
		System.out.println("Vá dormir!");
	}
}