package bytebank;

public class Cuenta {

    double saldo;
    int agencia;
    int numero;
    Cliente titular = new Cliente();
    
    
    
    public void depositar (double valor) {
    	
    	this.saldo = this.saldo + valor;
    }
    
    public boolean retirar(double valor) {
    	if (this.saldo >= valor) {
    		this.saldo-= valor;
    		return true;
    					
		}
			return false;
		
 }
    
    
    public boolean transferir(double valor, Cuenta cuenta) {
    	if (this.saldo >= valor) {
    		this.saldo = this.saldo - valor;
    		cuenta.depositar(valor);
    		return true;
			
		}else {
			return false;
		}
    }
    
    

}
