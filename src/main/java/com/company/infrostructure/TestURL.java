package com.company.infrostructure;

import java.util.HashMap;
import java.util.Iterator;

public class TestURL {
    private String protocol="";
    private String domain="";
    private String port="";
    private String path="";
    private HashMap<String, String> params;


    private TestURL() {
        params = new HashMap<>();
    }

     public String getProtocol() {
        return protocol;
    }

    public String getDomain() {
        return domain;
    }

    public String getPort() {
        return port;
    }

    public String getPath() {
        return path;
    }

    public HashMap<String, String> getParams() {
        return params;
    }

    @Override
    public String toString() {
        return "TestURL{" +
                "protocol='" + protocol + '\'' +
                ", domain='" + domain + '\'' +
                ", port='" + port + '\'' +
                ", path='" + path + '\'' +
                ", params='" + params + '\'' +
                '}';
    }

    public static class Builder {

        private TestURL testUrl;

        public Builder() {
            testUrl = new TestURL();
        }

        public Builder withProtocol(String protocol) {
            testUrl.protocol = protocol;
            return this;
        }

        public Builder withDomain(String domain) {
            testUrl.domain = domain;
            return this;
        }

        public Builder withPort(String port) {
            testUrl.port = port;
            return this;

        }

        public Builder withPath(String path) {
            testUrl.path = path;
            return this;
        }

        public Builder withParam(HashMap<String, String> param) {
            Iterator <String> iterator = param.keySet().iterator();
            while (iterator.hasNext()) {
                String key = iterator.next();
                testUrl.params.put(key,param.get(key));
            }
            return this;
        }

        public String build() {
            Iterator <String> iterator = testUrl.params.keySet().iterator();
            String resParam="";

            while (iterator.hasNext()){
                String key = iterator.next();
                resParam = resParam+key+"="+testUrl.params.get(key)+"&";
            }

        return (testUrl.protocol==null ? "" : testUrl.protocol+"://")
                +(testUrl.domain==null ? "" : testUrl.domain)
                +(testUrl.port==null ? "" : ":"+testUrl.port)
                +(testUrl.path==null ? "" : "/"+testUrl.path)
                +(testUrl.params.isEmpty() ? "" : "?"+resParam);
        }
    }
}
        