package cuentas;

/**
 * Clase principal del programa
 */
public class Main {

	/**
	 * Método main por donde comienza el programa
	 * 
	 * @param args argumentos
	 */
	public static void main(String[] args) {
		/**
		 * Varaible local de tipo Cuenta
		 */
		CCuenta cuenta1;
		/**
		 * Variable local de tipo double
		 */
		double saldoActual;

		cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
		saldoActual = cuenta1.estado();
		System.out.println("El saldo actual es" + saldoActual);

		operativa_cuenta(cuenta1, 100);
	}

	/**
	 * Método para retirar o ingresar dinero a una cuenta
	 * 
	 * @param cuenta1  cuenta a la que se retira o ingresa dinero
	 * @param cantidad cantidad de dinero a retirar o ingresar
	 */
	private static void operativa_cuenta(CCuenta cuenta1, float cantidad) {
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
