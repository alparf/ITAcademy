package HomeWork1;

public class Task6 {
    public static String createPhoneNumber(int[] numbs) {
        final String REG = "(\\d{3})(\\d{3})(\\d{4})";
        final String REP = "($1) $2-$3";
        StringBuilder sb = new StringBuilder();
        for(int numb: numbs) {
            sb.append(numb);
        }
        return sb.toString().replaceFirst(REG, REP);
    }

    public static void main(String[] args) {
        int[] phoneNumber = {1,2,3,4,5,6,7,8,9,0};
        System.out.println(createPhoneNumber(phoneNumber));
    }
}
