package Factory;

public class PostgresDatabaseFactory implements DatabaseFactory{
    @Override
    public PostGreSQL createQuery() {
        return new PostGreSQL();
    }
}
