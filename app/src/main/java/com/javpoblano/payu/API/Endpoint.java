package com.javpoblano.payu.API;

/**
 * Created by javpoblano on 16/06/2016.
 */
public class Endpoint {
    private String EndpointUri;
    //constructor
    public Endpoint()
    {
        this.EndpointUri="http://plog.mybluemix.net";
        //this.EndpointUri="http://192.168.1.65:8007";
    }

    public String GetEndPoint()
    {
        return this.EndpointUri;
    }
}
