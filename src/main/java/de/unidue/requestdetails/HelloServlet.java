package de.unidue.requestdetails;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet(value="/hello", name="helloServlet")
public class HelloServlet extends HttpServlet {


    private static final Logger LOG = LogManager.getLogger(HelloServlet.class);

    private static final String KEY_VALUE_FORMAT_STRING = "%20s: %s";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        printHeaders(req);
        printParameters(req);
        printDetails(req);
    }

    private void printHeaders(HttpServletRequest req) {

        LOG.info("--- REQUEST HEADERS ---");
        Enumeration<String> headerNames = req.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String headerName = headerNames.nextElement();
            String headerValue = req.getHeader(headerName);

            LOG.info(format(headerName, headerValue));
        }
    }

    private void printParameters(HttpServletRequest req) {

        LOG.info("--- REQUEST PARAMETERS ---");
        Enumeration<String> parameterNames = req.getParameterNames();
        while (parameterNames.hasMoreElements()) {
            String parameterName = parameterNames.nextElement();
            String parameterValue = req.getParameter(parameterName);

            LOG.info(format(parameterName, parameterValue));
        }
    }

    private void printDetails(HttpServletRequest req) {
        LOG.info("--- REQUEST DETAILS ---");

        // httpservletrequest
        LOG.info(format("AuthType", req.getAuthType()));
        LOG.info(format("ContextPath", req.getContextPath()));
        LOG.info(format("Method", req.getMethod()));
        LOG.info(format("PathInfo", req.getPathInfo()));
        LOG.info(format("PathTranslated", req.getPathTranslated()));
        LOG.info(format("QueryString", req.getQueryString()));
        LOG.info(format("RemoteUser", req.getRemoteUser()));
        LOG.info(format("RequestedSessionId", req.getRequestedSessionId()));
        LOG.info(format("RequestURI", req.getRequestURI()));
        LOG.info(format("RequestURL", req.getRequestURL()));
        LOG.info(format("ServletPath", req.getServletPath()));

        // servletrequest
        LOG.info(format("CharacterEncoding", req.getCharacterEncoding()));
        LOG.info(format("ContentLength", req.getContentLength()));
        LOG.info(format("ContentType", req.getContentType()));
        LOG.info(format("LocalAddr", req.getLocalAddr()));
        LOG.info(format("Locale", req.getLocale()));
        LOG.info(format("LocalName", req.getLocalName()));
        LOG.info(format("LocalPort", req.getLocalPort()));
        LOG.info(format("Protocol", req.getProtocol()));
        LOG.info(format("RemoteAddr", req.getRemoteAddr()));
        LOG.info(format("RemoteHost", req.getRemoteHost()));
        LOG.info(format("RemotePort", req.getRemotePort()));
        LOG.info(format("Scheme", req.getScheme()));
        LOG.info(format("ServerName", req.getServerName()));
        LOG.info(format("ServerPort", req.getServerPort()));
    }

    private static String format(String key, Object value) {
        return value != null
                ? String.format(KEY_VALUE_FORMAT_STRING, key, value.toString())
                : String.format(KEY_VALUE_FORMAT_STRING, key, "null") ;
    }
}
