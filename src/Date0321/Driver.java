package Date0321;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
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

public class Driver {
    public String getSearchResult(String title) {//收到使用者輸入的片名
        String responseBody = null;//這API跑完會回傳這個
        try (final CloseableHttpClient httpclient = HttpClients.createDefault()) {
            final HttpGet httpget
                    = new HttpGet("http://www.omdbapi.com/?i=tt3896198&apikey=755e22b5&s=" + title);//收到使用者輸入的片名 放上網址 要想要怎麼擋
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
            responseBody = httpclient.execute(httpget, responseHandler);
            System.out.println("----------------------------------------");
            System.out.println(responseBody);//這API跑完會回傳這個
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseBody;
    }

    public ArrayList<Movie> parseMovie(String responseBody) {
        ArrayList<Movie> result = new ArrayList<>();//想要取得responseBody內所有資料
        //parse JSON
        JSONObject jsons = new JSONObject(responseBody);
        //System.out.println("> " + jsons.getString("Title"));    //get title
        //1.先看筆數 是否大於0 ，如果是，再進行 parse，並轉成 ArrayList<String>
        boolean hasResponse = jsons.getBoolean("Response");    //如果錯誤會傳 {"Response":"False","Error":"Movie not found!"}
        if (hasResponse) {//所以如果有資料就是TRUE
            // 組成 ArrayList<String> 來回傳
            //how to get Ratings (array)
            JSONArray movies = jsons.getJSONArray("Search");
            //System.out.println(">> " + ratings);
            for (Object obj : movies) {
                JSONObject aMovie = new JSONObject(obj.toString());
                //拿到標題跟年份
                System.out.println(" > " + aMovie.getString("Title") + "("
                        + aMovie.getString("Year") + ")");

                //想要所有裡面的資料 分別SET你拿到的資料' 存進陣列中
                Movie newMovie = new Movie();

                newMovie.setTitle(aMovie.getString("Title"));//去找網頁內的資料要跟網業找到的同名才可以
                newMovie.setYear(aMovie.getString("Year"));
                newMovie.setImdbID(aMovie.getString("imdbID"));
                newMovie.setType(aMovie.getString("Type"));
                newMovie.setImageURL(aMovie.getString("Poster"));

                result.add(newMovie);//回傳
            }
        }
        return result;//FASLE
    }

    public static void main(String[] args) {//這裡測試用 要拉到UI 的Search去實作
//        Driver driver = new Driver();
//        String result = driver.getSearchResult("Fast&Furious6");//並寫拿到使用者輸入的數字
//        ArrayList<Movie> movieList = driver.parseMovie(result);//放到function內 去執行

//        Thread t1 = new Thread();
//        t1.start();//沒有工作要做 沒有Runnable物件
//        MyRunnable mr = new MyRunnable();
//        Thread t2 = new Thread(mr);
//        t2.start();
//        //匿名類別
//        Thread t3 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("in Anoyous");; //To change body of generated methods, choose Tools | Templates.
//            }
//        });
//        t3.start();
//        Thread t4 = new Thread(() -> System.out.println("Lambda"));
//        t4.start();

    }
}


//class MyRunnable implements Runnable {
//    @Override
//    public void run() {
//        System.out.println("myRunnable"); //To change body of generated methods, choose Tools | Templates.
//    }
//};
