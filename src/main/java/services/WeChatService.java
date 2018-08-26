package services;

import javax.servlet.http.HttpServletRequest;

public interface WeChatService {

    String processRequest(HttpServletRequest request);
}
