package m4;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: MyApplication */
public final class d extends p3.g {
    protected d(Context context, Looper looper, p3.d dVar, m3.e eVar, m3.n nVar) {
        super(context, looper, 300, dVar, eVar, nVar);
    }

    @Override // p3.c
    public final k3.d[] A() {
        return h3.h.f24096b;
    }

    @Override // p3.c
    protected final String J() {
        return "com.google.android.gms.appset.internal.IAppSetService";
    }

    @Override // p3.c
    protected final String K() {
        return "com.google.android.gms.appset.service.START";
    }

    @Override // p3.c
    protected final boolean N() {
        return true;
    }

    @Override // p3.c
    public final boolean X() {
        return true;
    }

    @Override // p3.c, l3.a.f
    public final int o() {
        return 212800000;
    }

    @Override // p3.c
    protected final /* synthetic */ IInterface x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appset.internal.IAppSetService");
        return queryLocalInterface instanceof g ? (g) queryLocalInterface : new g(iBinder);
    }
}
