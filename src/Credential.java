public class Credential {
    private String description;
    private String username;
    private String password;

    public void setCredential(String desc, String uname, String pass){
        description = desc;
        username = uname;
        password = pass;
    }
    public String [] getCredential(){
        String [] output = new String[]{description,username,password};
        return output;
    }

    public String getInfo(){
        String output = description + "  :  " + password + "  :  " + username;
        return output;
    }
}
