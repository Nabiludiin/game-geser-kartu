package k2;

import org.json.JSONException;
import org.json.JSONObject;
import s2.x2;

/* compiled from: MyApplication */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final int f24375a;

    /* renamed from: b, reason: collision with root package name */
    private final String f24376b;

    /* renamed from: c, reason: collision with root package name */
    private final String f24377c;

    /* renamed from: d, reason: collision with root package name */
    private final b f24378d;

    public b(int i7, String str, String str2, b bVar) {
        this.f24375a = i7;
        this.f24376b = str;
        this.f24377c = str2;
        this.f24378d = bVar;
    }

    public int a() {
        return this.f24375a;
    }

    public String b() {
        return this.f24377c;
    }

    public String c() {
        return this.f24376b;
    }

    public final x2 d() {
        x2 x2Var;
        b bVar = this.f24378d;
        if (bVar == null) {
            x2Var = null;
        } else {
            x2Var = new x2(bVar.f24375a, bVar.f24376b, bVar.f24377c, null, null);
        }
        return new x2(this.f24375a, this.f24376b, this.f24377c, x2Var, null);
    }

    public JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Code", this.f24375a);
        jSONObject.put("Message", this.f24376b);
        jSONObject.put("Domain", this.f24377c);
        b bVar = this.f24378d;
        if (bVar == null) {
            jSONObject.put("Cause", "null");
            return jSONObject;
        }
        jSONObject.put("Cause", bVar.e());
        return jSONObject;
    }

    public String toString() {
        try {
            return e().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }

    public b(int i7, String str, String str2) {
        this(i7, str, str2, null);
    }
}
