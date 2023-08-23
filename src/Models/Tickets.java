package Models;

import Controller.EnumTipo;

/**
 *
 * @author Student
 */
public class Tickets {
    public static int numP = 0;
    public static int numC = 0;
    public static int numA = 0;
    private int numero;
    private EnumTipo tipo;

    public Tickets(EnumTipo tipo) {
        this.tipo = tipo;
        this.numAuto();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public EnumTipo getTipo() {
        return tipo;
    }

    public void setTipo(EnumTipo tipo) {
        this.tipo = tipo;
    }
    
    public void numAuto(){
        switch (this.tipo){
            case Plataformas:
                numP++;
            case Caja:
                numC++;
            case Preferencial:
                numA++;
        }
    }
    
}
