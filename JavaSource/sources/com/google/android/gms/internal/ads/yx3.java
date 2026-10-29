package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;

/* compiled from: MyApplication */
final class yx3 extends ey3 {

    /* renamed from: v, reason: collision with root package name */
    final /* synthetic */ fx3 f19914v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    yx3(gy3 gy3Var, CharSequence charSequence, fx3 fx3Var) {
        super(gy3Var, charSequence);
        this.f19914v = fx3Var;
    }

    @Override // com.google.android.gms.internal.ads.ey3
    public final int e(int i7) {
        Matcher matcher = ((ix3) this.f19914v).f10257a;
        if (matcher.find(i7)) {
            return matcher.start();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.ey3
    public final int f(int i7) {
        return ((ix3) this.f19914v).f10257a.end();
    }
}
