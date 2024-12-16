package bank;

public class Account{
    public String name;
    protected String email;
    private String password;

    //getters and setters used for accessing the data of the class with private access modifiers

    public String getPassword(){
        return this.password;
    }

    public void setPassword(String pass){
        this.password = pass;
    }

}
