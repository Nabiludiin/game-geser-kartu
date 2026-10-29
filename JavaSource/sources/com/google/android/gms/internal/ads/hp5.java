package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: MyApplication */
public final class hp5 implements sr5 {

    /* renamed from: q, reason: collision with root package name */
    private final w04 f9613q;

    /* renamed from: r, reason: collision with root package name */
    private long f9614r;

    public hp5(List list, List list2) {
        int i7 = w04.f17978s;
        t04 t04Var = new t04();
        rx3.a(list.size() == list2.size());
        for (int i8 = 0; i8 < list.size(); i8++) {
            t04Var.g(new gp5((sr5) list.get(i8), (List) list2.get(i8)));
        }
        this.f9613q = t04Var.j();
        this.f9614r = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.sr5
    public final boolean a(mb5 mb5Var) {
        boolean z7;
        boolean z8 = false;
        do {
            long k7 = k();
            if (k7 == Long.MIN_VALUE) {
                break;
            }
            int i7 = 0;
            z7 = false;
            while (true) {
                w04 w04Var = this.f9613q;
                if (i7 >= w04Var.size()) {
                    break;
                }
                long k8 = ((gp5) w04Var.get(i7)).k();
                boolean z9 = k8 != Long.MIN_VALUE && k8 <= mb5Var.f12175a;
                if (k8 == k7 || z9) {
                    z7 |= ((gp5) w04Var.get(i7)).a(mb5Var);
                }
                i7++;
            }
            z8 |= z7;
        } while (z7);
        return z8;
    }

    @Override // com.google.android.gms.internal.ads.sr5
    public final void b(long j7) {
        int i7 = 0;
        while (true) {
            w04 w04Var = this.f9613q;
            if (i7 >= w04Var.size()) {
                return;
            }
            ((gp5) w04Var.get(i7)).b(j7);
            i7++;
        }
    }

    @Override // com.google.android.gms.internal.ads.sr5
    public final long j() {
        int i7 = 0;
        long j7 = Long.MAX_VALUE;
        long j8 = Long.MAX_VALUE;
        while (true) {
            w04 w04Var = this.f9613q;
            if (i7 >= w04Var.size()) {
                break;
            }
            gp5 gp5Var = (gp5) w04Var.get(i7);
            long j9 = gp5Var.j();
            if ((gp5Var.c().contains(1) || gp5Var.c().contains(2) || gp5Var.c().contains(4)) && j9 != Long.MIN_VALUE) {
                j7 = Math.min(j7, j9);
            }
            if (j9 != Long.MIN_VALUE) {
                j8 = Math.min(j8, j9);
            }
            i7++;
        }
        if (j7 != Long.MAX_VALUE) {
            this.f9614r = j7;
            return j7;
        }
        if (j8 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j10 = this.f9614r;
        return j10 != -9223372036854775807L ? j10 : j8;
    }

    @Override // com.google.android.gms.internal.ads.sr5
    public final long k() {
        int i7 = 0;
        long j7 = Long.MAX_VALUE;
        while (true) {
            w04 w04Var = this.f9613q;
            if (i7 >= w04Var.size()) {
                break;
            }
            long k7 = ((gp5) w04Var.get(i7)).k();
            if (k7 != Long.MIN_VALUE) {
                j7 = Math.min(j7, k7);
            }
            i7++;
        }
        if (j7 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j7;
    }

    @Override // com.google.android.gms.internal.ads.sr5
    public final boolean o() {
        int i7 = 0;
        while (true) {
            w04 w04Var = this.f9613q;
            if (i7 >= w04Var.size()) {
                return false;
            }
            if (((gp5) w04Var.get(i7)).o()) {
                return true;
            }
            i7++;
        }
    }
}
