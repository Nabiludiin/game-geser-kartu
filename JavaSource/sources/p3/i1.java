package p3;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;

/* compiled from: MyApplication */
public final class i1 implements Parcelable.Creator {
    static void a(f fVar, Parcel parcel, int i7) {
        int a8 = q3.c.a(parcel);
        q3.c.l(parcel, 1, fVar.f25174q);
        q3.c.l(parcel, 2, fVar.f25175r);
        q3.c.l(parcel, 3, fVar.f25176s);
        q3.c.r(parcel, 4, fVar.f25177t, false);
        q3.c.k(parcel, 5, fVar.f25178u, false);
        q3.c.u(parcel, 6, fVar.f25179v, i7, false);
        q3.c.f(parcel, 7, fVar.f25180w, false);
        q3.c.q(parcel, 8, fVar.f25181x, i7, false);
        q3.c.u(parcel, 10, fVar.f25182y, i7, false);
        q3.c.u(parcel, 11, fVar.f25183z, i7, false);
        q3.c.c(parcel, 12, fVar.A);
        q3.c.l(parcel, 13, fVar.B);
        q3.c.c(parcel, 14, fVar.C);
        q3.c.r(parcel, 15, fVar.M0(), false);
        q3.c.b(parcel, a8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z7 = q3.b.z(parcel);
        Scope[] scopeArr = f.E;
        Bundle bundle = new Bundle();
        k3.d[] dVarArr = f.F;
        k3.d[] dVarArr2 = dVarArr;
        String str = null;
        IBinder iBinder = null;
        Account account = null;
        String str2 = null;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        boolean z8 = false;
        int i10 = 0;
        boolean z9 = false;
        while (parcel.dataPosition() < z7) {
            int s7 = q3.b.s(parcel);
            switch (q3.b.m(s7)) {
                case 1:
                    i7 = q3.b.u(parcel, s7);
                    break;
                case 2:
                    i8 = q3.b.u(parcel, s7);
                    break;
                case 3:
                    i9 = q3.b.u(parcel, s7);
                    break;
                case 4:
                    str = q3.b.g(parcel, s7);
                    break;
                case 5:
                    iBinder = q3.b.t(parcel, s7);
                    break;
                case 6:
                    scopeArr = (Scope[]) q3.b.j(parcel, s7, Scope.CREATOR);
                    break;
                case 7:
                    bundle = q3.b.b(parcel, s7);
                    break;
                case 8:
                    account = (Account) q3.b.f(parcel, s7, Account.CREATOR);
                    break;
                case 9:
                default:
                    q3.b.y(parcel, s7);
                    break;
                case 10:
                    dVarArr = (k3.d[]) q3.b.j(parcel, s7, k3.d.CREATOR);
                    break;
                case 11:
                    dVarArr2 = (k3.d[]) q3.b.j(parcel, s7, k3.d.CREATOR);
                    break;
                case 12:
                    z8 = q3.b.n(parcel, s7);
                    break;
                case 13:
                    i10 = q3.b.u(parcel, s7);
                    break;
                case 14:
                    z9 = q3.b.n(parcel, s7);
                    break;
                case 15:
                    str2 = q3.b.g(parcel, s7);
                    break;
            }
        }
        q3.b.l(parcel, z7);
        return new f(i7, i8, i9, str, iBinder, scopeArr, bundle, account, dVarArr, dVarArr2, z8, i10, z9, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new f[i7];
    }
}
