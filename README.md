### Description

This simple java web application outputs several http request parameters, header and additional information on its web containers log file.

### Sample

    ...HelloServlet - --- REQUEST HEADERS ---
    ...HelloServlet -      x-forwarded-for: 192.168.0.1
    ...HelloServlet -            x-real-ip: 192.168.0.1
    ...HelloServlet -                 host: www.uni-duisburg-essen.de
    ...HelloServlet -    x-forwarded-proto: https
    ...HelloServlet -           connection: close
    ...HelloServlet -               accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8
    ...HelloServlet -           user-agent: Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Ubuntu Chromium/41.0.2272.76 Chrome/41.0.2272.76 Safari/537.36
    ...HelloServlet -      accept-encoding: gzip, deflate, sdch
    ...HelloServlet -      accept-language: de-DE,de;q=0.8,en-US;q=0.6,en;q=0.4
    ...HelloServlet -               cookie: JSESSIONID=88439AC8EDCFDC343D343685D3F1340C
    ...HelloServlet - --- REQUEST PARAMETERS ---
    ...HelloServlet - --- REQUEST DETAILS ---
    ...HelloServlet -             AuthType: null
    ...HelloServlet -          ContextPath: /requestdetails
    ...HelloServlet -               Method: GET
    ...HelloServlet -             PathInfo: null
    ...HelloServlet -       PathTranslated: null
    ...HelloServlet -          QueryString: null
    ...HelloServlet -           RemoteUser: null
    ...HelloServlet -   RequestedSessionId: 88439AC8EDCFDC343D343685D3F1340C
    ...HelloServlet -           RequestURI: /requestdetails/hello
    ...HelloServlet -           RequestURL: https://www.uni-duisburg-essen.de/requestdetails/hello
    ...HelloServlet -          ServletPath: /hello
    ...HelloServlet -    CharacterEncoding: null
    ...HelloServlet -        ContentLength: -1
    ...HelloServlet -          ContentType: null
    ...HelloServlet -            LocalAddr: 127.0.0.1
    ...HelloServlet -               Locale: de_DE
    ...HelloServlet -            LocalName: localhost
    ...HelloServlet -            LocalPort: 8443
    ...HelloServlet -             Protocol: HTTP/1.0
    ...HelloServlet -           RemoteAddr: 127.0.0.1
    ...HelloServlet -           RemoteHost: 127.0.0.1
    ...HelloServlet -           RemotePort: 38438
    ...HelloServlet -               Scheme: https
    ...HelloServlet -           ServerName: www.uni-duisburg-essen.de
    ...HelloServlet -           ServerPort: 443
