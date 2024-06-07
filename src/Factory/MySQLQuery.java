package Factory;

public class MySQLQuery implements Query{

    @Override
    public String generateQuery() {
        return "This is MySQL Query";
    }
}
