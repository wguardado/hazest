package com.imtj.hazest;

public class Information {
    
    private long ts;

    private String host;

    public long getTs() {
        return this.ts;
    }

    public void setTs(long ts) {
        this.ts = ts;
    }

    public String getHost() {
        return this.host;
    }

    public void setHost(String host) {
        this.host = host;
    }


    @Override
    public String toString() {
        return "{" +
            " ts='" + getTs() + "'" +
            ", host='" + getHost() + "'" +
            "}";
    }
    

}
