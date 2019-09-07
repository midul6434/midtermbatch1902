import org.junit.Assert;
import org.junit.Test;
import reader.DataReader;

public class DataReaderTest {
    @Test
    public void DataReader(){
        DataReader obj= new DataReader();
        String actualresult=obj.midul();
        String expectresult="There are no alternatives to working hard. Things may seem difficult when we start something\n" +
                "new but we can reach our goal if we have that commitment to our goal and continue working hard\n" +
                "in the right directions. Where there is a chance of success there are more challenges to get\n" +
                "that success, a person is tested all times highest for any success. A success without test\n" +
                "is meaningless and not enjoyable. Brave people do not like to get something without challenge.\n" +
                "Be brave and embrace the challenges of the open world";

        Assert.assertEquals(actualresult,expectresult);


    }
}
