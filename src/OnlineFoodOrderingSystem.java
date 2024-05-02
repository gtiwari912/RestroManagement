import java.util.Scanner;

public class OnlineFoodOrderingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userName = sc.next();
        String password = sc.next();

        UserDatabaseClass db = new UserDatabaseClass();
        db.users.containsKey(userName){
            String realPassword = db.users.get(userName);
            if(realPassword.equals(password)){
                String type = db.userType.get(userName);
                if(type.equals("admin")){
                    //show adimin features
                }
            }
        }
    }
}
