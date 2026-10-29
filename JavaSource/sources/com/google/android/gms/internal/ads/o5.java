package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: MyApplication */
public final class o5 implements ld {

    /* renamed from: a, reason: collision with root package name */
    public final String f13191a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13192b;

    /* renamed from: c, reason: collision with root package name */
    public final long f13193c;

    /* renamed from: d, reason: collision with root package name */
    public final long f13194d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f13195e;

    /* renamed from: f, reason: collision with root package name */
    private int f13196f;

    static {
        xn5 xn5Var = new xn5();
        xn5Var.l0("application/id3");
        xn5Var.m();
        xn5 xn5Var2 = new xn5();
        xn5Var2.l0("application/x-scte35");
        xn5Var2.m();
    }

    public o5(String str, String str2, long j7, long j8, byte[] bArr) {
        this.f13191a = str;
        this.f13192b = str2;
        this.f13193c = j7;
        this.f13194d = j8;
        this.f13195e = bArr;
    }

    @Override // com.google.android.gms.internal.ads.ld
    public /* synthetic */ void a(lb lbVar) {
        kd.a(this, lbVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o5.class == obj.getClass()) {
            o5 o5Var = (o5) obj;
            if (this.f13193c == o5Var.f13193c && this.f13194d == o5Var.f13194d && Objects.equals(this.f13191a, o5Var.f13191a) && Objects.equals(this.f13192b, o5Var.f13192b) && Arrays.equals(this.f13195e, o5Var.f13195e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.f13196f;
        if (i7 != 0) {
            return i7;
        }
        int hashCode = ((this.f13191a.hashCode() + 527) * 31) + this.f13192b.hashCode();
        long j7 = this.f13193c;
        int hashCode2 = (((((hashCode * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + ((int) this.f13194d)) * 31) + Arrays.hashCode(this.f13195e);
        this.f13196f = hashCode2;
        return hashCode2;
    }

    public final String toString() {
        long j7 = this.f13194d;
        int length = String.valueOf(j7).length();
        long j8 = this.f13193c;
        int length2 = String.valueOf(j8).length();
        String str = this.f13191a;
        int length3 = str.length() + 18 + length + 13 + length2;
        String str2 = this.f13192b;
        StringBuilder sb = new StringBuilder(length3 + 8 + str2.length());
        sb.append("EMSG: scheme=");
        sb.append(str);
        sb.append(", id=");
        sb.append(j7);
        sb.append(", durationMs=");
        sb.append(j8);
        sb.append(", value=");
        sb.append(str2);
        return sb.toString();
    }
}
