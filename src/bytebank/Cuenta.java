package bytebank;

public class Cuenta {

    double saldo;
    int agencia;
    int numero;
    String titular;
    
    public void depositar (double valor) {
    	
    	this.saldo = this.saldo + valor;
    }

}
