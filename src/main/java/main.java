public class main {
    public static void main(String[] args) {
            UserInfo obj = new UserInfo();

            obj.setAge(20);
            obj.setGender('M');
            obj.setUsername("medzeraa");

            System.out.println("Username: " + obj.getUsername());
            System.out.println("Gender: " + obj.getGender());
            System.out.println("Age: " + obj.getAge());
        }
    }