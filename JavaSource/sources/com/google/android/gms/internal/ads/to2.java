package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class to2 implements wr2 {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f16273a;

    public to2(Integer num) {
        this.f16273a = num;
    }

    @Override // com.google.android.gms.internal.ads.wr2
    public /* synthetic */ void b(Object obj) {
        vr2.a(this, obj);
    }

    @Override // com.google.android.gms.internal.ads.wr2
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        Integer num = this.f16273a;
        x81 x81Var = (x81) obj;
        if (num != null) {
            x81Var.f18664a.putInt("dspct", Math.min(num.intValue(), 20));
        }
    }
}
