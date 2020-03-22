package Date0321;
//http://hc.apache.org/httpcomponents-client-5.0.x/httpclient5/examples/ClientWithResponseHandler.java

import java.io.IOException;

import org.apache.hc.client5.http.ClientProtocolException;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.ClassicHttpResponse;
import org.apache.hc.core5.http.HttpEntity;
import org.apache.hc.core5.http.HttpStatus;
import org.apache.hc.core5.http.ParseException;
import org.apache.hc.core5.http.io.HttpClientResponseHandler;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;

public class DriverTest {

    public static void main(final String[] args) throws Exception {
        try (final CloseableHttpClient httpclient = HttpClients.createDefault()) {
            final HttpGet httpget = new HttpGet("http://www.omdbapi.com/?i=tt3896198&apikey=a2b91a13&t=superman");

            System.out.println("Executing request " + httpget.getMethod() + " " + httpget.getUri());

            // Create a custom response handler
            final HttpClientResponseHandler<String> responseHandler = new HttpClientResponseHandler<String>() {

                @Override
                public String handleResponse(
                        final ClassicHttpResponse response) throws IOException {
                    final int status = response.getCode();
                    if (status >= HttpStatus.SC_SUCCESS && status < HttpStatus.SC_REDIRECTION) {
                        final HttpEntity entity = response.getEntity();
                        try {
                            return entity != null ? EntityUtils.toString(entity) : null;
                        } catch (final ParseException ex) {
                            throw new ClientProtocolException(ex);
                        }
                    } else {
                        throw new ClientProtocolException("Unexpected response status: " + status);
                    }
                }

            };
            final String responseBody = httpclient.execute(httpget, responseHandler);
            System.out.println("----------------------------------------");
            System.out.println(responseBody);

            //import Json
            //parse JSON
            JSONObject jsons = new JSONObject(responseBody);
            System.out.println(">" + jsons.getString("Poster"));//簡單的可以這樣做

            //how to get Ratings(Arrays)
            JSONArray ratings = jsons.getJSONArray("Ratings");

            for (Object obj : ratings) {
//                System.out.println("obj>" + obj);
                JSONObject value = new JSONObject(obj.toString());
                System.out.println("value="+value.getString("Value"));
                  
            }

        }
    }
}
/*想解讀這段 用ORG.JSON 
Ratings":"
+ "[{"Source":"Internet Movie Database","Value":"7.3/10"},"
+ "{"Source":"Rotten Tomatoes","Value":"94%"},"
+ "{"Source":"Metacritic","Value":"80/100"}],
 */
