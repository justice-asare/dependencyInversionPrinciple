public class MySQLDatabase implements Database{

    @Override
    public void connect() {
        System.out.println("Connecting MySQL database...");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting MySQL database...");
    }
}
