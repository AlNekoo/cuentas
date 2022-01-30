package cuentas;
/**
 * 
 * @author Alvaro
 * @version 1.0
 */

public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    public CCuenta()
    {
    }
    
    /**
     * 
     * @param nom nombre
     * @param cue cuenta
     * @param sal saldo
     * @param tipo tipoInteres
     */

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }
    
    /**
     * Método estado para comprobar saldo
     * @return getSaldo
     */

    public double estado()
    {
        return getSaldo();
    }
    
    /**
     * Método ingresar
     * @param cantidad, estabelce cantidad a ingresar
     * @throws Exception establece excepción para cantidad negativa
     */

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    
    /**
     * Método retirar
     * @param cantidad, varibale que establece cantidad a retirar
     * @throws Exception establece excepción para cantidad negativa o saldo insuficiente
     */

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    
    /**
     * get variable nombre
     * @return nombre
     */
	private String getNombre() {
		return nombre;
	}
	
	/**
	 * set variable nombre
	 * @param nombre establece valor variable nombre
	 */

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * get variable cuenta
	 * @return cuenta
	 */

	private String getCuenta() {
		return cuenta;
	}
	
	/**
	 * set variable cuenta
	 * @param cuenta establece valor variable cuenta
	 */

	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	
	/**
	 * get variable saldo
	 * @return saldo
	 */

	private double getSaldo() {
		return saldo;
	}
	
	/**
	 * set variable saldo
	 * @param saldo establece valor variable saldo
	 */

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	/**
	 * get variable tipoInteres
	 * @return tipoInteres
	 */

	private double getTipoInteres() {
		return tipoInteres;
	}
	
	/**
	 * variable tipoInteres
	 * @param tipoInteres establece valor variable tipoInteres
	 */

	private void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
}
