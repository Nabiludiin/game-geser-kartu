package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.g;

/* compiled from: MyApplication */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final c f2829a;

    /* renamed from: b, reason: collision with root package name */
    private final SavedStateRegistry f2830b = new SavedStateRegistry();

    private b(c cVar) {
        this.f2829a = cVar;
    }

    public static b a(c cVar) {
        return new b(cVar);
    }

    public SavedStateRegistry b() {
        return this.f2830b;
    }

    public void c(Bundle bundle) {
        g t7 = this.f2829a.t();
        if (t7.b() != g.c.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        t7.a(new Recreator(this.f2829a));
        this.f2830b.b(t7, bundle);
    }

    public void d(Bundle bundle) {
        this.f2830b.c(bundle);
    }
}
