package bytebank;

public class TestReferencia2 {

	public static void main(String[] args) {
		Cliente diego = new Cliente();
		
		diego.nombre = "Diego";
		diego.documento ="1511";
		diego.telefono = "4431645422";
		
		Cuenta cuentaDiego = new Cuenta();
		
		cuentaDiego.agencia = 1;
		cuentaDiego.titular = diego;
		
		System.out.println(cuentaDiego.titular.nombre);
		
		if (cuentaDiego.titular.nombre.equals(diego.nombre)) {
			System.out.println("Es el mismo objeto");
			
		}else {
			System.out.println("nel ese, no es");
		}
		
		

	}

}
