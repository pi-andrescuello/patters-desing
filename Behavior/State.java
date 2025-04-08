package Behavior;

interface ITraffic {
    String handleState();
}

class Advance implements ITraffic {
    public String handleState() {
        return "Avanzar";
    }
}

class Stop implements ITraffic {
    public String handleState() {
        return "Detenerse";
    }
}

class StateTraffic {
    private ITraffic state;

    public void setState(ITraffic state) {
        this.state = state;
    }

    public void showState() {
        System.out.println(state.handleState());
    }
}

public class State {
    public void personActionToTraffic() {
        StateTraffic traffic = new StateTraffic();

        traffic.setState(new Advance());
        traffic.showState();

        traffic.setState(new Stop());
        traffic.showState();
    }
}
