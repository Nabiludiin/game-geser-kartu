package com.google.android.gms.internal.drive;

import com.google.android.gms.internal.drive.l0;

final class t1 implements g1 {

    /* renamed from: a, reason: collision with root package name */
    private final i1 f20746a;

    /* renamed from: b, reason: collision with root package name */
    private final String f20747b;

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f20748c;

    /* renamed from: d, reason: collision with root package name */
    private final int f20749d;

    t1(i1 i1Var, String str, Object[] objArr) {
        this.f20746a = i1Var;
        this.f20747b = str;
        this.f20748c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f20749d = charAt;
            return;
        }
        int i7 = charAt & 8191;
        int i8 = 13;
        int i9 = 1;
        while (true) {
            int i10 = i9 + 1;
            char charAt2 = str.charAt(i9);
            if (charAt2 < 55296) {
                this.f20749d = i7 | (charAt2 << i8);
                return;
            } else {
                i7 |= (charAt2 & 8191) << i8;
                i8 += 13;
                i9 = i10;
            }
        }
    }

    @Override // com.google.android.gms.internal.drive.g1
    public final int a() {
        return (this.f20749d & 1) == 1 ? l0.c.f20649i : l0.c.f20650j;
    }

    @Override // com.google.android.gms.internal.drive.g1
    public final boolean b() {
        return (this.f20749d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.drive.g1
    public final i1 c() {
        return this.f20746a;
    }

    final String d() {
        return this.f20747b;
    }

    final Object[] e() {
        return this.f20748c;
    }
}
