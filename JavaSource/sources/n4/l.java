package n4;

import android.os.Handler;
import android.os.Looper;

/* compiled from: MyApplication */
public class l extends Handler {

    /* renamed from: a, reason: collision with root package name */
    private final Looper f25026a;

    public l(Looper looper) {
        super(looper);
        this.f25026a = Looper.getMainLooper();
    }

    public l(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.f25026a = Looper.getMainLooper();
    }
}
