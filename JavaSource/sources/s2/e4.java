package s2;

import android.os.RemoteException;
import java.util.Objects;

/* compiled from: MyApplication */
final class e4 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ f4 f26086q;

    e4(f4 f4Var) {
        Objects.requireNonNull(f4Var);
        this.f26086q = f4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f4 f4Var = this.f26086q;
        if (f4Var.j8() != null) {
            try {
                f4Var.j8().R(1);
            } catch (RemoteException e8) {
                w2.p.g("Could not notify onAdFailedToLoad event.", e8);
            }
        }
    }
}
