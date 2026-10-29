package s2;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.fj0;
import com.google.android.gms.internal.ads.hi0;
import com.google.android.gms.internal.ads.ji0;
import com.google.android.gms.internal.ads.ni0;
import com.google.android.gms.internal.ads.ri0;
import com.google.android.gms.internal.ads.si0;

/* compiled from: MyApplication */
public final class k4 extends ji0 {
    private static void k8(final ri0 ri0Var) {
        w2.p.c("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        w2.g.f27064b.post(new Runnable() { // from class: s2.j4
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                ri0 ri0Var2 = ri0.this;
                if (ri0Var2 != null) {
                    try {
                        ri0Var2.B(1);
                    } catch (RemoteException e8) {
                        w2.p.i("#007 Could not call remote method.", e8);
                    }
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ki0
    public final void I7(b5 b5Var, ri0 ri0Var) {
        k8(ri0Var);
    }

    @Override // com.google.android.gms.internal.ads.ki0
    public final void L7(b5 b5Var, ri0 ri0Var) {
        k8(ri0Var);
    }

    @Override // com.google.android.gms.internal.ads.ki0
    public final Bundle f() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.ki0
    public final String i() {
        return "";
    }

    @Override // com.google.android.gms.internal.ads.ki0
    public final boolean j() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.ki0
    public final hi0 k() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ki0
    public final long m() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.ki0
    public final y2 n() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ki0
    public final String o() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ki0
    public final void B1(ni0 ni0Var) {
    }

    @Override // com.google.android.gms.internal.ads.ki0
    public final void C0(w3.a aVar) {
    }

    @Override // com.google.android.gms.internal.ads.ki0
    public final void G6(q2 q2Var) {
    }

    @Override // com.google.android.gms.internal.ads.ki0
    public final void O5(n2 n2Var) {
    }

    @Override // com.google.android.gms.internal.ads.ki0
    public final void b7(si0 si0Var) {
    }

    @Override // com.google.android.gms.internal.ads.ki0
    public final void c7(fj0 fj0Var) {
    }

    @Override // com.google.android.gms.internal.ads.ki0
    public final void d8(boolean z7) {
    }

    @Override // com.google.android.gms.internal.ads.ki0
    public final void y5(long j7) {
    }

    @Override // com.google.android.gms.internal.ads.ki0
    public final void O7(w3.a aVar, boolean z7) {
    }
}
