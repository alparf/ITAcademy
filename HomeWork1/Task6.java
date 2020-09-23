package HomeWork1;

public class Task6 {
    public static String createPhoneNumber(int[] numbs) {
        StringBuilder sb = new StringBuilder();
        String reg = "(\\d{3})(\\d{3})(\\d{4})";
        String replace = "($1) $2-$3";
        for(int numb: numbs) {
            sb.append(numb);
        }
        return sb.toString().replaceFirst(reg, replace);
    }

    public static void main(String[] args) {
        int[] phoneNumber = {1,2,3,4,5,6,7,8,9,0};
        System.out.println(createPhoneNumber(phoneNumber));
    }
}
