package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;

/* compiled from: MyApplication */
public abstract class k extends g {

    /* renamed from: q, reason: collision with root package name */
    private final Activity f2273q;

    /* renamed from: r, reason: collision with root package name */
    private final Context f2274r;

    /* renamed from: s, reason: collision with root package name */
    private final Handler f2275s;

    /* renamed from: t, reason: collision with root package name */
    private final int f2276t;

    /* renamed from: u, reason: collision with root package name */
    final n f2277u;

    k(e eVar) {
        this(eVar, eVar, new Handler(), 0);
    }

    Activity g() {
        return this.f2273q;
    }

    Context i() {
        return this.f2274r;
    }

    Handler k() {
        return this.f2275s;
    }

    public abstract Object l();

    public abstract LayoutInflater m();

    public abstract boolean n(Fragment fragment);

    public void o(Fragment fragment, Intent intent, int i7, Bundle bundle) {
        if (i7 != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        androidx.core.content.a.j(this.f2274r, intent, bundle);
    }

    public abstract void p();

    k(Activity activity, Context context, Handler handler, int i7) {
        this.f2277u = new o();
        this.f2273q = activity;
        this.f2274r = (Context) androidx.core.util.e.g(context, "context == null");
        this.f2275s = (Handler) androidx.core.util.e.g(handler, "handler == null");
        this.f2276t = i7;
    }
}
