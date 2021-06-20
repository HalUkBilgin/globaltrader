package utilities;

public class ReusableMethods {

    public static String getNewEmail(String email) {
        String[] data = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k",
                "l", "m", "n", "o", "p", "r", "s", "t", "x", "u", "v", "y", "z"};
        int indexOfEt = email.indexOf("@");
        String emailFirstPart = email.substring(0, indexOfEt);
        String emailSecondPart = email.substring(indexOfEt); //@gmail.com
        String ekMail = "";
        for (int i = 0; i < 3; i++) {
            int random = (int) (Math.random()*data.length);
            ekMail += data[random];
        }
        emailFirstPart = emailFirstPart + ekMail;
        email = emailFirstPart + emailSecondPart;
        return email;
    }

    public static String getNewMobileNumber(String mobileNumber) {
        String[] data = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String numberFirstPart = mobileNumber.substring(0,mobileNumber.length()-3);
        String numberSecondPart = "";
        for (int i = 0; i < 3; i++) {
            int random = (int) (Math.random()*data.length);
            numberSecondPart += data[random];
        }
        mobileNumber = numberFirstPart + numberSecondPart;

        return mobileNumber;

    }
}
