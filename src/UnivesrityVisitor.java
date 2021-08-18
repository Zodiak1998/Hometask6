
enum VisitorType {
    Employee,
    Student
}

class UniversityVisitor {
    public static int incrementId = 0;
    public int id;
    public String name;
    public VisitorType visitorType;

    public UniversityVisitor(String name, VisitorType visitorType) {
        this.id = UniversityVisitor.incrementId++;
        this.name = name;
        this.visitorType = visitorType;
    }

    public static void main(String[] args) {

        Archive archive = new Archive();
        String name = "";
        archive.getByType(VisitorType.Student);
        archive.getByType(VisitorType.Employee);
        archive.getAll(name);

    }
}