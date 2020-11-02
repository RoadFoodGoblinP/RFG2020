package com.example.rfg2020;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class RegisterRequest extends StringRequest {
    // 서버 URL 설정 ( PHP 파일 연동 )
    final static private String URL = "http://10.0.2.2/register.php";
    private Map<String, String> map;

    public RegisterRequest(int MemberNo, String Password, String Nickname, String Name, String OneInfo, String ProfileImg, Response.Listener<String> listener) {
        super(Method.POST, URL, listener, null);

        map = new HashMap<>();
        map.put("MemberNo", MemberNo + "");
        map.put("Password", Password);
        map.put("Nickname", Nickname);
        map.put("Name", Name);
        map.put("OneInfo", OneInfo);
        map.put("ProfileImg", ProfileImg);
    }

    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return map;
    }
}
