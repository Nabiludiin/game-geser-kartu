package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: MyApplication */
public final class y7 extends t4.c {

    /* renamed from: q, reason: collision with root package name */
    private final pd f22885q;

    /* renamed from: r, reason: collision with root package name */
    private Boolean f22886r;

    /* renamed from: s, reason: collision with root package name */
    private String f22887s;

    public y7(pd pdVar, String str) {
        p3.o.m(pdVar);
        this.f22885q = pdVar;
        this.f22887s = null;
    }

    private final void P4(g0 g0Var, ae aeVar) {
        pd pdVar = this.f22885q;
        pdVar.E();
        pdVar.k(g0Var, aeVar);
    }

    private final void Z4(ae aeVar, boolean z7) {
        p3.o.m(aeVar);
        String str = aeVar.f21861q;
        p3.o.g(str);
        q5(str, false);
        this.f22885q.N0().o(aeVar.f21862r);
    }

    private final void q5(String str, boolean z7) {
        boolean z8;
        if (TextUtils.isEmpty(str)) {
            this.f22885q.a().o().a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z7) {
            try {
                if (this.f22886r == null) {
                    if (!"com.google.android.gms".equals(this.f22887s)) {
                        pd pdVar = this.f22885q;
                        if (!com.google.android.gms.common.util.t.a(pdVar.e(), Binder.getCallingUid()) && !k3.l.a(pdVar.e()).c(Binder.getCallingUid())) {
                            z8 = false;
                            this.f22886r = Boolean.valueOf(z8);
                        }
                    }
                    z8 = true;
                    this.f22886r = Boolean.valueOf(z8);
                }
                if (this.f22886r.booleanValue()) {
                    return;
                }
            } catch (SecurityException e8) {
                this.f22885q.a().o().b("Measurement Service called with invalid calling package. appId", p5.x(str));
                throw e8;
            }
        }
        if (this.f22887s == null && k3.k.l(this.f22885q.e(), Binder.getCallingUid(), str)) {
            this.f22887s = str;
        }
        if (str.equals(this.f22887s)) {
        } else {
            throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
        }
    }

    @Override // t4.d
    public final void B2(long j7, String str, String str2, String str3) {
        V5(new a7(this, str2, str3, str, j7));
    }

    final /* synthetic */ void C1(ae aeVar) {
        pd pdVar = this.f22885q;
        pdVar.E();
        pdVar.Q0(aeVar);
    }

    @Override // t4.d
    public final void C2(ae aeVar) {
        String str = aeVar.f21861q;
        p3.o.g(str);
        q5(str, false);
        V5(new i7(this, aeVar));
    }

    final /* synthetic */ void D2(ae aeVar, Bundle bundle, t4.g gVar, String str) {
        pd pdVar = this.f22885q;
        pdVar.E();
        try {
            gVar.W0(pdVar.q0(aeVar, bundle));
        } catch (RemoteException e8) {
            this.f22885q.a().o().c("Failed to return trigger URIs for app", str, e8);
        }
    }

