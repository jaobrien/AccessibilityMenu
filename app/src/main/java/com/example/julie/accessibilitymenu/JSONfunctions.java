package com.example.julie.accessibilitymenu;

import android.util.Log;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by Julie on 3/2/2015.
 */
public class JSONfunctions
{
    public JSONfunctions()
    {
        super();
    }

    public boolean parseUserAuth(JSONObject object)
    {     boolean userAuth=false;
        try
        {
            userAuth= object.getBoolean("Value");
        }
        catch (JSONException e)
        {
            // TODO Auto-generated catch block
            Log.d("JSONParser => parseUserAuth", e.getMessage());
        }
        return userAuth;
    }
}