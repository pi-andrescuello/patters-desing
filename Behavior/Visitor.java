package Behavior;

interface IVisitor {
    void visit(Argentina argentina);
    void visit(Spain spain);
    void visit(USA usa);
}

interface ICountry {
    void accept(IVisitor visitor);
}

class Argentina implements ICountry {
    String latitud = "-34.6037";
    String longitud = "-58.3816";

    String getPosition() {
        return "latitud: " + latitud + "longitud: " + longitud;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}

class Spain implements ICountry {
    String latitud = "40.4168";
    String longitud = "-3.7038";

    String getPosition() {
        return "latitud: " + latitud + "longitud: " + longitud;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}

class USA implements ICountry {
    String latitud = "38.9072";
    String longitud = "-77.0369";

    String getPosition() {
        return "latitud: " + latitud + "longitud: " + longitud;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}

class ExportVisitor implements IVisitor {
    @Override
    public void visit(Argentina argentina) {
        System.out.println("Exportando Argentina: " + argentina.getPosition());
    }

    @Override
    public void visit(Spain spain) {
        System.out.println("Exportando España: " + spain.getPosition());
    }

    @Override
    public void visit(USA usa) {
        System.out.println("Exportando USA: " + usa.getPosition());
    }
}

public class Visitor {
    public void getLocationToContries(){
        IVisitor exportVisitor = new ExportVisitor();

        Argentina argentina = new Argentina();
        USA usa = new USA();
        Spain spain = new Spain();

        argentina.accept(exportVisitor);
        usa.accept(exportVisitor);
        spain.accept(exportVisitor);
    }
}
