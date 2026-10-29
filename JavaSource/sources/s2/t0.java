package s2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.et;
import com.google.android.gms.internal.ads.xq;
import com.google.android.gms.internal.ads.zq;
import w3.a;

/* compiled from: MyApplication */
public final class t0 extends xq implements v0 {
    t0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override // s2.v0
    public final void A6(u4 u4Var) {
        Parcel a8 = a();
        zq.c(a8, u4Var);
        r0(29, a8);
    }

    @Override // s2.v0
    public final b3 D() {
        b3 z2Var;
        Parcel O = O(26, a());
        IBinder readStrongBinder = O.readStrongBinder();
        if (readStrongBinder == null) {
            z2Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            z2Var = queryLocalInterface instanceof b3 ? (b3) queryLocalInterface : new z2(readStrongBinder);
        }
        O.recycle();
        return z2Var;
    }

    @Override // s2.v0
    public final void L4(i0 i0Var) {
        Parcel a8 = a();
        zq.e(a8, i0Var);
        r0(7, a8);
    }

    @Override // s2.v0
    public final void N3(q2 q2Var) {
        Parcel a8 = a();
        zq.e(a8, q2Var);
        r0(42, a8);
    }

    @Override // s2.v0
    public final void O1(s1 s1Var) {
        Parcel a8 = a();
        zq.e(a8, s1Var);
        r0(45, a8);
    }

    @Override // s2.v0
    public final boolean U0(b5 b5Var) {
        Parcel a8 = a();
        zq.c(a8, b5Var);
        Parcel O = O(4, a8);
        boolean a9 = zq.a(O);
        O.recycle();
        return a9;
    }

    @Override // s2.v0
    public final void W1(w3.a aVar) {
        Parcel a8 = a();
        zq.e(a8, aVar);
        r0(44, a8);
    }

    @Override // s2.v0
    public final void X4(g5 g5Var) {
        Parcel a8 = a();
        zq.c(a8, g5Var);
        r0(13, a8);
    }

    @Override // s2.v0
    public final w3.a b() {
        Parcel O = O(1, a());
        w3.a O2 = a.AbstractBinderC0140a.O(O.readStrongBinder());
        O.recycle();
        return O2;
    }

    @Override // s2.v0
    public final void d() {
        r0(2, a());
    }

    @Override // s2.v0
    public final void e() {
        r0(5, a());
    }

    @Override // s2.v0
    public final void f() {
        r0(6, a());
    }

    @Override // s2.v0
    public final void g3(f0 f0Var) {
        Parcel a8 = a();
        zq.e(a8, f0Var);
        r0(20, a8);
    }

    @Override // s2.v0
    public final void j3(et etVar) {
        Parcel a8 = a();
        zq.e(a8, etVar);
        r0(40, a8);
    }

    @Override // s2.v0
    public final long k0() {
        Parcel O = O(47, a());
        long readLong = O.readLong();
        O.recycle();
        return readLong;
    }

    @Override // s2.v0
    public final void m2(long j7) {
        Parcel a8 = a();
        a8.writeLong(j7);
        r0(48, a8);
    }

    @Override // s2.v0
    public final g5 o() {
        Parcel O = O(12, a());
        g5 g5Var = (g5) zq.b(O, g5.CREATOR);
        O.recycle();
        return g5Var;
    }

    @Override // s2.v0
    public final void p3(b5 b5Var, l0 l0Var) {
        Parcel a8 = a();
        zq.c(a8, b5Var);
        zq.e(a8, l0Var);
        r0(43, a8);
    }

    @Override // s2.v0
    public final y2 r() {
        y2 v2Var;
        Parcel O = O(41, a());
        IBinder readStrongBinder = O.readStrongBinder();
        if (readStrongBinder == null) {
            v2Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            v2Var = queryLocalInterface instanceof y2 ? (y2) queryLocalInterface : new v2(readStrongBinder);
        }
        O.recycle();
        return v2Var;
    }

    @Override // s2.v0
    public final String t() {
        Parcel O = O(31, a());
        String readString = O.readString();
        O.recycle();
        return readString;
    }

    @Override // s2.v0
    public final void v2(l1 l1Var) {
        Parcel a8 = a();
        zq.e(a8, l1Var);
        r0(8, a8);
    }

    @Override // s2.v0
    public final void x5(boolean z7) {
        Parcel a8 = a();
        int i7 = zq.f20279b;
        a8.writeInt(z7 ? 1 : 0);
        r0(22, a8);
    }

    @Override // s2.v0
    public final void z0(boolean z7) {
        Parcel a8 = a();
        int i7 = zq.f20279b;
        a8.writeInt(z7 ? 1 : 0);
        r0(34, a8);
    }
}
