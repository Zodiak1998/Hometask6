
class Employee extends UniversityVisitor {
    public float salary;
    public String objectSince;

    public Employee(String name, float salary) {
        super(name, VisitorType.Employee);
        this.salary = salary;
    }

    public String getObjectSince() {
        return objectSince;
    }

    public void setObjectSince(String objectSince) {
        this.objectSince = objectSince;
    }
}

