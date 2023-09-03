public class BinOps {
    public String sum(String a, String b) {
        Integer binA = Integer.parseInt(a, 2);
        Integer binB = Integer.parseInt(b, 2);

        return Integer.toBinaryString(binA + binB);
    }

    public String mult(String a, String b) {
        Integer binA = Integer.parseInt(a, 2);
        Integer binB = Integer.parseInt(b, 2);

        return Integer.toBinaryString(binA - binB);
    }
}