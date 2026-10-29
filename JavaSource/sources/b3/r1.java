package b3;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.cj1;
import com.google.android.gms.internal.ads.lx1;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class r1 implements cj1 {

    /* renamed from: q, reason: collision with root package name */
    private final lx1 f3340q;

    /* renamed from: r, reason: collision with root package name */
    private final q1 f3341r;

    /* renamed from: s, reason: collision with root package name */
    private final String f3342s;

    /* renamed from: t, reason: collision with root package name */
    private final int f3343t;

    public r1(lx1 lx1Var, q1 q1Var, String str, int i7) {
        this.f3340q = lx1Var;
        this.f3341r = q1Var;
        this.f3342s = str;
        this.f3343t = i7;
    }

    @Override // com.google.android.gms.internal.ads.cj1
    public final void a(m0 m0Var) {
        String str;
        if (m0Var == null || this.f3343t == 2) {
            return;
        }
        if (TextUtils.isEmpty(m0Var.f3295c)) {
            this.f3341r.a(this.f3342s, m0Var.f3294b, this.f3340q);
            return;
        }
        try {
            str = new JSONObject(m0Var.f3295c).optString("request_id");
        } catch (JSONException e8) {
            r2.t.l().i(e8, "RenderSignals.getRequestId");
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f3341r.a(str, m0Var.f3295c, this.f3340q);
    }

    @Override // com.google.android.gms.internal.ads.cj1
    public final void y(String str) {
    }
}
