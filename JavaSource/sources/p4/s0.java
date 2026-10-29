package p4;

import android.os.Handler;
import android.webkit.WebView;
import java.util.Objects;

/* compiled from: MyApplication */
public final class s0 extends WebView {

    /* renamed from: q, reason: collision with root package name */
    private final Handler f25508q;

    /* renamed from: r, reason: collision with root package name */
    private final z0 f25509r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f25510s;

    public s0(u0 u0Var, Handler handler, z0 z0Var) {
        super(u0Var);
        this.f25510s = false;
        this.f25508q = handler;
        this.f25509r = z0Var;
    }

    static /* bridge */ /* synthetic */ boolean f(s0 s0Var, String str) {
        return str != null && str.startsWith("consent://");
    }

    public final void c() {
        final z0 z0Var = this.f25509r;
        Objects.requireNonNull(z0Var);
        this.f25508q.post(new Runnable() { // from class: p4.p0
            @Override // java.lang.Runnable
            public final void run() {
                z0.this.d();
            }
        });
    }

    public final void d(String str, String str2) {
        final String str3 = str + "(" + str2 + ");";
        this.f25508q.post(new Runnable() { // from class: p4.o0
            @Override // java.lang.Runnable
            public final void run() {
                r1.a(s0.this, str3);
            }
        });
    }
}
