package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class t7 implements q7 {

    /* renamed from: a, reason: collision with root package name */
    private final int f16004a;

    /* renamed from: b, reason: collision with root package name */
    private final int f16005b;

    /* renamed from: c, reason: collision with root package name */
    private final y82 f16006c;

    public t7(ro2 ro2Var, eq5 eq5Var) {
        y82 y82Var = ro2Var.f15139b;
        this.f16006c = y82Var;
        y82Var.G(12);
        int h8 = y82Var.h();
        if ("audio/raw".equals(eq5Var.f7775o)) {
            int e8 = hi2.e(eq5Var.I) * eq5Var.G;
            if (h8 == 0 || h8 % e8 != 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(e8).length() + 66 + String.valueOf(h8).length());
                sb.append("Audio sample size mismatch. stsd sample size: ");
                sb.append(e8);
                sb.append(", stsz sample size: ");
                sb.append(h8);
                gv1.c("BoxParsers", sb.toString());
                h8 = e8;
            }
        }
        this.f16004a = h8 == 0 ? -1 : h8;
        this.f16005b = y82Var.h();
    }

    @Override // com.google.android.gms.internal.ads.q7
    public final int a() {
        return this.f16005b;
    }

    @Override // com.google.android.gms.internal.ads.q7
    public final int b() {
        return this.f16004a;
    }

    @Override // com.google.android.gms.internal.ads.q7
    public final int d() {
        int i7 = this.f16004a;
        return i7 == -1 ? this.f16006c.h() : i7;
    }
}
