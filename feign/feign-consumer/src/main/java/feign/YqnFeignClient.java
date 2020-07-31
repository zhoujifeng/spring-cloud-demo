package feign;

import feign.Client.Default;
import feign.Request.Options;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author yueqi.shi
 * @date 2018/10/22 14:00
 */
public class YqnFeignClient extends Default {
    /**
     * Null parameters imply platform defaults.
     *
     * @param sslContextFactory
     * @param hostnameVerifier
     */
    public YqnFeignClient(SSLSocketFactory sslContextFactory,
                          HostnameVerifier hostnameVerifier) {
        super(sslContextFactory, hostnameVerifier);
    }

    @Override
    public Response execute(Request request, Options options) throws IOException {
        //long start = System.currentTimeMillis();
        HttpURLConnection connection = convertAndSend(request,  options);
        long end = System.currentTimeMillis();
        //System.out.println((end-start));
        Response response = convertResponse(connection,request);
        return response;
    }

}