public class Toplama {

    public static void main(String[] args) {

        topla(3,2,5,-10);

    }

    public static void topla(int... a){
        int toplam = 0;
        for (int w : a) {
            toplam+=w;
        }

        System.out.println("toplam = " + toplam);
    }

}
