package s2;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.a80;
import com.google.android.gms.internal.ads.kb0;
import java.util.Collections;
import java.util.List;

/* compiled from: MyApplication */
public final class h4 extends y1 {

    /* renamed from: q, reason: collision with root package name */
    private a80 f26124q;

    @Override // s2.z1
    public final void L5(a80 a80Var) {
        this.f26124q = a80Var;
    }

    final /* synthetic */ void b() {
        a80 a80Var = this.f26124q;
        if (a80Var != null) {
            try {
                a80Var.m6(Collections.EMPTY_LIST);
            } catch (RemoteException e8) {
                w2.p.g("Could not notify onComplete event.", e8);
            }
        }
    }

    @Override // s2.z1
    public final void c() {
        w2.p.c("The initialization is not processed because MobileAdsSettingsManager is not created successfully.");
        w2.g.f27064b.post(new Runnable() { // from class: s2.g4
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                h4.this.b();
            }
        });
    }

    @Override // s2.z1
    public final boolean k() {
        return false;
    }

    @Override // s2.z1
    public final float l() {
        return 1.0f;
    }

    @Override // s2.z1
    public final List m() {
        return Collections.EMPTY_LIST;
    }

    @Override // s2.z1
    public final String n() {
        return "";
    }

    @Override // s2.z1
    public final void p() {
    }

    @Override // s2.z1
    public final void H0(String str) {
    }

    @Override // s2.z1
    public final void S2(float f8) {
    }

    @Override // s2.z1
    public final void a0(String str) {
    }

    @Override // s2.z1
    public final void c8(k2 k2Var) {
    }

    @Override // s2.z1
    public final void i0(String str) {
    }

    @Override // s2.z1
    public final void m7(o4 o4Var) {
    }

    @Override // s2.z1
    public final void o0(boolean z7) {
    }

    @Override // s2.z1
    public final void o1(boolean z7) {
    }

    @Override // s2.z1
    public final void r2(kb0 kb0Var) {
    }

    @Override // s2.z1
    public final void b5(String str, w3.a aVar) {
    }

    @Override // s2.z1
    public final void g1(w3.a aVar, String str) {
    }
}
