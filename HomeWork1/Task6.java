package HomeWork1;


public class Task6 {
    public static String createPhoneNumber(int[] numbs) {
        StringBuilder sb = new StringBuilder();
        for(int numb: numbs) {
            sb.append(numb);
        }
        sb.insert(0,"(");
        sb.insert(4,") ");
        sb.insert(9, "-");
        return sb.toString();
    }

    public static void main(String[] args) {
        int[] phoneNumber = {1,2,3,4,5,6,7,8,9,0};
        System.out.println(createPhoneNumber(phoneNumber));
    }
}
