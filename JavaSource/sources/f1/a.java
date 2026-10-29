package f1;

import android.os.Handler;
import android.os.Looper;
import e1.q;

/* compiled from: MyApplication */
public class a implements q {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f23574a = androidx.core.os.f.a(Looper.getMainLooper());

    @Override // e1.q
    public void a(long j7, Runnable runnable) {
        this.f23574a.postDelayed(runnable, j7);
    }

    @Override // e1.q
    public void b(Runnable runnable) {
        this.f23574a.removeCallbacks(runnable);
    }
}
