package w2;

import org.json.JSONObject;

/* compiled from: MyApplication */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    private final y f27103a;

    private w(y yVar) {
        this.f27103a = yVar;
    }

    public static w b(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("ping_strategy");
        return new w(optJSONObject == null ? new o(1, 0, 1.0d, false) : new o(optJSONObject.optInt("max_attempts", 1), optJSONObject.optInt("initial_backoff_ms", 0), optJSONObject.optDouble("backoff_multiplier", 1.0d), optJSONObject.optBoolean("buffer_after_max_attempts", false)));
    }

    public final y a() {
        return this.f27103a;
    }
}
