package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.Objects;

/* compiled from: MyApplication */
final class p2 extends f3 {

    /* renamed from: u, reason: collision with root package name */
    final /* synthetic */ Context f21219u;

    /* renamed from: v, reason: collision with root package name */
    final /* synthetic */ Bundle f21220v;

    /* renamed from: w, reason: collision with root package name */
    final /* synthetic */ p3 f21221w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p2(p3 p3Var, Context context, Bundle bundle) {
        super(p3Var, true);
        this.f21219u = context;
        this.f21220v = bundle;
        Objects.requireNonNull(p3Var);
        this.f21221w = p3Var;
    }

    @Override // com.google.android.gms.internal.measurement.f3
    public final void a() {
        try {
            Context context = this.f21219u;
            p3.o.m(context);
            String a8 = t4.o.a(context);
            p3.o.m(context);
            Resources resources = context.getResources();
            if (TextUtils.isEmpty(a8)) {
                a8 = t4.o.a(context);
            }
            Boolean c8 = t4.o.c("google_analytics_force_disable_updates", resources, a8);
            p3 p3Var = this.f21221w;
            p3Var.k(p3Var.q(context, c8 == null || !c8.booleanValue()));
            if (p3Var.j() == null) {
                Log.w(p3Var.h(), "Failed to connect to measurement client.");
                return;
            }
            int a9 = DynamiteModule.a(context, ModuleDescriptor.MODULE_ID);
            ((v1) p3.o.m(p3Var.j())).initialize(w3.b.C1(context), new h2(133005L, Math.max(a9, r0), Boolean.TRUE.equals(c8) || DynamiteModule.c(context, ModuleDescriptor.MODULE_ID) < a9, this.f21220v, t4.o.a(context)), this.f20938q);
        } catch (Exception e8) {
            this.f21221w.g(e8, true, false);
        }
    }
}
