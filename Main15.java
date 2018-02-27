public class Main15 {

    public static void main(String[] args) {
        LinkedIntList15 a = new LinkedIntList15();
        a.add(1);
        a.add(2);
        a.add(3);
        LinkedIntList15 b = new LinkedIntList15();
        b.add(1);
        b.add(2);
        b.add(3);
        LinkedIntList15 c = new LinkedIntList15();
        c.add(1);
        LinkedIntList15 d = new LinkedIntList15();
        d.add(9);
        d.add(8);
        d.add(7);

        System.out.println(a.notEquals(b));
        System.out.println(a.notEquals(c));
        System.out.println(a.notEquals(d));
    }
}
