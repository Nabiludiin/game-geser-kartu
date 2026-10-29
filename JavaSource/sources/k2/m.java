package k2;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class m extends b {

    /* renamed from: e, reason: collision with root package name */
    private final u f24421e;

    public m(int i7, String str, String str2, b bVar, u uVar) {
        super(i7, str, str2, bVar);
        this.f24421e = uVar;
    }

    @Override // k2.b
    public final JSONObject e() {
        JSONObject e8 = super.e();
        u f8 = f();
        if (f8 == null) {
            e8.put("Response Info", "null");
            return e8;
        }
        e8.put("Response Info", f8.d());
        return e8;
    }

    public u f() {
        return this.f24421e;
    }

    @Override // k2.b
    public String toString() {
        try {
            return e().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
