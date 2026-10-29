package b3;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.cj1;
import v2.f2;

/* compiled from: MyApplication */
public final class o0 implements cj1 {

    /* renamed from: q, reason: collision with root package name */
    private final c0 f3310q;

    /* renamed from: r, reason: collision with root package name */
    private final int f3311r;

    /* renamed from: s, reason: collision with root package name */
    private final String f3312s;

    public o0(c0 c0Var, int i7, String str) {
        this.f3310q = c0Var;
        this.f3311r = i7;
        this.f3312s = str;
    }

    @Override // com.google.android.gms.internal.ads.cj1
    public final void a(final m0 m0Var) {
        if (m0Var == null || this.f3311r != 2 || TextUtils.isEmpty(this.f3312s)) {
            return;
        }
        f2.T(new Runnable() { // from class: b3.n0
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                o0.this.b(m0Var);
            }
        });
    }

    final /* synthetic */ void b(m0 m0Var) {
        this.f3310q.a(this.f3312s, m0Var);
    }

    @Override // com.google.android.gms.internal.ads.cj1
    public final void y(String str) {
    }
}
