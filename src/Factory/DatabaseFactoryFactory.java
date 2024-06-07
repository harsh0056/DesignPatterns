package Factory;

public class DatabaseFactoryFactory {


    public static DatabaseFactory getDatabaseFactory(DatabaseType databaseType){
        switch (databaseType) {
            case MYSQL:
                return new MySQLDatabaseFactory();
            case NOSQL:
                return new NoSQLDatabaseFactory();
            case POSTGRES:
                return new PostgresDatabaseFactory();
            default:
                return new MySQLDatabaseFactory();
        }
    }

}
