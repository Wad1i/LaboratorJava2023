package Lab8;
    import java.util.*;
    import java.util.stream.Collectors;

public class lista {
    public static void main(String[] args) {
        problema1();
        problema2();
        problema3();
    }

    public static void problema1() {
        List<Integer> nr = Arrays.asList(4, 5, 5, 6, 7, 7);

        List<Integer> dublicari = nr.stream().distinct().collect(Collectors.toList());
        System.out.println("Listele fara dublicari sunt " +dublicari);
    }

    public static void problema2() {
        List<String> animale = Arrays.asList("leu", "caine", "elefant", "leopard");
        char literaspecif ='l';
        int counter = (int) animale.stream().filter(s->s.startsWith(String.valueOf(literaspecif))).count();
        System.out.println("Numarul de animale care incepe cu litera l este: " +counter);
    }

    public static void problema3(){
        List<Integer>num=new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu marimea listi: ");
        int size = scanner.nextInt();
       for(int i=0;i< size; i++){
           num.add(scanner.nextInt());
       }
        Collections.sort(num);
        System.out.println("Listele ordonate asc: " +num);
        Collections.sort(num, Collections.reverseOrder());
        System.out.println("Listele ordonate desc: " +num);

    }
}