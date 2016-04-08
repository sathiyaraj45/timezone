package com.timezone;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.Calendar;
import java.util.TimeZone;

/**
 * Created by sathiyarajr on 25/2/16.
 */


public class TimeZoneObject extends CordovaPlugin {

    public TimeZoneObject(){}

    @Override
    public boolean execute(String action, JSONArray args,final CallbackContext callbackContext) throws JSONException {
        JSONObject data = args.getJSONObject(0);
        if (action.equals("all")) {            
            getAllDetails(callbackContext);
        } 
        return false;
    }

    public boolean getAllDetails(CallbackContext callbackContext) throws JSONException {
        JSONObject res = new JSONObject();  
        Calendar cal = Calendar.getInstance();
        TimeZone tz = cal.getTimeZone();        
        res.put("currentTimeZone", tz.getDisplayName());        
        callbackContext.success(res);
        return true;
    }
}

