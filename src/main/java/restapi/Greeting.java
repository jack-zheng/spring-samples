package restapi;

public class Greeting {
    private final long id;
    private final String conent;


    public Greeting(long id, String conent) {
        this.id = id;
        this.conent = conent;
    }

    public long getId() {
        return id;
    }

    public String getConent() {
        return conent;
    }
}
