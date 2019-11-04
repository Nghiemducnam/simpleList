public class Main {
    public static void main(String[] args) {
    SimpleList<Integer> list = new SimpleList<>();
    list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);

        System.out.println("the element 4 is: " + list.get(4));
        System.out.println("the element 1 is: " + list.get(1));
        System.out.println("the element 2 is: " + list.get(2));

        list.get(-1);
        System.out.println("the element -1 is: " + list.get(-1));

    }
}
