package Struture;
import java.util.ArrayList;
import java.util.List;

interface IEmploye {
    void getInfoOfEmployes(String prefijo);
}

class Employe implements IEmploye{
    String name;
    String position;

    Employe(String name, String position){
        this.name = name;
        this.position = position;
    }

    public void getInfoOfEmployes(String prefijo) {
        System.out.println(prefijo + position + ": " + name);
    }
}

class EmployesComposite implements IEmploye{
    private String name;
    private List<IEmploye> subordinates = new ArrayList<>();

    EmployesComposite(String name) {
        this.name = name;
    }

    public void postEmployes(IEmploye employe) {
        subordinates.add(employe);
    }

    public void getInfoOfEmployes(String prefijo) {
        System.out.println(prefijo + "Gerente: " + name);
        for (IEmploye employe : subordinates) {
            employe.getInfoOfEmployes(prefijo + "  ");
        }
    }
}

public class Composite{
    public void getEmployes() {
        // Empleados simples
        Employe andy = new Employe("Andres", "Backend");
        Employe lauti = new Employe("Lauti", "Frontend");
        Employe daro = new Employe("Dario", "Sr Backend");

        // Gerente intermedio
        EmployesComposite liderTecnico = new EmployesComposite("María (Líder Técnico)");
        liderTecnico.postEmployes(andy);
        liderTecnico.postEmployes(lauti);

        // Gerente general
        EmployesComposite gerenteGeneral = new EmployesComposite("Mathi (Gerente)");
        gerenteGeneral.postEmployes(daro);
        gerenteGeneral.postEmployes(liderTecnico);

        // Mostrar estructura
        gerenteGeneral.getInfoOfEmployes("");
    }

}