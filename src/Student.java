
class Student extends UniversityVisitor {
    public String speciality;
    public Integer cours;

    public Student(String name, String speciality) {
        super(name, VisitorType.Student);
        this.speciality = speciality;
    }

    public void setCours(Integer cours) {
        this.cours = cours;
    }

    public Integer getCours() {
        return cours;
    }
}
