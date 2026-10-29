package g5;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public enum j implements Executor {
    INSTANCE;


    /* renamed from: r, reason: collision with root package name */
    private static final Handler f24040r = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        f24040r.post(runnable);
    }
}
