package pl.globoox.sprawdzsprzedawce.Utils;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by GlobooX on 10.06.2018.
 */

public class addComment extends StringRequest{

    private static final String ADDCOMMENT_REQUEST_URL = "https://sprawdzsprzedawce.pl/appAPI/addComment.php";
    private Map<String, String> params;

    public addComment(String accessToken, String userID,String name,String comment,String status,String fbUID, Response.Listener<String> listener) {
        super(Method.POST, ADDCOMMENT_REQUEST_URL, listener, null);
        params = new HashMap<>();
        params.put("accessToken", accessToken);
        params.put("userID", userID);
        params.put("name", name);
        params.put("comment", comment);
        params.put("status", status);
        params.put("fbUID", fbUID);
    }


    @Override
    public Map<String, String> getParams() {
        return params;
    }



}


