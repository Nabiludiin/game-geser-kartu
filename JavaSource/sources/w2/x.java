package w2;

import org.json.JSONObject;

/* compiled from: MyApplication */
public abstract class x {
    public static x d(JSONObject jSONObject) {
        return new n(jSONObject.optInt("impression_prerequisite", 0), jSONObject.optInt("click_prerequisite", 0), jSONObject.optBoolean("notification_flow_enabled", false));
    }

    public abstract int a();

    public abstract int b();

    public abstract boolean c();
}
