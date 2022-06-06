public class If {
    public static void main(String[] args){
        int month = 5;
        boolean winter = month == 12 || month == 1 || month == 2;
        boolean spring = month >= 3 && month <= 5;
        boolean summer = month >= 6 && month <= 8;
        boolean autumn = month >= 9 && month <= 11;
        if (winter) {
            System.out.println(month + " месяц - зимний");
        }else {
            if (spring) {
                System.out.println(month + " месяц - весенний");
            }else {
                if (summer) {
                    System.out.println(month + " месяц - летний");
                }else {
                    if (autumn) {
                        System.out.println(month + " месяц - осенний");
                    }else {
                        System.out.println(month + " месяца не существует");
                    }
                }
            }

        }
    }
}