Class test1{

public static void main(String[] args) {
    int x = 1;
    int y = 121;
    int z = 126;

    System.out.println(2147483647 + x);
    System.out.println(2147483647 + ’x’);
    System.out.println(2147483647 + "x");
    System.out.println(2147483648 + 3f);
    System.out.println((byte) 256 * 2147483648L);
    System.out.println(y != ’y’ ? 2.0 : 1);
}
        }