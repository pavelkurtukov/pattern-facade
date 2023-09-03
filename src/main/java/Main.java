public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();

        System.out.println(bins.sum("100111011", "110011"));  // 101101110
        System.out.println(bins.mult("100111011", "110011")); // 100001000
    }
}