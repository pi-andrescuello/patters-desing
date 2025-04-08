enum Role {
    ADMIN, USER
}

interface IRoleUser {
    Role getRole();
}

class Admin implements IRoleUser {
    public Role getRole() {
        return Role.ADMIN;
    }

    public String toString() {
        return "ADMIN";
    }
}

class User implements IRoleUser {
    public Role getRole() {
        return Role.USER;
    }

    public String toString() {
        return "USER";
    }
}

// Creator (abstract)
abstract class AccessFactory {
    public abstract IRoleUser assignAccess();
}

// Concrete creators
class AdminFactory extends AccessFactory {
    public IRoleUser assignAccess() {
        return new Admin();
    }
}

class UserFactory extends AccessFactory {
    public IRoleUser assignAccess() {
        return new User();
    }
}


public class FactoryMethod {
    public void getAccessToRole(){
        AccessFactory factory;

        factory = new AdminFactory();
        System.out.println(factory.assignAccess());

        factory = new UserFactory();
        System.out.println(factory.assignAccess());
    }
}