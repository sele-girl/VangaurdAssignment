package getRequest;

import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import io.restassured.http.Headers;
import io.restassured.response.Response;
public class GetData {
	
@Test
	public void testResponseCode()
	{
	
	int code=get("https://www.vanguardinvestments.com.au/retail/mvc/getNavPriceList.jsonp").getStatusCode();
	System.out.println("Status Code is" +code);
	Assert.assertEquals( code /*actual value*/,200 /*expected value*/, "Correct status code returned");
	
	}
@Test
public void testResponseBody()
{

String data =get("https://www.vanguardinvestments.com.au/retail/mvc/getNavPriceList.jsonp").asString();
System.out.println("Response body is" +data);

}
@Test
public void teststatusHeader()
{

String headerName1 =get("https://www.vanguardinvestments.com.au/retail/mvc/getNavPriceList.jsonp").asString();
Headers headerName=get("https://www.vanguardinvestments.com.au/retail/mvc/getNavPriceList.jsonp").getHeaders();
System.out.println("Header Name is" +headerName1);

}
@Test
public void GetStatusLine()
{

String statusline =get("https://www.vanguardinvestments.com.au/retail/mvc/getNavPriceList.jsonp").getStatusLine();
System.out.println("Statusline is" +statusline);

}
@Test
public void testResponsetime()
{
	String data =get("https://www.vanguardinvestments.com.au/retail/mvc/getNavPriceList.jsonp").asString();
long time=get("https://www.vanguardinvestments.com.au/retail/mvc/getNavPriceList.jsonp").getTime();
System.out.println("Response time is" +time);



}
}
