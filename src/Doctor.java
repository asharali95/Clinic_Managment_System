public class Doctor implements Login{
    private String username;
    private String password;

    public void setId(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void setCredentials(String username, String password) {
        setId(username);
        setPassword(password);
    }
    @Override
    public void dashboard(){
        System.out.println("welcome to doctor dashboard");
    }
}
