package unitTests;

import com.endava.amgrads.model.User;
import com.endava.amgrads.service.GeneralService;
import com.endava.amgrads.service.GeneralServiceImpl;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.Assert;
import org.testng.junit.JUnitTestClass;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
@Category(JUnitTestClass.class)

public class MockitoCheckNameTest {


    @Test
    public void checkDate(){
        GeneralService generalService = mock(GeneralServiceImpl.class);
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        Date today = Calendar.getInstance().getTime();
        String reportDate = df.format(today);
        when(generalService.getDate()).thenReturn(reportDate);
        assertEquals(generalService.getDate(),reportDate);
    }


//    @Test
//    public void TestTitle1() {
//
//        File src = new File("C:/Users/dneacsu/Desktop/phantomjs-2.1.1-windows/bin/phantomjs.exe");
//        System.setProperty("phantomjs.binary.path", src.getAbsolutePath());
//        WebDriver driver = new PhantomJSDriver();
//        driver.get("http://192.168.39.31:8080/");
//        String title1 = driver.getTitle();
//        Assert.assertTrue(title1.contains("Jenkins"));
//
//
//    }
}
