package s2;

import android.os.RemoteException;
import java.util.Objects;

/* compiled from: MyApplication */
final class b4 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ c4 f26055q;

    b4(c4 c4Var) {
        Objects.requireNonNull(c4Var);
        this.f26055q = c4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d4 d4Var = this.f26055q.f26068q;
        if (d4Var.k8() != null) {
            try {
                d4Var.k8().R(1);
            } catch (RemoteException e8) {
                w2.p.g("Could not notify onAdFailedToLoad event.", e8);
            }
        }
    }
}
