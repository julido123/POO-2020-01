package banco.app;

import banco.domiino.CuentaBancaria;
import banco.domiino.Persona;

public class Aplicación {
    public static void main(String[] args) {

        Persona julian=new Persona();
        Persona alejandro=new Persona();

        CuentaBancaria miCuenta=new CuentaBancaria();
        CuentaBancaria cuentaAlejandro = new CuentaBancaria();

        julian.nombre="Julián";
        miCuenta.titular=julian;
        miCuenta.saldo=50000;
        miCuenta.estado="A";

        alejandro.nombre="Alejandro";
        cuentaAlejandro.titular=alejandro;
        cuentaAlejandro.saldo=0;
        cuentaAlejandro.estado="A";

        System.out.println(miCuenta.consultarSaldo());
        System.out.println(cuentaAlejandro.consultarSaldo());

        boolean resultadoTransferencia = miCuenta.transferir(10000, cuentaAlejandro);

        System.out.println(resultadoTransferencia);
        System.out.println(miCuenta.consultarSaldo());
        System.out.println(cuentaAlejandro.consultarSaldo());



    }

}
