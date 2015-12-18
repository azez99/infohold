class Field
{
    private String name;
    private String data;
    
    public class Field()
    {
        this.name = "blank";
        this.data = "blank";
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public void setName(String newName)
    {
        this.name = newName;
    }
    
    public String getData()
    {
        return this.data;
    }
    
    public void setData(String newData)
    {
        this.data = newData;
    }
}