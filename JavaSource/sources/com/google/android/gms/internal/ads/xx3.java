package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class xx3 extends ey3 {

    /* renamed from: v, reason: collision with root package name */
    final /* synthetic */ ex3 f19287v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    xx3(gy3 gy3Var, CharSequence charSequence, ex3 ex3Var) {
        super(gy3Var, charSequence);
        this.f19287v = ex3Var;
    }

    @Override // com.google.android.gms.internal.ads.ey3
    final int e(int i7) {
        CharSequence charSequence = this.f7876s;
        int length = charSequence.length();
        rx3.n(i7, length, "index");
        while (i7 < length) {
            if (this.f19287v.a(charSequence.charAt(i7))) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.ey3
    final int f(int i7) {
        return i7 + 1;
    }
}
