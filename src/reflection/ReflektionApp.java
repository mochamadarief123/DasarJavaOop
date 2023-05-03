package reflection;

public class ReflektionApp {
    public static void main(String[] args) {
        LoginRequest request = new LoginRequest();
        request.setUsername("dani");
        request.setPassword("rahasia");
        
       ValidationLoginRequest.validate(request);
    }
}
