import Behavior.Strategy;
import Behavior.State;
import Struture.Adapter;
import Struture.Proxy;

public class Main {
    public static void main(String[] args) {
        // Struture
        Adapter adapter = new Adapter();
        adapter.UserEdit();

        Proxy proxyAccount = new Proxy();
        proxyAccount.accountBank();


        // Behavior
        Strategy strategy = new Strategy();
        strategy.Attacks();

        State state = new State();
        state.personActionToTraffic();


        // Creationals
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();

        FactoryMethod factoryMethod = new FactoryMethod();
        factoryMethod.getAccessToRole();

        AbstractFactory abstractFactory = new AbstractFactory();
        abstractFactory.createButtons();
    }
}