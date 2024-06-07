package Factory;

public class MySQLDatabaseFactory  implements DatabaseFactory {

    @Override
    public MySQLQuery createQuery() {
        return new MySQLQuery();
    }
}
