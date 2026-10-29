package k2;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;
import s2.k5;
import s2.x2;

/* compiled from: MyApplication */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final k5 f24418a;

    /* renamed from: b, reason: collision with root package name */
    private final b f24419b;

    private j(k5 k5Var) {
        this.f24418a = k5Var;
        x2 x2Var = k5Var.f26158s;
        this.f24419b = x2Var == null ? null : x2Var.M0();
    }

    public static j e(k5 k5Var) {
        if (k5Var != null) {
            return new j(k5Var);
        }
        return null;
    }

    public String a() {
        return this.f24418a.f26161v;
    }

    public String b() {
        return this.f24418a.f26163x;
    }

    public String c() {
        return this.f24418a.f26162w;
    }

    public String d() {
        return this.f24418a.f26160u;
    }

    public final JSONObject f() {
        JSONObject jSONObject = new JSONObject();
        k5 k5Var = this.f24418a;
        jSONObject.put("Adapter", k5Var.f26156q);
        jSONObject.put("Latency", k5Var.f26157r);
        String d8 = d();
        if (d8 == null) {
            jSONObject.put("Ad Source Name", "null");
        } else {
            jSONObject.put("Ad Source Name", d8);
        }
        String a8 = a();
        if (a8 == null) {
            jSONObject.put("Ad Source ID", "null");
        } else {
            jSONObject.put("Ad Source ID", a8);
        }
        String c8 = c();
        if (c8 == null) {
            jSONObject.put("Ad Source Instance Name", "null");
        } else {
            jSONObject.put("Ad Source Instance Name", c8);
        }
        String b8 = b();
        if (b8 == null) {
            jSONObject.put("Ad Source Instance ID", "null");
        } else {
            jSONObject.put("Ad Source Instance ID", b8);
        }
        JSONObject jSONObject2 = new JSONObject();
        Bundle bundle = k5Var.f26159t;
        for (String str : bundle.keySet()) {
            jSONObject2.put(str, bundle.get(str));
        }
        jSONObject.put("Credentials", jSONObject2);
        b bVar = this.f24419b;
        if (bVar == null) {
            jSONObject.put("Ad Error", "null");
            return jSONObject;
        }
        jSONObject.put("Ad Error", bVar.e());
        return jSONObject;
    }

    public String toString() {
        try {
            return f().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