    @Override // t4.d
    public final void G4(final ae aeVar, final g gVar) {
        Z4(aeVar, false);
        V5(new Runnable() { // from class: com.google.android.gms.measurement.internal.v7
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                y7.this.v3(aeVar, gVar);
            }
        });
    }

    final /* synthetic */ void H2(String str, t4.n0 n0Var, t4.j jVar) {
        pd pdVar = this.f22885q;
        pdVar.E();
        pdVar.b().h();
        pdVar.O0();
        List<sd> o7 = pdVar.F0().o(str, n0Var, ((Integer) c5.B.b(null)).intValue());
        ArrayList arrayList = new ArrayList();
        for (sd sdVar : o7) {
            if (pdVar.t(str, sdVar.e())) {
                int i7 = sdVar.i();
                if (i7 > 0) {
                    if (i7 <= ((Integer) c5.f21995z.b(null)).intValue()) {
                        if (pdVar.f().a() >= sdVar.h() + Math.min(((Long) c5.f21991x.b(null)).longValue() * (1 << (i7 - 1)), ((Long) c5.f21993y.b(null)).longValue())) {
                        }
                    }
                    pdVar.a().w().d("[sgtm] batch skipped waiting for next retry. appId, rowId, lastUploadMillis", str, Long.valueOf(sdVar.c()), Long.valueOf(sdVar.h()));
                }
                wc b8 = sdVar.b();
                try {
                    com.google.android.gms.internal.measurement.p6 p6Var = (com.google.android.gms.internal.measurement.p6) td.W(com.google.android.gms.internal.measurement.s6.M(), b8.f22824r);
                    for (int i8 = 0; i8 < p6Var.y(); i8++) {
                        com.google.android.gms.internal.measurement.t6 t6Var = (com.google.android.gms.internal.measurement.t6) p6Var.z(i8).s();
                        t6Var.g1(pdVar.f().a());
                        p6Var.A(i8, t6Var);
                    }
                    b8.f22824r = ((com.google.android.gms.internal.measurement.s6) p6Var.s()).c();
                    if (Log.isLoggable(pdVar.a().z(), 2)) {
                        b8.f22829w = pdVar.K0().K((com.google.android.gms.internal.measurement.s6) p6Var.s());
                    }
                    arrayList.add(b8);
                } catch (com.google.android.gms.internal.measurement.gb unused) {
                    pdVar.a().r().b("Failed to parse queued batch. appId", str);
                }
            } else {
                pdVar.a().w().d("[sgtm] batch skipped due to destination in backoff. appId, rowId, url", str, Long.valueOf(sdVar.c()), sdVar.e());
            }
        }
        yc ycVar = new yc(arrayList);
        try {
            jVar.s6(ycVar);
            this.f22885q.a().w().c("[sgtm] Sending queued upload batches to client. appId, count", str, Integer.valueOf(ycVar.f22904q.size()));
        } catch (RemoteException e8) {
            this.f22885q.a().o().c("[sgtm] Failed to return upload batches for app", str, e8);
        }
    }

    @Override // t4.d
    public final byte[] I4(g0 g0Var, String str) {
        p3.o.g(str);
        p3.o.m(g0Var);
        q5(str, true);
        pd pdVar = this.f22885q;
        n5 v7 = pdVar.a().v();
        i5 M0 = pdVar.M0();
        String str2 = g0Var.f22160q;
        v7.b("Log and bundle. event", M0.a(str2));
        long c8 = pdVar.f().c() / 1000000;
        try {
            byte[] bArr = (byte[]) pdVar.b().s(new n7(this, g0Var, str)).get();
            if (bArr == null) {
                pdVar.a().o().b("Log and bundle returned null. appId", p5.x(str));
                bArr = new byte[0];
            }
            pdVar.a().v().d("Log and bundle processed. event, size, time_ms", pdVar.M0().a(str2), Integer.valueOf(bArr.length), Long.valueOf((pdVar.f().c() / 1000000) - c8));
            return bArr;
        } catch (InterruptedException e8) {
            e = e8;
            pd pdVar2 = this.f22885q;
            pdVar2.a().o().d("Failed to log and bundle. appId, event, error", p5.x(str), pdVar2.M0().a(g0Var.f22160q), e);
            return null;
        } catch (ExecutionException e9) {
            e = e9;
            pd pdVar22 = this.f22885q;
            pdVar22.a().o().d("Failed to log and bundle. appId, event, error", p5.x(str), pdVar22.M0().a(g0Var.f22160q), e);
            return null;
        }
    }

    @Override // t4.d
    public final void J6(ae aeVar) {
        Z4(aeVar, false);
        V5(new z6(this, aeVar));
    }

    @Override // t4.d
    public final void M3(final ae aeVar) {
        p3.o.g(aeVar.f21861q);
        p3.o.m(aeVar.I);
        O(new Runnable() { // from class: com.google.android.gms.measurement.internal.x7
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                y7.this.r0(aeVar);
            }
        });
    }

    final void M5(g0 g0Var, ae aeVar) {
        pd pdVar = this.f22885q;
        o6 D0 = pdVar.D0();
        String str = aeVar.f21861q;
        com.google.android.gms.internal.measurement.e1 e1Var = TextUtils.isEmpty(str) ? null : (com.google.android.gms.internal.measurement.e1) D0.f22430j.c(str);
        if (e1Var == null) {
            this.f22885q.a().w().b("EES not loaded for", aeVar.f21861q);
            P4(g0Var, aeVar);
            return;
        }
        try {
            Map Z = pdVar.K0().Z(g0Var.f22161r.R0(), true);
            String str2 = g0Var.f22160q;
            String a8 = t4.w.a(str2);
            if (a8 != null) {
                str2 = a8;
            }
            if (e1Var.b(new com.google.android.gms.internal.measurement.b(str2, g0Var.f22163t, Z))) {
                if (e1Var.c()) {
                    pd pdVar2 = this.f22885q;
                    pdVar2.a().w().b("EES edited event", g0Var.f22160q);
                    P4(pdVar2.K0().m(e1Var.e().c()), aeVar);
                } else {
                    P4(g0Var, aeVar);
                }
                if (e1Var.d()) {
                    for (com.google.android.gms.internal.measurement.b bVar : e1Var.e().f()) {
                        pd pdVar3 = this.f22885q;
                        pdVar3.a().w().b("EES logging created event", bVar.b());
                        P4(pdVar3.K0().m(bVar), aeVar);
                    }
                    return;
                }
                return;
            }
        } catch (com.google.android.gms.internal.measurement.d2 unused) {
            this.f22885q.a().o().c("EES error. appId, eventName", aeVar.f21862r, g0Var.f22160q);
        }
        this.f22885q.a().w().b("EES was not applied to event", g0Var.f22160q);
        P4(g0Var, aeVar);
    }

    @Override // t4.d
    public final void N4(i iVar) {
        p3.o.m(iVar);
        p3.o.m(iVar.f22222s);
        p3.o.g(iVar.f22220q);
        q5(iVar.f22220q, true);
        V5(new c7(this, new i(iVar)));
    }

    final void O(Runnable runnable) {
        p3.o.m(runnable);
        pd pdVar = this.f22885q;
        if (pdVar.b().p()) {
            runnable.run();
        } else {
            pdVar.b().v(runnable);
        }
    }

    final g0 T5(g0 g0Var, ae aeVar) {
        e0 e0Var;
        if ("_cmp".equals(g0Var.f22160q) && (e0Var = g0Var.f22161r) != null && e0Var.Q0() != 0) {
            String P0 = e0Var.P0("_cis");
            if ("referrer broadcast".equals(P0) || "referrer API".equals(P0)) {
                this.f22885q.a().u().b("Event has been filtered ", g0Var.toString());
                return new g0("_cmpx", e0Var, g0Var.f22162s, g0Var.f22163t);
            }
        }
        return g0Var;
    }

    final void V5(Runnable runnable) {
        p3.o.m(runnable);
        pd pdVar = this.f22885q;
        if (pdVar.b().p()) {
            runnable.run();
        } else {
            pdVar.b().t(runnable);
        }
    }

    @Override // t4.d
    public final List V6(String str, String str2, boolean z7, ae aeVar) {
        Z4(aeVar, false);
        String str3 = aeVar.f21861q;
        p3.o.m(str3);
        try {
            List<wd> list = (List) this.f22885q.b().r(new d7(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (wd wdVar : list) {
                if (!z7 && yd.N(wdVar.f22832c)) {
                }
                arrayList.add(new ud(wdVar));
            }
            return arrayList;
        } catch (InterruptedException e8) {
            e = e8;
            this.f22885q.a().o().c("Failed to query user properties. appId", p5.x(aeVar.f21861q), e);
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e9) {
            e = e9;
            this.f22885q.a().o().c("Failed to query user properties. appId", p5.x(aeVar.f21861q), e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // t4.d
    public final void V7(ae aeVar) {
        p3.o.g(aeVar.f21861q);
        p3.o.m(aeVar.I);
        O(new j7(this, aeVar));
    }

    @Override // t4.d
    public final List Y7(ae aeVar, boolean z7) {
        Z4(aeVar, false);
        String str = aeVar.f21861q;
        p3.o.m(str);
        try {
            List<wd> list = (List) this.f22885q.b().r(new x6(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (wd wdVar : list) {
                if (!z7 && yd.N(wdVar.f22832c)) {
                }
                arrayList.add(new ud(wdVar));
            }
            return arrayList;
        } catch (InterruptedException e8) {
            e = e8;
            this.f22885q.a().o().c("Failed to get user properties. appId", p5.x(aeVar.f21861q), e);
            return null;
        } catch (ExecutionException e9) {
            e = e9;
            this.f22885q.a().o().c("Failed to get user properties. appId", p5.x(aeVar.f21861q), e);
            return null;
        }
    }

    final /* synthetic */ void a4(Bundle bundle, String str, ae aeVar) {
        pd pdVar = this.f22885q;
        boolean H = pdVar.B0().H(null, c5.W0);
        if (bundle.isEmpty() && H) {
            u F0 = this.f22885q.F0();
            F0.h();
            F0.j();
            try {
                F0.u0().execSQL("delete from default_event_params where app_id=?", new String[]{str});
                return;
            } catch (SQLiteException e8) {
                F0.f22928a.a().o().b("Error clearing default event params", e8);
                return;
            }
        }
        u F02 = pdVar.F0();
        F02.h();
        F02.j();
        byte[] c8 = F02.f22755b.K0().J(new b0(F02.f22928a, "", str, "dep", 0L, 0L, bundle)).c();
        w6 w6Var = F02.f22928a;
        w6Var.a().w().c("Saving default event parameters, appId, data size", str, Integer.valueOf(c8.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", c8);
        try {
            if (F02.u0().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                w6Var.a().o().b("Failed to insert default event parameters (got -1). appId", p5.x(str));
            }
        } catch (SQLiteException e9) {
            F02.f22928a.a().o().c("Error storing default event parameters. appId", p5.x(str), e9);
        }
        pd pdVar2 = this.f22885q;
        u F03 = pdVar2.F0();
        long j7 = aeVar.T;
        if (F03.H(str, j7)) {
            pdVar2.F0().I(str, Long.valueOf(j7), null, bundle);
        }
    }

    @Override // t4.d
    public final void c2(g0 g0Var, String str, String str2) {
        p3.o.m(g0Var);
        p3.o.g(str);
        q5(str, true);
        V5(new m7(this, g0Var, str));
    }

    @Override // t4.d
    public final List e4(ae aeVar, Bundle bundle) {
        Z4(aeVar, false);
        p3.o.m(aeVar.f21861q);
        pd pdVar = this.f22885q;
        if (!pdVar.B0().H(null, c5.Z0)) {
            try {
                return (List) this.f22885q.b().r(new q7(this, aeVar, bundle)).get();
            } catch (InterruptedException | ExecutionException e8) {
                this.f22885q.a().o().c("Failed to get trigger URIs. appId", p5.x(aeVar.f21861q), e8);
                return Collections.EMPTY_LIST;
            }
        }
        try {
            return (List) pdVar.b().s(new p7(this, aeVar, bundle)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e9) {
            this.f22885q.a().o().c("Failed to get trigger URIs. appId", p5.x(aeVar.f21861q), e9);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // t4.d
    public final List h3(String str, String str2, String str3) {
        q5(str, true);
        try {
            return (List) this.f22885q.b().r(new g7(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e8) {
            this.f22885q.a().o().b("Failed to get conditional user properties as", e8);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // t4.d
    public final void i5(ud udVar, ae aeVar) {
        p3.o.m(udVar);
        Z4(aeVar, false);
        V5(new o7(this, udVar, aeVar));
    }

    @Override // t4.d
    public final void l6(ae aeVar) {
        Z4(aeVar, false);
        V5(new y6(this, aeVar));
    }

    @Override // t4.d
    public final List m1(String str, String str2, String str3, boolean z7) {
        q5(str, true);
        try {
            List<wd> list = (List) this.f22885q.b().r(new e7(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (wd wdVar : list) {
                if (!z7 && yd.N(wdVar.f22832c)) {
                }
                arrayList.add(new ud(wdVar));
            }
            return arrayList;
        } catch (InterruptedException e8) {
            e = e8;
            this.f22885q.a().o().c("Failed to get user properties as. appId", p5.x(str), e);
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e9) {
            e = e9;
            this.f22885q.a().o().c("Failed to get user properties as. appId", p5.x(str), e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // t4.d
    public final t4.a n5(ae aeVar) {
        Z4(aeVar, false);
        p3.o.g(aeVar.f21861q);
        try {
            return (t4.a) this.f22885q.b().s(new k7(this, aeVar)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e8) {
            this.f22885q.a().o().c("Failed to get consent. appId", p5.x(aeVar.f21861q), e8);
            return new t4.a(null);
        }
    }

    @Override // t4.d
    public final String o7(ae aeVar) {
        Z4(aeVar, false);
        return this.f22885q.p0(aeVar);
    }

    @Override // t4.d
    public final void q4(g0 g0Var, ae aeVar) {
        p3.o.m(g0Var);
        Z4(aeVar, false);
        V5(new l7(this, g0Var, aeVar));
    }

    @Override // t4.d
    public final List q7(String str, String str2, ae aeVar) {
        Z4(aeVar, false);
        String str3 = aeVar.f21861q;
        p3.o.m(str3);
        try {
            return (List) this.f22885q.b().r(new f7(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e8) {
            this.f22885q.a().o().b("Failed to get conditional user properties", e8);
            return Collections.EMPTY_LIST;
        }
    }

    final /* synthetic */ void r0(ae aeVar) {
        pd pdVar = this.f22885q;
        pdVar.E();
        pdVar.P0(aeVar);
    }

    @Override // t4.d
    public final void r1(i iVar, ae aeVar) {
        p3.o.m(iVar);
        p3.o.m(iVar.f22222s);
        Z4(aeVar, false);
        i iVar2 = new i(iVar);
        iVar2.f22220q = aeVar.f21861q;
        V5(new b7(this, iVar2, aeVar));
    }

    @Override // t4.d
    public final void s4(ae aeVar) {
        Z4(aeVar, false);
        V5(new h7(this, aeVar));
    }

    final /* synthetic */ pd u4() {
        return this.f22885q;
    }

    @Override // t4.d
    public final void u5(final Bundle bundle, final ae aeVar) {
        Z4(aeVar, false);
        final String str = aeVar.f21861q;
        p3.o.m(str);
        V5(new Runnable() { // from class: com.google.android.gms.measurement.internal.w7
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                y7.this.a4(bundle, str, aeVar);
            }
        });
    }

    final /* synthetic */ void v3(ae aeVar, g gVar) {
        pd pdVar = this.f22885q;
        pdVar.E();
        pdVar.r0((String) p3.o.m(aeVar.f21861q), gVar);
    }

    @Override // t4.d
    public final void w1(final ae aeVar, final Bundle bundle, final t4.g gVar) {
        Z4(aeVar, false);
        final String str = (String) p3.o.m(aeVar.f21861q);
        this.f22885q.b().t(new Runnable() { // from class: com.google.android.gms.measurement.internal.s7
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                y7.this.D2(aeVar, bundle, gVar, str);
            }
        });
    }

    @Override // t4.d
    public final void x4(final ae aeVar) {
        p3.o.g(aeVar.f21861q);
        p3.o.m(aeVar.I);
        O(new Runnable() { // from class: com.google.android.gms.measurement.internal.r7
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                y7.this.C1(aeVar);
            }
        });
    }

    @Override // t4.d
    public final void y7(ae aeVar, final t4.n0 n0Var, final t4.j jVar) {
        Z4(aeVar, false);
        final String str = (String) p3.o.m(aeVar.f21861q);
        this.f22885q.b().t(new Runnable() { // from class: com.google.android.gms.measurement.internal.t7
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                y7.this.H2(str, n0Var, jVar);
            }
        });
    }
}
