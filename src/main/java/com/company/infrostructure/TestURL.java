package com.company.infrostructure;

public class TestURL {
    private String protocol="";
    private String domain="";
    private String port="";
    private String path="";
    private String params;


    private TestURL() {

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

    public String getParams() {
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

        public Builder withParam(String param) {
            testUrl.params = (testUrl.params==null ? "" : testUrl.params+"&") + param;
            return this;
        }

        public Builder withParam(String key, String value) {
            testUrl.params =(testUrl.params==null ? "" : testUrl.params+"&") +  key+ "="+value;
             return this;
        }


        public String build() {

        return (testUrl.protocol==null ? "" : testUrl.protocol+"://")
                +(testUrl.domain==null ? "" : testUrl.domain)
                +(testUrl.port==null ? "" : ":"+testUrl.port)
                +(testUrl.path==null ? "" : "/"+testUrl.path)
                +(testUrl.params==null ? "" : "?"+testUrl.params);
        }
    }
}
        