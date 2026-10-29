package p3;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import p3.j;

/* compiled from: MyApplication */
public class f extends q3.a {
    public static final Parcelable.Creator<f> CREATOR = new i1();
    static final Scope[] E = new Scope[0];
    static final k3.d[] F = new k3.d[0];
    final boolean A;
    final int B;
    boolean C;
    private final String D;

    /* renamed from: q, reason: collision with root package name */
    final int f25174q;

    /* renamed from: r, reason: collision with root package name */
    final int f25175r;

    /* renamed from: s, reason: collision with root package name */
    final int f25176s;

    /* renamed from: t, reason: collision with root package name */
    String f25177t;

    /* renamed from: u, reason: collision with root package name */
    IBinder f25178u;

    /* renamed from: v, reason: collision with root package name */
    Scope[] f25179v;

    /* renamed from: w, reason: collision with root package name */
    Bundle f25180w;

    /* renamed from: x, reason: collision with root package name */
    Account f25181x;

    /* renamed from: y, reason: collision with root package name */
    k3.d[] f25182y;

    /* renamed from: z, reason: collision with root package name */
    k3.d[] f25183z;

    f(int i7, int i8, int i9, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, k3.d[] dVarArr, k3.d[] dVarArr2, boolean z7, int i10, boolean z8, String str2) {
        scopeArr = scopeArr == null ? E : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        dVarArr = dVarArr == null ? F : dVarArr;
        dVarArr2 = dVarArr2 == null ? F : dVarArr2;
        this.f25174q = i7;
        this.f25175r = i8;
        this.f25176s = i9;
        if ("com.google.android.gms".equals(str)) {
            this.f25177t = "com.google.android.gms";
        } else {
            this.f25177t = str;
        }
        if (i7 < 2) {
            this.f25181x = iBinder != null ? a.r0(j.a.O(iBinder)) : null;
        } else {
            this.f25178u = iBinder;
            this.f25181x = account;
        }
        this.f25179v = scopeArr;
        this.f25180w = bundle;
        this.f25182y = dVarArr;
        this.f25183z = dVarArr2;
        this.A = z7;
        this.B = i10;
        this.C = z8;
        this.D = str2;
    }

    public String M0() {
        return this.D;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        i1.a(this, parcel, i7);
    }
}
