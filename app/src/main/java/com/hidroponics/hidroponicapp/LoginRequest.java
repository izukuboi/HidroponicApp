package com.hidroponics.hidroponicapp;

import android.util.Log;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 2/2/2018.
 */

public class LoginRequest extends StringRequest{
    private static final String TAG = "RegisterReq";

    private static final String LOGIN_REQUEST_URL = "http://10.0.2.2/hidroponia/newLogin.php";//enlace del documento php.
    private Map<String , String> params;

    public LoginRequest(String username, String password, Response.Listener<String> listener){
        super(Request.Method.POST, LOGIN_REQUEST_URL, listener, null);
        Log.d(TAG, "Constructor LoginRequest");
        params = new HashMap<>();
        params.put("username", username);
        params.put("password", password);
        Log.d(TAG,"constructor ");


    }

    @Override
    public Map<String, String> getParams() {
        Log.d(TAG, "GetParamsLoginrequest");
        return params;
    }
}
