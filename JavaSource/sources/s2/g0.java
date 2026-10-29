package s2;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.xq;
import com.google.android.gms.internal.ads.zq;

/* compiled from: MyApplication */
public final class g0 extends xq implements i0 {
    g0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // s2.i0
    public final void R(int i7) {
        Parcel a8 = a();
        a8.writeInt(i7);
        r0(2, a8);
    }

    @Override // s2.i0
    public final void b() {
        r0(1, a());
    }

    @Override // s2.i0
    public final void c() {
        r0(3, a());
    }

    @Override // s2.i0
    public final void e() {
        r0(4, a());
    }

    @Override // s2.i0
    public final void f() {
        r0(5, a());
    }

    @Override // s2.i0
    public final void g() {
        r0(6, a());
    }

    @Override // s2.i0
    public final void i() {
        r0(7, a());
    }

    @Override // s2.i0
    public final void j() {
        r0(9, a());
    }

    @Override // s2.i0
    public final void u0(x2 x2Var) {
        Parcel a8 = a();
        zq.c(a8, x2Var);
        r0(8, a8);
    }
}
