package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MyApplication */
public abstract /* synthetic */ class r80 {
    public static void a(s80 s80Var, String str, JSONObject jSONObject) {
        s80Var.h(str, jSONObject.toString());
    }

    public static void b(s80 s80Var, String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(str2).length() + 2);
        sb.append(str);
        sb.append("(");
        sb.append(str2);
        sb.append(");");
        s80Var.b(sb.toString());
    }

    public static void c(s80 s80Var, String str, JSONObject jSONObject) {
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(jSONObject2);
        sb.append(");");
        String sb2 = sb.toString();
        int i7 = v2.n1.f26802b;
        w2.p.a("Dispatching AFMA event: ".concat(sb2));
        s80Var.b(sb.toString());
    }

    public static void d(s80 s80Var, String str, Map map) {
        try {
            s80Var.a(str, s2.z.a().s(map));
        } catch (JSONException unused) {
            int i7 = v2.n1.f26802b;
            w2.p.f("Could not convert parameters to JSON.");
        }
    }
}
