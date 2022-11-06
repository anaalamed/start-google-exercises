package startAtGoogle.p2_designPatterns.ch3_structualPatterns.ex1_facade_http;

public class Response {
    private int status;
    private String body;

    public Response(int status, String body) {
        this.status = status;
        this.body = body;
    }

    public Response(int status) {
        this.status = status;
        this.body = "";
    }

    @Override
    public String toString() {
        return "Response{" +
                "code=" + status +
                ", body='" + body + '\'' +
                '}';
    }
}
