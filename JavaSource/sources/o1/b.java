package o1;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import n1.k;

/* compiled from: MyApplication */
public class b implements o1.a {

    /* renamed from: a, reason: collision with root package name */
    private final k f25044a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f25045b = new Handler(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    private final Executor f25046c = new a();

    /* compiled from: MyApplication */
    class a implements Executor {
        a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            b.this.d(runnable);
        }
    }

    public b(Executor executor) {
        this.f25044a = new k(executor);
    }

    @Override // o1.a
    public Executor a() {
        return this.f25046c;
    }

    @Override // o1.a
    public void b(Runnable runnable) {
        this.f25044a.execute(runnable);
    }

    @Override // o1.a
    public k c() {
        return this.f25044a;
    }

    public void d(Runnable runnable) {
        this.f25045b.post(runnable);
    }
}
