package b3;

import android.os.Bundle;
import android.util.JsonReader;
import com.google.android.gms.internal.ads.c52;
import com.google.android.gms.internal.ads.eh0;
import com.google.android.gms.internal.ads.n32;
import com.google.android.gms.internal.ads.p64;
import com.google.android.gms.internal.ads.w54;
import java.io.InputStreamReader;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* compiled from: MyApplication */
public final class k0 implements w54 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f3276a;

    /* renamed from: b, reason: collision with root package name */
    private final n32 f3277b;

    public k0(Executor executor, n32 n32Var) {
        this.f3276a = executor;
        this.f3277b = n32Var;
    }

    @Override // com.google.android.gms.internal.ads.w54
    public final /* bridge */ /* synthetic */ a5.d d(Object obj) {
        final eh0 eh0Var = (eh0) obj;
        return p64.j(this.f3277b.a(eh0Var), new w54() { // from class: b3.j0
            @Override // com.google.android.gms.internal.ads.w54
            public final /* synthetic */ a5.d d(Object obj2) {
                c52 c52Var = (c52) obj2;
                m0 m0Var = new m0(new JsonReader(new InputStreamReader(c52Var.a())), c52Var.b());
                eh0 eh0Var2 = eh0.this;
                try {
                    m0Var.f3294b = s2.z.a().u(eh0Var2.f7624q).toString();
                } catch (JSONException unused) {
                    m0Var.f3294b = "{}";
                }
                Bundle bundle = eh0Var2.D;
                if (!bundle.isEmpty()) {
                    try {
                        m0Var.f3295c = s2.z.a().u(bundle).toString();
                    } catch (JSONException unused2) {
                    }
                }
                return p64.a(m0Var);
            }
        }, this.f3276a);
    }
}
