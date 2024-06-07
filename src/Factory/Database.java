package Factory;

public class Database {


    public void connect(DatabaseType databaseType) {
        DatabaseFactory databaseFactory = DatabaseFactoryFactory.getDatabaseFactory(databaseType);
        String result = databaseFactory.createQuery().generateQuery();
        System.out.println(result);
    }




}
