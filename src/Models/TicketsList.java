package Models;

import Controller.EnumTipo;
import java.util.ArrayList;

/**
 *
 * @author Student
 */
public class TicketsList {
    private ArrayList<Tickets> arrayP;
    private ArrayList<Tickets> arrayC;
    private ArrayList<Tickets> arrayA;

    public TicketsList() {
        arrayP = new ArrayList<>();
        arrayC = new ArrayList<>();
        arrayA = new ArrayList<>();
    }
    
    public boolean agregarP(Tickets obj){
        return arrayP.add(obj);
    }
    public boolean agregarC(Tickets obj){
        return arrayC.add(obj);
    }
    public boolean agregarA(Tickets obj){
        return arrayA.add(obj);
    }
    public boolean eliminarP(Tickets obj){
        return arrayA.remove(obj);
    }
    public boolean eliminarC(Tickets obj){
        return arrayA.remove(obj);
    }
    public boolean eliminarA(Tickets obj){
        return arrayA.remove(obj);
    }
    public Tickets buscarP(EnumTipo tipo){
        return arrayP.get(0);
    }
    public Tickets buscarC(EnumTipo tipo){
        return arrayC.get(0);
    }
    public Tickets buscarA(EnumTipo tipo){
        return arrayA.get(0);
    }
    
    
}
