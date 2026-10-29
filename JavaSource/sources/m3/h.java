package m3;

import android.app.Activity;

/* compiled from: MyApplication */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private final Object f24800a;

    public h(Activity activity) {
        p3.o.n(activity, "Activity must not be null");
        this.f24800a = activity;
    }

    public final Activity a() {
        return (Activity) this.f24800a;
    }

    public final androidx.fragment.app.e b() {
        return (androidx.fragment.app.e) this.f24800a;
    }

    public final boolean c() {
        return this.f24800a instanceof Activity;
    }

    public final boolean d() {
        return this.f24800a instanceof androidx.fragment.app.e;
    }
}
