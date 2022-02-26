package cuentas;

/**
 * <p>Este clase es la clase principal.</p>
 * 
 * @author Alberto Velazquez Rapado
 * @version 1.0 26/02/2022
 * 
 */
public class Main {

    /**
     * <p>Este clase es la clase principal.</p>
     * @param args
     * @author Alberto Velazquez Rapado
     * @version 1.0 26/02/2022
     */
    public static void main(String[] args) {
        operativa_cuenta(2.0f);
    }

    private static void operativa_cuenta(float cantidad) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
