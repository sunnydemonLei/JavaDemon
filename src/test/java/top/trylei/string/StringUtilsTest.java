package top.trylei.string;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StringUtilsTest {

    //去掉空格
    @Test
    public void testTrimAll(){
        String hello = "hello";

        Assert.assertEquals(StringUtils.trimAll(" hello"),hello);
        Assert.assertEquals(StringUtils.trimAll(" h   ello"),hello);
        Assert.assertEquals(StringUtils.trimAll(" hello  "),hello);

    }

    @Test
    public void testReverse(){
        Assert.assertEquals(StringUtils.reverse("hello"),"olleh");
        Assert.assertEquals(StringUtils.reverse("123"),"321");
        Assert.assertEquals(StringUtils.reverse("890"),"098");
    }
}
