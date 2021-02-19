package banco.domiino;

import java.util.Date;

public class CuentaBancaria {
    public Banco banco;
    public String tipo; // si es ahorros o corriente
    public Persona titular;
    public String numero;
    public double saldo;
    public Date fechaApertura;
    public String contrasena;
    public String estado;

    public String consultarSaldo() {

        return "Hola,"+ titular.nombre +" su saldo es: " + saldo;
    }

    public boolean retirar(double valorARetirar) {
        if (valorARetirar <= saldo && estado.equals("A")) {
            saldo -= valorARetirar;
            return true;
        } else {
            return false;
        }
    }

    public boolean consignar(double valorAConsignar){
        if (valorAConsignar > 0 && estado.equals("A")) {
            saldo += valorAConsignar;
            return true;
        }else{
            return false;
        }


    }

    public boolean transferir(double valorATransferir, CuentaBancaria cuentaDestino){
        return this.retirar(valorATransferir) && cuentaDestino.consignar(valorATransferir);

    }
}
