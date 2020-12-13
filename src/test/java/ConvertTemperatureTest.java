import com.company.homeworks.HW18.ConvertTemperature;
import dataProvider.DataProviderCl;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ConvertTemperatureTest {

    ConvertTemperature temp = new ConvertTemperature();



    @Test(dataProvider = "tempCtoKdata", dataProviderClass = DataProviderCl.class)
    public void testTempCtoK(double a, double b){
        assertEquals(temp.tempCtoK(a),b);
    }

    @Test(dataProvider = "tempKtoCdata", dataProviderClass = DataProviderCl.class)
    public void testTempKtoC(double a, double b){
        assertEquals(temp.tempKtoC(a), b);
    }
}
