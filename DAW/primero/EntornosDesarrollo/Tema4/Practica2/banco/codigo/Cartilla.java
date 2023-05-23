import java.util.Vector;

public class Cartilla {

  private double saldo;

    /**
   * 
   * @element-type Cliente
   */
  private Vector<Cliente> titulares;

  public boolean ingresar(double cantidad) {
  this.saldo += cantidad;
  return true;
  }

  public boolean reintegrar(double cantidad) {
  boolean esPosible = false;
  if (this.saldo >= cantidad) {
    this.saldo -= cantidad;
    esPosible = true;
  }
  return esPosible;
  }

}