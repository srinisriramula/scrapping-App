import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ScrappingServiceTest {

    ScrappingService scrappingService;

    @Before
    public void setUp(){
        scrappingService = new ScrappingService();
    }

    @Test
    public void testScrape(){
        String resultMessage = scrappingService.doScrape();
        Assert.assertEquals("scrapping done successfully", resultMessage);
    }
}
