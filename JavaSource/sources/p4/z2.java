package p4;

import android.app.Activity;
import android.app.Application;
import x4.a;

/* compiled from: MyApplication */
final class z2 {

    /* renamed from: a, reason: collision with root package name */
    private final Application f25550a;

    /* renamed from: b, reason: collision with root package name */
    private final r f25551b;

    z2(Application application, r rVar) {
        this.f25550a = application;
        this.f25551b = rVar;
    }

    final h1 c(Activity activity, x4.d dVar) {
        x4.a a8 = dVar.a();
        if (a8 == null) {
            a8 = new a.C0146a(this.f25550a).b();
        }
        return d3.a(new d3(this, activity, a8, dVar, null));
    }
}
