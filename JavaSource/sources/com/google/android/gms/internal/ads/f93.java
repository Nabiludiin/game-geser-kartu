package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.ClientApi;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: MyApplication */
public final class f93 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f8093a;

    /* renamed from: b, reason: collision with root package name */
    private final w2.a f8094b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f8095c;

    /* renamed from: d, reason: collision with root package name */
    private final ClientApi f8096d = new ClientApi();

    /* renamed from: e, reason: collision with root package name */
    private final t13 f8097e;

    /* renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.common.util.e f8098f;

    f93(Context context, w2.a aVar, ScheduledExecutorService scheduledExecutorService, t13 t13Var, com.google.android.gms.common.util.e eVar) {
        this.f8093a = context;
        this.f8094b = aVar;
        this.f8095c = scheduledExecutorService;
        this.f8098f = eVar;
        this.f8097e = t13Var;
    }

    private static h83 c() {
        return new h83(((Long) s2.b0.c().d(uy.D)).longValue(), 2.0d, ((Long) s2.b0.c().d(uy.E)).longValue(), 0.2d);
    }

    public final e93 a(s2.m4 m4Var, s2.c1 c1Var) {
        k2.c c8 = k2.c.c(m4Var.f26190r);
        if (c8 == null) {
            return null;
        }
        int ordinal = c8.ordinal();
        if (ordinal == 1) {
            ClientApi clientApi = this.f8096d;
            Context context = this.f8093a;
            w2.a aVar = this.f8094b;
            return new j83(clientApi, context, aVar.f27053s, this.f8097e, m4Var, c1Var, this.f8095c, c(), this.f8098f);
        }
        if (ordinal == 2) {
            ClientApi clientApi2 = this.f8096d;
            Context context2 = this.f8093a;
            w2.a aVar2 = this.f8094b;
            return new i93(clientApi2, context2, aVar2.f27053s, this.f8097e, m4Var, c1Var, this.f8095c, c(), this.f8098f);
        }
        if (ordinal != 5) {
            return null;
        }
        ClientApi clientApi3 = this.f8096d;
        Context context3 = this.f8093a;
        w2.a aVar3 = this.f8094b;
        return new g83(clientApi3, context3, aVar3.f27053s, this.f8097e, m4Var, c1Var, this.f8095c, c(), this.f8098f);
    }

    public final e93 b(String str, s2.m4 m4Var, s2.e1 e1Var) {
        k2.c c8 = k2.c.c(m4Var.f26190r);
        if (c8 == null) {
            return null;
        }
        int ordinal = c8.ordinal();
        if (ordinal == 1) {
            ClientApi clientApi = this.f8096d;
            Context context = this.f8093a;
            w2.a aVar = this.f8094b;
            return new j83(str, clientApi, context, aVar.f27053s, this.f8097e, m4Var, e1Var, this.f8095c, c(), this.f8098f);
        }
        if (ordinal == 2) {
            ClientApi clientApi2 = this.f8096d;
            Context context2 = this.f8093a;
            w2.a aVar2 = this.f8094b;
            return new i93(str, clientApi2, context2, aVar2.f27053s, this.f8097e, m4Var, e1Var, this.f8095c, c(), this.f8098f);
        }
        if (ordinal != 5) {
            return null;
        }
        ClientApi clientApi3 = this.f8096d;
        Context context3 = this.f8093a;
        w2.a aVar3 = this.f8094b;
        return new g83(str, clientApi3, context3, aVar3.f27053s, this.f8097e, m4Var, e1Var, this.f8095c, c(), this.f8098f);
    }
}
