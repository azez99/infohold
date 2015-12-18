import java.util.ArrayList;

class TitleBar
{
    private ArrayList<Field> fields;
    private int numOfFields;
    
    public TitleBar()
    {
        this.fields = new ArrayList<>();
        this.numOfFields = 0;
    }
    
    public void addField(int indexAdd , Field itemAdd)
    {
        this.fields.add(indexAdd , itemAdd);
    }
    
    public void deleteField(int indexRemove)
    {
        this.fields.remove(indexRemove);
    }
    
    public void moveField(int oldIndex , int newIndex , Field item)
    {
        this.fields.remove(oldIndex);
        this.fields.add(newIndex , item);
    }
    
    public ArrayList<Field> getFields()
    {
        return this.fields;
    }
}