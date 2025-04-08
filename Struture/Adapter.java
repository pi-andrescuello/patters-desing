package Struture;

interface IAccessToPlatform {
    Boolean read();
    Boolean write();
}

class User implements IAccessToPlatform {
    @Override
    public Boolean read() {
        return true;
    }

    @Override
    public Boolean write() {
        return true;
    }
}

class UserAdapter implements IAccessToPlatform {
    private Edit _edit;

    UserAdapter(Edit e){
        this._edit = e;
    }

    public Boolean edit(){
        return this._edit.EditUser();
    }

    @Override
    public Boolean read() {
        return true;
    }

    @Override
    public Boolean write() {
        return true;
    }
}

class Edit {
    Boolean EditUser(){
        return true;
    }
    Boolean EditAdmin(){
        return true;
    }
}

public class Adapter {
    public void UserEdit(){
        // User user = new User();
        UserAdapter user = new UserAdapter(new Edit());
        
        Boolean read = user.read();
        Boolean write = user.write();
        Boolean edit = user.edit();

        System.out.printf("Can read this user?", read);
        System.out.printf("Can write this user?", write);
        System.out.printf("Can edit this user?", edit);
    }
}
