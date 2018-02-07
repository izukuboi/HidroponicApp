package com.hidroponics.hidroponicapp;

import android.util.Log;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 2/3/2018.
 */

public class CamaRequest extends StringRequest  {
    private static final String TAG = "CamaReq";

    private static final String REGISTER_REQUEST_URL = "http://10.0.2.2/hidroponia/Sensores.php";//enlace del documento php.
    private Map<String , String> params;

    public CamaRequest(String username ,Response.Listener<String> listener){
        super(Method.POST, REGISTER_REQUEST_URL, listener, null);
        Log.d(TAG, "Constructor RegisterRequest");
        params = new HashMap<>();
        params.put("username", username);


    }

    @Override
    public Map<String, String> getParams() {
        Log.d(TAG, "GetParams");
        return params;
    }
}
