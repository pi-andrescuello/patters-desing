interface Button {
    String create();
}

class WinButton implements Button {
    public String create(){
        return "Create Buttons of Win";
    }    
}

class MacButton implements Button {
    public String create(){
        return "Create Buttons of Mac";
    }    
}

interface GUIFactory {
    Button createButton();
}

class MacFactory implements GUIFactory {
    public Button createButton() {
        return new MacButton();
    }
}

class WinFactory implements GUIFactory {
    public Button createButton() {
        return new WinButton();
    }
}

public class AbstractFactory{
    public void createButtons(){
        GUIFactory factory;

        factory = new MacFactory();
        System.out.println(factory.createButton().create());

        factory = new WinFactory();
        System.out.println(factory.createButton().create());
    }
}