class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String mensaje) {
        super(mensaje);
    }
}

class MontoNegativoException extends Exception {
    public MontoNegativoException(String mensaje) {
        super(mensaje);
    }
}

public class BancoApp {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("Estefania", 1000000);
        Cuenta cuenta2 = new Cuenta("Julian", 500000);

        try {
            cuenta1.retirar(200000);
            System.out.println("Retiro exitoso. Saldo de Alice: " + cuenta1.getSaldo());
            cuenta1.depositar(-50000);
        } catch (SaldoInsuficienteException | MontoNegativoException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            cuenta1.transferir(cuenta2, 300000);
            System.out.println("Transferencia exitosa. Saldo de Alice: " + cuenta1.getSaldo() + ", Saldo de Bob: " + cuenta2.getSaldo());
        } catch (SaldoInsuficienteException | MontoNegativoException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

