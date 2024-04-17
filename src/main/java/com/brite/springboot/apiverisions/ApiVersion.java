package com.brite.springboot.apiverisions;

public class ApiVersion {

    private String apiversion = "0.0";
    private String apiname;

    public ApiVersion(String apiversion,String apiname){
        this.apiname = apiname;
        this.apiversion= apiversion;
    }

    public String getApiversion() {
        return apiversion;
    }

    public void setApiversion(String apiversion) {
        this.apiversion = apiversion;
    }

    public String getApiname() {
        return apiname;
    }

    public void setApiname(String apiname) {
        this.apiname = apiname;
    }
}
