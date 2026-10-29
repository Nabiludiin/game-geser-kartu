package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Objects;

/* compiled from: MyApplication */
public final class yx {

    /* renamed from: o, reason: collision with root package name */
    public static final Object f19894o = new Object();

    /* renamed from: p, reason: collision with root package name */
    private static final j9 f19895p;

    /* renamed from: b, reason: collision with root package name */
    public Object f19897b;

    /* renamed from: d, reason: collision with root package name */
    public long f19899d;

    /* renamed from: e, reason: collision with root package name */
    public long f19900e;

    /* renamed from: f, reason: collision with root package name */
    public long f19901f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f19902g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f19903h;

    /* renamed from: i, reason: collision with root package name */
    public n4 f19904i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f19905j;

    /* renamed from: k, reason: collision with root package name */
    public long f19906k;

    /* renamed from: l, reason: collision with root package name */
    public long f19907l;

    /* renamed from: m, reason: collision with root package name */
    public int f19908m;

    /* renamed from: n, reason: collision with root package name */
    public int f19909n;

    /* renamed from: a, reason: collision with root package name */
    public Object f19896a = f19894o;

    /* renamed from: c, reason: collision with root package name */
    public j9 f19898c = f19895p;

    static {
        pu5 pu5Var = new pu5();
        pu5Var.a("androidx.media3.common.Timeline");
        pu5Var.b(Uri.EMPTY);
        f19895p = pu5Var.c();
        String str = hi2.f9535a;
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
    }

    public final yx a(Object obj, j9 j9Var, Object obj2, long j7, long j8, long j9, boolean z7, boolean z8, n4 n4Var, long j10, long j11, int i7, int i8, long j12) {
        this.f19896a = obj;
        if (j9Var == null) {
            j9Var = f19895p;
        }
        this.f19898c = j9Var;
        this.f19897b = null;
        this.f19899d = -9223372036854775807L;
        this.f19900e = -9223372036854775807L;
        this.f19901f = -9223372036854775807L;
        this.f19902g = z7;
        this.f19903h = z8;
        this.f19904i = n4Var;
        this.f19906k = 0L;
        this.f19907l = j11;
        this.f19908m = 0;
        this.f19909n = 0;
        this.f19905j = false;
        return this;
    }

    public final boolean b() {
        return this.f19904i != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && yx.class.equals(obj.getClass())) {
            yx yxVar = (yx) obj;
            if (Objects.equals(this.f19896a, yxVar.f19896a) && Objects.equals(this.f19898c, yxVar.f19898c) && Objects.equals(this.f19904i, yxVar.f19904i) && this.f19899d == yxVar.f19899d && this.f19900e == yxVar.f19900e && this.f19901f == yxVar.f19901f && this.f19902g == yxVar.f19902g && this.f19903h == yxVar.f19903h && this.f19905j == yxVar.f19905j && this.f19907l == yxVar.f19907l && this.f19908m == yxVar.f19908m && this.f19909n == yxVar.f19909n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((this.f19896a.hashCode() + 217) * 31) + this.f19898c.hashCode();
        n4 n4Var = this.f19904i;
        int hashCode2 = ((hashCode * 961) + (n4Var == null ? 0 : n4Var.hashCode())) * 31;
        long j7 = this.f19899d;
        int i7 = (hashCode2 + ((int) (j7 ^ (j7 >>> 32)))) * 31;
        long j8 = this.f19900e;
        int i8 = (i7 + ((int) (j8 ^ (j8 >>> 32)))) * 31;
        long j9 = this.f19901f;
        int i9 = ((((((i8 + ((int) (j9 ^ (j9 >>> 32)))) * 31) + (this.f19902g ? 1 : 0)) * 31) + (this.f19903h ? 1 : 0)) * 31) + (this.f19905j ? 1 : 0);
        long j10 = this.f19907l;
        return ((((((i9 * 961) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.f19908m) * 31) + this.f19909n) * 31;
    }
}
