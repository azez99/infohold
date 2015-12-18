class Field<GenericType>
{
    private String name;
    private GenericType data;
    
    public class Field()
    {
        this.data = new GenericType;
        this.name = data.getName();
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public void setName(String newName)
    {
        this.name = newName;
    }
    
    public GenericType getData()
    {
        return this.data;
    }
    
    public void setData(GenericData newData)
    {
        this.data = newData;
    }
}