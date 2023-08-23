package Models;

import Controller.EnumTipo;
import java.util.ArrayList;

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
    private TicketsList list;
    private ArrayList<Tickets> array;

    public Tickets(EnumTipo tipo) {
        array=new ArrayList<>();
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
                list.agregarP(this);
            case Caja:
                numC++;
                list.agregarC(this);
            case Preferencial:
                numA++;
                list.agregarA(this);
        }
    }
    
    public boolean agregar(Tickets obj){
        return array.add(obj);
    }
    public boolean eliminar(Tickets obj){
        for (Tickets ticked : array){
            if(ticked.equals(obj)){
                return array.remove(obj);
            }
        }
        return false;
    }
    public Tickets buscar(EnumTipo tipo){
        switch (this.tipo){
            case Plataformas:
                return list.buscarP(tipo);
            case Caja:
                return list.buscarC(tipo);
            case Preferencial:
                return list.buscarP(tipo);
            default: 
                return null;
        }
    }
}
