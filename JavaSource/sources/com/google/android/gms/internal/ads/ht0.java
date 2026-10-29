package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MyApplication */
public abstract class ht0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f9682a = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*\\s*<!DOCTYPE(\\s)+html(|(\\s)+[^>]*)>", 2);

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f9683b = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*?\\s*<!DOCTYPE[^>]*>", 2);

    public static String a(String str, String... strArr) {
        String str2;
        StringBuilder sb = new StringBuilder();
        Matcher matcher = f9682a.matcher(str);
        if (matcher.find()) {
            int end = matcher.end();
            sb.append(str.substring(0, end));
            String str3 = strArr[0];
            if (str3 != null) {
                sb.append(str3);
            }
            sb.append(str.substring(end));
        } else {
            if (!f9683b.matcher(str).find() && (str2 = strArr[0]) != null) {
                sb.append(str2);
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public static String b(c03 c03Var) {
        if (((Boolean) s2.b0.c().d(uy.S5)).booleanValue() && c03Var.T) {
            z03 z03Var = c03Var.V;
            if (z03Var.b() && c03Var.f6152b != 4) {
                ba2 ba2Var = z03Var.c() == 1 ? ba2.VIDEO : ba2.HTML_DISPLAY;
                String str = c03Var.f6173l0;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("creativeType", ba2Var.toString());
                    jSONObject.put("contentUrl", str);
                    return "<script>Object.defineProperty(window,'GOOG_OMID_JAVASCRIPT_SESSION_SERVICE_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
                } catch (JSONException e8) {
                    int i7 = v2.n1.f26802b;
                    w2.p.g("Unable to build OMID ENV JSON", e8);
                }
            }
        }
        return null;
    }
}
