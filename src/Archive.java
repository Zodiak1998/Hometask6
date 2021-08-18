import java.util.ArrayList;

class Archive {
    private ArrayList<UniversityVisitor> _array = new ArrayList<UniversityVisitor>();

    public Archive() {}

    public void add(UniversityVisitor user) {
        this._array.add(user);
    }

    public UniversityVisitor getByName(String name) {
        for(int i = 0; i < this._array.size(); i++) {
            if(this._array.get(i).name.equals(name)) return this._array.get(i);
        }
        return null;
    }

    public ArrayList getByType(VisitorType visitorType) {
        ArrayList that = new ArrayList();
        for(int i = 0; i < this._array.size(); i++) {
            if(this._array.get(i).visitorType == visitorType)
                that.add(this._array.get(i));
        }
        return that;
    }

    public ArrayList getAll(String name) {
        ArrayList that = new ArrayList();
        for (int i = 0; i < this._array.size(); i++) {
            if (this._array.get(i).name.equals(name))
                that.add(this._array.get(i));
        }
        return that;
    }
}