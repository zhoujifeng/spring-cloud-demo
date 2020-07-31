package feign;

import com.kind.springcloud.Friend;
import org.springframework.cloud.netflix.ribbon.SpringClientFactory;
import org.springframework.cloud.openfeign.ribbon.CachingSpringLoadBalancerFactory;
import org.springframework.cloud.openfeign.ribbon.LoadBalancerFeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yueqi.shi
 * @date 2018/10/20 21:25
 */
@Configuration
public class YqnFeignClientsConfiguration {

    @Bean
    public Client feignClient(CachingSpringLoadBalancerFactory cachingFactory,
                              SpringClientFactory clientFactory) {
        return new LoadBalancerFeignClient(new YqnFeignClient(null, null),
                cachingFactory, clientFactory);
    }

    @Bean
    public Friend createFriend() {
        Friend friend = new Friend();
        return friend;
    }

}