package yams;

/**
 * @author tmblount
 */
public class SampleObject
{
    private String label;
    private String value;
    private String test;

    public SampleObject() {}

    public SampleObject(String label, String value)
    {
        this.label = label;
        this.value = value;
    }

    public String getLabel()
    {
        return label;
    }

    public void setLabel(String label)
    {
        this.label = label;
    }

    public String getValue()
    {
        return value;
    }

    public void setValue(String value)
    {
        this.value = value;
    }

    public String getTest()
    {
        return test;
    }

    public void setTest(String test)
    {
        this.test = test;
    }
}
