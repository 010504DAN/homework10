public class ChildClass2 extends ParentClass implements Printable {
    private String name;

    public ChildClass2(int id, String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println("ChildClass2: ID = " + getId() + ", Name = " + name);
    }
}