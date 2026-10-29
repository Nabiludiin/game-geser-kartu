package o4;

import android.os.Handler;
import android.os.Looper;

/* compiled from: MyApplication */
public class f extends Handler {

    /* renamed from: a, reason: collision with root package name */
    private final Looper f25065a;

    public f(Looper looper) {
        super(looper);
        this.f25065a = Looper.getMainLooper();
    }

    public f(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.f25065a = Looper.getMainLooper();
    }
}
