import java.util.ArrayList;
/**
 * Tester
 */
public class StaffTester
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<>();
        list.add("Goodyear");
        list.add("Sathyanantha");
        list.add("Keomahavong");
        list.add("Addison");
        list.add("Smith");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("^aeiouy$");
        list2.add("^AEIOUY$");


        Staff lister = new Staff(list);
        Staff lister2 = new Staff(list2);
        Staff empty = new Staff(new ArrayList<String>()); //test an empty list


        lister.replaceVowelsWith("*");
        System.out.println(lister);
        System.out.println("Expected: [G**d***r, S*th**n*nth*, K**m*h*v*ng, *dd*s*n, Sm*th]");

        lister2.replaceVowelsWith("#");
        System.out.println(lister2);
        System.out.println("Expected: [^######$, ^######$]");

        empty.replaceVowelsWith("*");
        System.out.println(empty);
        System.out.println("Expected: []");


        //testing equals
        list.clear();
        list.add("Goodyear");
        list.add("Sathyanantha");
        list.add("Keomahavong");
        list.add("Addison");
        list.add("Smith");
        lister = new Staff(list);

        list2.clear();
        list2.add("Goodyear");
        list2.add("Sathyanantha");
        list2.add("Keomahavong");
        list2.add("Addison");
        list2.add("Smith");
        lister2 = new Staff(list2);

        System.out.println("equal?: " + lister.equals(lister2));
        System.out.println("Expected: true");


        list2.remove(list2.size() - 1);
        System.out.println("equal?: " + lister.equals(lister2));
        System.out.println("Expected: false");

        System.out.println("contains?: " + lister.sameContents(lister2));
        System.out.println("Expected: false");

        list2.add(1, "Smith");
        System.out.println("contains?: " + lister.sameContents(lister2));
        System.out.println("Expected: true");


        list2.set(1, "smith");
        System.out.println("equal?: " + lister.equals(lister2));
        System.out.println("Expected: false");

        System.out.println("equal?: " + empty.equals(empty));
        System.out.println("Expected: true");

        System.out.println(lister.mostVowels());
        System.out.println("Expected: Keomahavong");

        list.remove(2);
        System.out.println(lister.mostVowels());
        System.out.println("Expected: Goodyear");

        System.out.println(empty.mostVowels());
        System.out.println("Expected: null");

    }

}
