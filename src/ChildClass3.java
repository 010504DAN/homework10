public class ChildClass3 extends ParentClass implements Printable {
    private double salary;

    public ChildClass3(int id, double salary) {
        super(id);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public void print() {
        System.out.println("ChildClass3: ID = " + getId() + ", Salary = " + salary);
    }
}