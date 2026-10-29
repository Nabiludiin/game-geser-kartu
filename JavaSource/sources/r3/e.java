package r3;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import m3.n;
import p3.g;
import p3.v;

/* compiled from: MyApplication */
public final class e extends g {
    private final v I;

    public e(Context context, Looper looper, p3.d dVar, v vVar, m3.e eVar, n nVar) {
        super(context, looper, 270, dVar, eVar, nVar);
        this.I = vVar;
    }

    @Override // p3.c
    public final k3.d[] A() {
        return n4.d.f25022b;
    }

    @Override // p3.c
    protected final Bundle F() {
        return this.I.c();
    }

    @Override // p3.c
    protected final String J() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // p3.c
    protected final String K() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // p3.c
    protected final boolean N() {
        return true;
    }

    @Override // p3.c, l3.a.f
    public final int o() {
        return 203400000;
    }

    @Override // p3.c
    protected final /* synthetic */ IInterface x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof a ? (a) queryLocalInterface : new a(iBinder);
    }
}
