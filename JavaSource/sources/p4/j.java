package p4;

import android.app.Application;

/* compiled from: MyApplication */
final class j {

    /* renamed from: a, reason: collision with root package name */
    private Application f25411a;

    /* synthetic */ j(m mVar) {
    }

    public final a a() {
        p2.b(this.f25411a, Application.class);
        return new i(this.f25411a);
    }

    public final j b(Application application) {
        application.getClass();
        this.f25411a = application;
        return this;
    }
}
