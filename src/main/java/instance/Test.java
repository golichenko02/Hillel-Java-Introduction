package instance;

public class Test {
    public static void main(String[] args) {

        Manager manager = new Manager();
        Worker worker = new Worker();
        SysAdmin sysAdmin = new SysAdmin();
        Client client = new Client();

        checkClient(sysAdmin, SysAdmin.getName());  // является ли объект класса SysAdmin наследником класса Client.
        checkPerson(worker, Worker.getName()); // является ли объект класса Worker наследником класса Person.
        checkManager(worker,Worker.getName()); // является ли объект класса Worker наследником класса Manager.
        checkPerson(sysAdmin,SysAdmin.getName()); // является ли объект класса SysAdmin наследником класса Person
        checkClient(manager,Manager.getName()); // является ли объект класса Manager наследником класса Client
        checkEmployee(client,Client.getName()); // является ли объект класса Client наследником класса Employee.
        checkPerson(client,Client.getName()); // является ли объект класса Client наследником класса Person.


    }

    public static void checkClient(Object obj, String promt){
        if (obj instanceof  Client) {
            System.out.println( promt + " inherits " + Client.getName());
            return;
        }
        System.out.println(promt + " doesn't inherits " + Client.getName());
    }

        public  static void checkPerson(Object obj, String promt){
        if(obj instanceof Person){
            System.out.println( promt + " inherits " + Person.getName());
            return;
        }
            System.out.println(promt + "doesn't inherits " + Person.getName());
    }

    public  static void checkManager(Object obj, String promt){
        if(obj instanceof Manager){
            System.out.println( promt + " inherits " + Manager.getName());
            return;
        }
        System.out.println(promt + " doesn't inherits " + Manager.getName());
    }

    public  static void checkEmployee(Object obj, String promt){
        if(obj instanceof Employee){
            System.out.println( promt + " inherits " + Employee.getName());
            return;
        }
        System.out.println(promt + " doesn't inherits " + Employee.getName());
    }
}
