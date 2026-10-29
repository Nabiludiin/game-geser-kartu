package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: MyApplication */
final class p32 implements m64 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ t32 f13647a;

    p32(t32 t32Var) {
        Objects.requireNonNull(t32Var);
        this.f13647a = t32Var;
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final void a(Throwable th) {
        Pattern pattern;
        if (((Boolean) s2.b0.c().d(uy.L6)).booleanValue()) {
            String message = th.getMessage();
            pattern = t32.f15957h;
            Matcher matcher = pattern.matcher(message);
            if (matcher.matches()) {
                String group = matcher.group(1);
                t32 t32Var = this.f13647a;
                t32Var.c().c(Integer.parseInt(group));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        o03 o03Var = (o03) obj;
        if (((Boolean) s2.b0.c().d(uy.L6)).booleanValue()) {
            t32 t32Var = this.f13647a;
            f03 f03Var = o03Var.f13137b.f12530b;
            t32Var.c().c(f03Var.f7930f);
            t32Var.c().e(f03Var.f7931g);
        }
    }
}
