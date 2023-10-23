public class Probleme3 {
    public static void main(String[] args) {
        problema3();
        problema2();
        problema1();
    }

    private static void problema1() {
        String cuvant = "message";
        for (int i = cuvant.length() - 1; i >= 0; i--) {
            System.out.println(cuvant.charAt(i));
        }

    }

    private static void problema2() {
        String[] a = {"lava", "test", "university"};
        String[] b = {"car", "university", "plane"};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i].equals(b[j])) {
                    System.out.println(a[i]);

                }

            }
        }
    }

    private static void problema3() {
        Integer[] a={1,2,3,4,5,6,7,8,9,10,11,12,13,14,411,87,98,41};

        for(int i=0;i<a.length;i++)
        {
            if(prim(a[i])){
                System.out.println(a[i]+ " prim");
            }
        }

    }

    private static boolean prim(int n) {
        for (int f = 2; f <= n / 2; f++) {
            if (n % f == 0)
                return false;

        }
        return true;
    }

}
