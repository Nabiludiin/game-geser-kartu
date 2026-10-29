package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class q60 implements y50 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f14269a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final Map f14270b = new HashMap();

    @Override // com.google.android.gms.internal.ads.y50
    public final void a(Object obj, Map map) {
        String str = (String) map.get("id");
        String str2 = (String) map.get("fail");
        String str3 = (String) map.get("fail_reason");
        String str4 = (String) map.get("fail_stack");
        String str5 = (String) map.get("result");
        if (true == TextUtils.isEmpty(str4)) {
            str3 = "Unknown Fail Reason.";
        }
        String concat = TextUtils.isEmpty(str4) ? "" : "\n".concat(String.valueOf(str4));
        synchronized (this.f14269a) {
            try {
                p60 p60Var = (p60) this.f14270b.remove(str);
                if (p60Var == null) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 50);
                    sb.append("Received result for unexpected method invocation: ");
                    sb.append(str);
                    String sb2 = sb.toString();
                    int i7 = v2.n1.f26802b;
                    w2.p.f(sb2);
                    return;
                }
                if (!TextUtils.isEmpty(str2)) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + concat.length());
                    sb3.append(str3);
                    sb3.append(concat);
                    p60Var.v(sb3.toString());
                    return;
                }
                if (str5 == null) {
                    p60Var.a(null);
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(str5);
                    if (v2.n1.m()) {
                        String jSONObject2 = jSONObject.toString(2);
                        StringBuilder sb4 = new StringBuilder(String.valueOf(jSONObject2).length() + 13);
                        sb4.append("Result GMSG: ");
                        sb4.append(jSONObject2);
                        v2.n1.k(sb4.toString());
                    }
                    p60Var.a(jSONObject);
                } catch (JSONException e8) {
                    p60Var.v(e8.getMessage());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(String str, p60 p60Var) {
        synchronized (this.f14269a) {
            this.f14270b.put(str, p60Var);
        }
    }

    public final a5.d c(e90 e90Var, String str, JSONObject jSONObject) {
        im0 im0Var = new im0();
        r2.t.g();
        String uuid = UUID.randomUUID().toString();
        b(uuid, new o60(this, im0Var));
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", uuid);
            jSONObject2.put("args", jSONObject);
            e90Var.c(str, jSONObject2);
            return im0Var;
        } catch (Exception e8) {
            im0Var.e(e8);
            return im0Var;
        }
    }
}
