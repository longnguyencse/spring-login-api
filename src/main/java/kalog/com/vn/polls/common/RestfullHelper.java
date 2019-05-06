package kalog.com.vn.polls.common;

import org.springframework.beans.factory.annotation.Value;

public class RestfullHelper {

    @Value("${host.remote.config}")
    private String hostRemote;


}
