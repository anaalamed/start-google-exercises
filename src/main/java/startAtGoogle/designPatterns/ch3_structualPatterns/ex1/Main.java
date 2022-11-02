package startAtGoogle.designPatterns.ch3_structualPatterns.ex1;

public class Main {

    // return obj with status and body

    public static void main(String[] args) throws Exception {
        // get
        String getUri = "https://reqres.in/api/users?page=2";
        Response getRes = FacadeHttp.get(getUri);
        System.out.println(getRes);

        // post
        String postUri = "https://reqres.in/api/users";
        Response postRes = FacadeHttp.post(postUri, "ana", "developer");
        System.out.println(postRes);

        // put
        String putUri = "https://reqres.in/api/users/2";
        Response putRes = FacadeHttp.put(putUri, "ana", "developer");
        System.out.println(putRes);

        // patch
        String patchUri = "https://reqres.in/api/users/2";
        Response patchRes = FacadeHttp.patch(patchUri, "anaaa", "developerrrr");
        System.out.println(patchRes);

        // delete
        String deleteUri = "https://reqres.in/api/users/2";
        Response deleteRes = FacadeHttp.delete(deleteUri);
        System.out.println(deleteRes);

    }
}
