package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.av2;
import com.google.android.gms.internal.ads.b70;
import com.google.android.gms.internal.ads.bh2;
import com.google.android.gms.internal.ads.cf0;
import com.google.android.gms.internal.ads.e70;
import com.google.android.gms.internal.ads.gu0;
import com.google.android.gms.internal.ads.hy2;
import com.google.android.gms.internal.ads.jo1;
import com.google.android.gms.internal.ads.jz1;
import com.google.android.gms.internal.ads.kb0;
import com.google.android.gms.internal.ads.ki0;
import com.google.android.gms.internal.ads.lo1;
import com.google.android.gms.internal.ads.p20;
import com.google.android.gms.internal.ads.pw2;
import com.google.android.gms.internal.ads.th0;
import com.google.android.gms.internal.ads.u20;
import com.google.android.gms.internal.ads.ve0;
import com.google.android.gms.internal.ads.vz2;
import com.google.android.gms.internal.ads.wk0;
import java.util.HashMap;
import r2.s;
import s2.g5;
import s2.h1;
import s2.n1;
import s2.r0;
import s2.t2;
import s2.v0;
import s2.z1;
import u2.d;
import u2.g0;
import u2.h;
import u2.h0;
import u2.j;
import u2.k;
import w3.a;
import w3.b;

/* compiled from: MyApplication */
public class ClientApi extends n1 {
    @Override // s2.o1
    public final v0 B7(a aVar, g5 g5Var, String str, kb0 kb0Var, int i7) {
        Context context = (Context) b.r0(aVar);
        av2 t7 = gu0.i(context, kb0Var, i7).t();
        t7.v(str);
        t7.d(context);
        return t7.a().a();
    }

    @Override // s2.o1
    public final v0 K7(a aVar, g5 g5Var, String str, int i7) {
        return new s((Context) b.r0(aVar), g5Var, str, new w2.a(ModuleDescriptor.MODULE_VERSION, i7, true, false));
    }

    @Override // s2.o1
    public final p20 W4(a aVar, a aVar2) {
        return new lo1((FrameLayout) b.r0(aVar), (FrameLayout) b.r0(aVar2), ModuleDescriptor.MODULE_VERSION);
    }

    @Override // s2.o1
    public final v0 X6(a aVar, g5 g5Var, String str, kb0 kb0Var, int i7) {
        Context context = (Context) b.r0(aVar);
        hy2 v7 = gu0.i(context, kb0Var, i7).v();
        v7.c(context);
        v7.b(g5Var);
        v7.W(str);
        return v7.a().a();
    }

    @Override // s2.o1
    public final th0 a5(a aVar, kb0 kb0Var, int i7) {
        Context context = (Context) b.r0(aVar);
        vz2 y7 = gu0.i(context, kb0Var, i7).y();
        y7.d(context);
        return y7.a().a();
    }

    @Override // s2.o1
    public final t2 c3(a aVar, kb0 kb0Var, int i7) {
        return gu0.i((Context) b.r0(aVar), kb0Var, i7).d();
    }

    @Override // s2.o1
    public final u20 d7(a aVar, a aVar2, a aVar3) {
        return new jo1((View) b.r0(aVar), (HashMap) b.r0(aVar2), (HashMap) b.r0(aVar3));
    }

    @Override // s2.o1
    public final ki0 e2(a aVar, String str, kb0 kb0Var, int i7) {
        Context context = (Context) b.r0(aVar);
        vz2 y7 = gu0.i(context, kb0Var, i7).y();
        y7.d(context);
        y7.v(str);
        return y7.a().b();
    }

    @Override // s2.o1
    public final v0 j6(a aVar, g5 g5Var, String str, kb0 kb0Var, int i7) {
        Context context = (Context) b.r0(aVar);
        pw2 r7 = gu0.i(context, kb0Var, i7).r();
        r7.c(context);
        r7.b(g5Var);
        r7.W(str);
        return r7.a().a();
    }

    @Override // s2.o1
    public final e70 l7(a aVar, kb0 kb0Var, int i7, b70 b70Var) {
        Context context = (Context) b.r0(aVar);
        jz1 b8 = gu0.i(context, kb0Var, i7).b();
        b8.d(context);
        b8.b(b70Var);
        return b8.a().b();
    }

    @Override // s2.o1
    public final h1 n3(a aVar, kb0 kb0Var, int i7) {
        return gu0.i((Context) b.r0(aVar), kb0Var, i7).n();
    }

    @Override // s2.o1
    public final ve0 o5(a aVar, kb0 kb0Var, int i7) {
        return gu0.i((Context) b.r0(aVar), kb0Var, i7).C();
    }

    @Override // s2.o1
    public final z1 p2(a aVar, int i7) {
        return gu0.i((Context) b.r0(aVar), null, i7).m();
    }

    @Override // s2.o1
    public final cf0 q0(a aVar) {
        Activity activity = (Activity) b.r0(aVar);
        AdOverlayInfoParcel M0 = AdOverlayInfoParcel.M0(activity.getIntent());
        if (M0 == null) {
            return new h0(activity);
        }
        int i7 = M0.A;
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? i7 != 5 ? new h0(activity) : new h(activity) : new d(activity, M0) : new k(activity) : new j(activity) : new g0(activity);
    }

    @Override // s2.o1
    public final r0 x1(a aVar, String str, kb0 kb0Var, int i7) {
        Context context = (Context) b.r0(aVar);
        return new bh2(gu0.i(context, kb0Var, i7), context, str);
    }

    @Override // s2.o1
    public final wk0 y6(a aVar, kb0 kb0Var, int i7) {
        return gu0.i((Context) b.r0(aVar), kb0Var, i7).A();
    }
}
