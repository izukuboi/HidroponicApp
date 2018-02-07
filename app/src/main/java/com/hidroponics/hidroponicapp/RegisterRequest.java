package com.hidroponics.hidroponicapp;

import android.nfc.Tag;
import android.util.Log;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;
import android.util.Log;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 1/29/2018.
 */

public class RegisterRequest extends StringRequest {
    private static final String TAG = "RegisterReq";

    private static final String REGISTER_REQUEST_URL = "http://10.0.2.2/hidroponia/newRegister.php";//enlace del documento php.
    private Map<String , String> params;

    public RegisterRequest(String name, String username, String apellido, String password,String email, Response.Listener<String> listener){
        super(Method.POST, REGISTER_REQUEST_URL, listener, null);
        Log.d(TAG, "Constructor RegisterRequest");
        params = new HashMap<>();
        params.put("Nombre", name);
        params.put("Apellido", apellido);
        params.put("Usuario", username);
        params.put("Password", password);
        params.put("Email", email);
        Log.d(TAG, params.toString());


    }

    @Override
    public Map<String, String> getParams() {
        Log.d(TAG, "GetParams");
        return params;
    }
}
