package cuentas;

/**
 * <p>Este clase se encarga de gestionar los metodos y atributos de los objetos
 * cuenta. Permitiendo leer y modificar los atributos, obtener el estado de una 
 * cuenta, realizar un ingreso o hacer una retirada de efectivo.</p>
 * 
 * @author Alberto Velazquez Rapado
 * @version 1.0 26/02/2022
 * 
 */
public class CCuenta {

    /**
     * <p>Este método permite recibir el atributo nombre</p>
     * 
     * @return String con el atibuto nombre
     * 
     * @author Alberto Velazquez Rapado
     * @version 1.0 26/02/2022
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * <p>Este método permite recibir el atributo nombre</p>
     * 
     * @param nombre String con nuevo valor de nombre
     * @author Alberto Velazquez Rapado
     * @version 1.0 26/02/2022
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     *
     */
    public CCuenta()
    {
    }

    /**
     *
     * @param nom
     * @param cue
     * @param sal
     * @param tipo
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     *
     * @return
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     *
     * @param cantidad
     * @throws Exception
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     *
     * @param cantidad
     * @throws Exception
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}

