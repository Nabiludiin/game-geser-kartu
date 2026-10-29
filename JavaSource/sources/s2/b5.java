package s2;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MyApplication */
public final class b5 extends q3.a {
    public static final Parcelable.Creator<b5> CREATOR = new d5();
    public final Location A;
    public final String B;
    public final Bundle C;
    public final Bundle D;
    public final List E;
    public final String F;
    public final String G;
    public final boolean H;
    public final y0 I;
    public final int J;
    public final String K;
    public final List L;
    public final int M;
    public final String N;
    public final int O;
    public final long P;
    public final long Q;
    public final Bundle R = new Bundle();

    /* renamed from: q, reason: collision with root package name */
    public final int f26056q;

    /* renamed from: r, reason: collision with root package name */
    public final long f26057r;

    /* renamed from: s, reason: collision with root package name */
    public final Bundle f26058s;

    /* renamed from: t, reason: collision with root package name */
    public final int f26059t;

    /* renamed from: u, reason: collision with root package name */
    public final List f26060u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f26061v;

    /* renamed from: w, reason: collision with root package name */
    public final int f26062w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f26063x;

    /* renamed from: y, reason: collision with root package name */
    public final String f26064y;

    /* renamed from: z, reason: collision with root package name */
    public final q4 f26065z;

    public b5(int i7, long j7, Bundle bundle, int i8, List list, boolean z7, int i9, boolean z8, String str, q4 q4Var, Location location, String str2, Bundle bundle2, Bundle bundle3, List list2, String str3, String str4, boolean z9, y0 y0Var, int i10, String str5, List list3, int i11, String str6, int i12, long j8, long j9) {
        this.f26056q = i7;
        this.f26057r = j7;
        this.f26058s = bundle == null ? new Bundle() : bundle;
        this.f26059t = i8;
        this.f26060u = list;
        this.f26061v = z7;
        this.f26062w = i9;
        this.f26063x = z8;
        this.f26064y = str;
        this.f26065z = q4Var;
        this.A = location;
        this.B = str2;
        this.C = bundle2 == null ? new Bundle() : bundle2;
        this.D = bundle3;
        this.E = list2;
        this.F = str3;
        this.G = str4;
        this.H = z9;
        this.I = y0Var;
        this.J = i10;
        this.K = str5;
        this.L = list3 == null ? new ArrayList() : list3;
        this.M = i11;
        this.N = str6;
        this.O = i12;
        this.P = j8;
        this.Q = j9;
    }

    public final boolean M0(Object obj) {
        if (!(obj instanceof b5)) {
            return false;
        }
        b5 b5Var = (b5) obj;
        return this.f26056q == b5Var.f26056q && this.f26057r == b5Var.f26057r && w2.q.a(this.f26058s, b5Var.f26058s) && this.f26059t == b5Var.f26059t && p3.n.a(this.f26060u, b5Var.f26060u) && this.f26061v == b5Var.f26061v && this.f26062w == b5Var.f26062w && this.f26063x == b5Var.f26063x && p3.n.a(this.f26064y, b5Var.f26064y) && p3.n.a(this.f26065z, b5Var.f26065z) && p3.n.a(this.A, b5Var.A) && p3.n.a(this.B, b5Var.B) && w2.q.a(this.C, b5Var.C) && w2.q.a(this.D, b5Var.D) && p3.n.a(this.E, b5Var.E) && p3.n.a(this.F, b5Var.F) && p3.n.a(this.G, b5Var.G) && this.H == b5Var.H && this.J == b5Var.J && p3.n.a(this.K, b5Var.K) && p3.n.a(this.L, b5Var.L) && this.M == b5Var.M && p3.n.a(this.N, b5Var.N) && this.O == b5Var.O;
    }

    public final boolean b() {
        return d() || h();
    }

    public final boolean d() {
        return this.f26058s.getBoolean("is_sdk_preload", false);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b5) {
            return M0(obj) && this.P == ((b5) obj).P;
        }
        return false;
    }

    public final boolean h() {
        return this.f26058s.getBoolean("zenith_v2", false);
    }

    public final int hashCode() {
        return p3.n.b(Integer.valueOf(this.f26056q), Long.valueOf(this.f26057r), this.f26058s, Integer.valueOf(this.f26059t), this.f26060u, Boolean.valueOf(this.f26061v), Integer.valueOf(this.f26062w), Boolean.valueOf(this.f26063x), this.f26064y, this.f26065z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, Boolean.valueOf(this.H), Integer.valueOf(this.J), this.K, this.L, Integer.valueOf(this.M), this.N, Integer.valueOf(this.O), Long.valueOf(this.P), Long.valueOf(this.Q));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.f26056q;
        int a8 = q3.c.a(parcel);
        q3.c.l(parcel, 1, i8);
        q3.c.o(parcel, 2, this.f26057r);
        q3.c.f(parcel, 3, this.f26058s, false);
        q3.c.l(parcel, 4, this.f26059t);
        q3.c.t(parcel, 5, this.f26060u, false);
        q3.c.c(parcel, 6, this.f26061v);
        q3.c.l(parcel, 7, this.f26062w);
        q3.c.c(parcel, 8, this.f26063x);
        q3.c.r(parcel, 9, this.f26064y, false);
        q3.c.q(parcel, 10, this.f26065z, i7, false);
        q3.c.q(parcel, 11, this.A, i7, false);
        q3.c.r(parcel, 12, this.B, false);
        q3.c.f(parcel, 13, this.C, false);
        q3.c.f(parcel, 14, this.D, false);
        q3.c.t(parcel, 15, this.E, false);
        q3.c.r(parcel, 16, this.F, false);
        q3.c.r(parcel, 17, this.G, false);
        q3.c.c(parcel, 18, this.H);
        q3.c.q(parcel, 19, this.I, i7, false);
        q3.c.l(parcel, 20, this.J);
        q3.c.r(parcel, 21, this.K, false);
        q3.c.t(parcel, 22, this.L, false);
        q3.c.l(parcel, 23, this.M);
        q3.c.r(parcel, 24, this.N, false);
        q3.c.l(parcel, 25, this.O);
        q3.c.o(parcel, 26, this.P);
        q3.c.o(parcel, 27, this.Q);
        q3.c.b(parcel, a8);
    }
}
