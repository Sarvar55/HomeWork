
package camphomework1;

public class User {
    private String name;
    private String LastName;
    private String email;
    private int password;

    public User(){
        
    }
    public User(String name, String LastName, String email, int password) {
        this.name = name;
        this.LastName = LastName;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
    
}
