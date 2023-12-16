package cuentas;

/**
 * Esto es un comentario JavaDoc de la clase CCuenta
 */
public class CCuenta {

	/**
	 * Campo nombre
	 */
	private String nombre;
	/**
	 * Campo cuenta
	 */
	private String cuenta;
	/**
	 * Campo saldo
	 */
	private double saldo;
	/**
	 * Campo tipoInterés
	 */
	private double tipoInterés;

	/**
	 * Constructor de la clase CCuenta
	 */
	public CCuenta() {
	}

	/**
	 * Constructor de la clase CCuenta
	 * 
	 * @param nom  nombre
	 * @param cue  cuenta
	 * @param sal  saldo
	 * @param tipo tipoInterés
	 */
	public CCuenta(String nom, String cue, double sal, double tipo) {
		setNombre(nom);
		setCuenta(cue);
		setSaldo(sal);
	}

	/**
	 * Método estado
	 * 
	 * @return saldo de la cuenta
	 */
	public double estado() {
		return getSaldo();
	}

	/**
	 * Método infresar
	 * 
	 * @param cantidad cantidad
	 * @throws Exception excepción que se genera
	 */
	public void ingresar(double cantidad) throws Exception {
		if (cantidad < 0)
			throw new Exception("No se puede ingresar una cantidad negativa");
		setSaldo(getSaldo() + cantidad);
	}

	/**
	 * Método retirar
	 * 
	 * @param cantidad cantidad
	 * @throws Exception excepción que se genera
	 */
	public void retirar(double cantidad) throws Exception {
		if (cantidad <= 0)
			throw new Exception("No se puede retirar una cantidad negativa");
		if (estado() < cantidad)
			throw new Exception("No se hay suficiente saldo");
		setSaldo(getSaldo() - cantidad);
	}

	/**
	 * Método obtener nombre
	 * 
	 * @return nombre nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Método establecer nombre
	 * 
	 * @param nombre nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Método para obtener la cuenta
	 * 
	 * @return cuenta cuenta
	 */
	public String getCuenta() {
		return cuenta;
	}

	/**
	 * Método para establecer la cuenta
	 * 
	 * @param cuenta cuenta
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * Método para obtener el saldo
	 * 
	 * @return saldo saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Método para establecer el saldo
	 * 
	 * @param saldo saldo
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Método para obtener el tipo de interés
	 * 
	 * @return tipoInterés tipo de interés
	 */
	public double getTipoInterés() {
		return tipoInterés;
	}

	/**
	 * Método para establecer el tipo de interés
	 * 
	 * @param tipoInterés tipo de interés
	 */
	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}

}
