package Factory;

public class NoSQLQuery implements Query{
    @Override
    public String generateQuery() {
        return "This is NoSQL Query";
    }
}
