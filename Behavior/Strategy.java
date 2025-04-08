package Behavior;

interface IAttack {
    public void action();
}

class Push implements IAttack {
    @Override
    public void action(){
        System.out.println("Pushing");
    }
}

class Run implements IAttack{
    @Override
    public void action(){
        System.out.println("Running");
    }
}

public class Strategy{
    public void Attacks() {
        Run run = new Run();
        run.action();
        Push push = new Push();
        push.action();
    }
}