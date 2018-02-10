package yams;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Properties;

/**
 * A reaaaallly simple main to demonstrate the use of reading properties from YAML using
 * Spring's special YamlPropertiesFactoryBean.
 *
 * @author tmblount
 */
public class CovertYamsMain
{
    public static void main(String[] args)
    {
        // open/read the application context file
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        SampleObject sampleObject = (SampleObject) ctx.getBean("helloWorld");

        Properties properties = (Properties) ctx.getBean("yamlProperties");

        System.out.println(sampleObject.getLabel() + ": " + sampleObject.getValue());

        System.out.println(properties.get("test2.label2").toString() + "    " + properties.get("test2.value2").toString());

        System.out.println("Sample object with properties-injected test field: " + sampleObject.getTest());
    }
}
