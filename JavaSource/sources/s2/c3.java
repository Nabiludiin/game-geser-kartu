package s2;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.xq;
import com.google.android.gms.internal.ads.zq;

/* compiled from: MyApplication */
public final class c3 extends xq implements e3 {
    c3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // s2.e3
    public final void c() {
        r0(1, a());
    }

    @Override // s2.e3
    public final void e() {
        r0(2, a());
    }

    @Override // s2.e3
    public final void f() {
        r0(3, a());
    }

    @Override // s2.e3
    public final void g() {
        r0(4, a());
    }

    @Override // s2.e3
    public final void z5(boolean z7) {
        Parcel a8 = a();
        int i7 = zq.f20279b;
        a8.writeInt(z7 ? 1 : 0);
        r0(5, a8);
    }
}
