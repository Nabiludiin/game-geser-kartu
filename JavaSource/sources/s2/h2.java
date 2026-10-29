package s2;

import android.os.RemoteException;

/* compiled from: MyApplication */
public final class h2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f26107a;

    /* renamed from: b, reason: collision with root package name */
    private final g2 f26108b;

    public h2(g2 g2Var) {
        String str;
        this.f26108b = g2Var;
        try {
            str = g2Var.c();
        } catch (RemoteException e8) {
            w2.p.d("", e8);
            str = null;
        }
        this.f26107a = str;
    }

    public final String toString() {
        return this.f26107a;
    }
}
