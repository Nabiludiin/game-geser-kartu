package v2;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.ads.of3;

/* compiled from: MyApplication */
public final class o1 extends of3 {
    public o1(Looper looper) {
        super(looper);
    }

    @Override // com.google.android.gms.internal.ads.of3
    protected final void a(Message message) {
        try {
            super.a(message);
        } catch (Throwable th) {
            r2.t.g();
            f2.q(r2.t.l().r(), th);
            throw th;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e8) {
            r2.t.l().i(e8, "AdMobHandler.handleMessage");
        }
    }
}
