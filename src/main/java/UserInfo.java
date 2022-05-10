public class UserInfo {
        private String username;
        private int age;
        private char gender;

        public int getAge(){
            return age;
        }
        public String getUsername(){
            return username;
        }
        public char getGender(){
            return gender;
        }


        public void setAge(int newAge){
            age = newAge;
        }
        public void setUsername(String newUsername){
            username = newUsername;
        }
        public void setGender(char newGender){
            gender = newGender;
        }
    }
