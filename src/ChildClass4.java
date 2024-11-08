public class ChildClass4 extends ParentClass implements Printable {
    private String department;

    public ChildClass4(int id, String department) {
        super(id);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public void print() {
        System.out.println("ChildClass4: ID = " + getId() + ", Department = " + department);
    }
}
