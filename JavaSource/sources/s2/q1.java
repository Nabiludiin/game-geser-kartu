package s2;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.xq;
import com.google.android.gms.internal.ads.zq;

/* compiled from: MyApplication */
public final class q1 extends xq implements s1 {
    q1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    @Override // s2.s1
    public final void c() {
        r0(4, a());
    }

    @Override // s2.s1
    public final void d() {
        r0(2, a());
    }

    @Override // s2.s1
    public final void e() {
        r0(5, a());
    }

    @Override // s2.s1
    public final void h() {
        r0(3, a());
    }

    @Override // s2.s1
    public final void p5(x2 x2Var) {
        Parcel a8 = a();
        zq.c(a8, x2Var);
        r0(1, a8);
    }
}
