package Factory;

public class PostGreSQL implements Query    {
    @Override
    public String generateQuery() {
        return "This is PostGreSQL Query";
    }
}
