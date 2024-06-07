package Factory;

public class NoSQLDatabaseFactory implements   DatabaseFactory {
    @Override
    public NoSQLQuery createQuery() {
        return new NoSQLQuery();
    }
}
