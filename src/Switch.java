public class Switch {
    public static void main(String[] args){
        int month = 101;

        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println(month + " месяц - зимний");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(month + " месяц - весенний");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(month + " месяц - летний");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(month + " месяц - осенний");
                break;
            default:
                System.out.println(month + " месяца не существует");
        }
    }
}
