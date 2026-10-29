package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.Objects;

/* compiled from: MyApplication */
public final class f6 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    private final String f22127a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g6 f22128b;

    f6(g6 g6Var, String str) {
        Objects.requireNonNull(g6Var);
        this.f22128b = g6Var;
        this.f22127a = str;
    }

    final /* synthetic */ String a() {
        return this.f22127a;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.f22128b.f22169a.a().r().a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            com.google.android.gms.internal.measurement.u0 O = com.google.android.gms.internal.measurement.t0.O(iBinder);
            if (O == null) {
                this.f22128b.f22169a.a().r().a("Install Referrer Service implementation was not found");
                return;
            }
            w6 w6Var = this.f22128b.f22169a;
            w6Var.a().w().a("Install Referrer Service connected");
            w6Var.b().t(new e6(this, O, this));
        } catch (RuntimeException e8) {
            this.f22128b.f22169a.a().r().b("Exception occurred while calling Install Referrer API", e8);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f22128b.f22169a.a().w().a("Install Referrer Service disconnected");
    }
}
