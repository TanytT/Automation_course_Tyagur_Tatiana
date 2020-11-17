package com.company.infrostructure;

public class TestURL {
    private String protocol;
    private String domain;
    private String port;
    private String path;
    private String param;
    private String keyValueParam;


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
            testUrl.param = (testUrl.param==null ? "" : testUrl.param+"&") + param;
            return this;
        }

        public Builder withParam(String key, String value) {
            testUrl.keyValueParam =(testUrl.keyValueParam==null ? "" : testUrl.keyValueParam+"&") +  key+ "="+value;
             return this;
        }


        public String build() {

        return (testUrl.protocol==null ? "" : testUrl.protocol+"://")
                +(testUrl.domain==null ? "" : testUrl.domain)
                +(testUrl.port==null ? "" : ":"+testUrl.port)
                +(testUrl.path==null ? "" : "/"+testUrl.path)
                +(testUrl.param==null ? "" : "?"+testUrl.param)
                +(testUrl.param==null ? (testUrl.keyValueParam==null ? "": "?"+testUrl.keyValueParam) : (testUrl.keyValueParam==null ? "": "&"+testUrl.keyValueParam));
        }
    }
}
        