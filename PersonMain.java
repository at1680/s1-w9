public class PersonMain{
    public static void main(String[] args) {
        Person p = new Person(5.0);
        Person p1 = new Person(5.0); 
        System.out.println(p.equals(p1));
    }
}