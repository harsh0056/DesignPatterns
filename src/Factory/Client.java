package Factory;

public class Client {

    public static void main(String[] args) {
        Database db = new Database();
        db.connect(DatabaseType.MYSQL);
        db.connect(DatabaseType.NOSQL);
        db.connect(DatabaseType.POSTGRES);
    }

}
