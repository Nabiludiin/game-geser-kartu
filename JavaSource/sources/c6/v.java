package c6;

import android.net.NetworkInfo;
import c6.e0;
import c6.t;
import com.google.android.gms.internal.ads.xl0;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: MyApplication */
class v extends ThreadPoolExecutor implements AutoCloseable {

    /* compiled from: MyApplication */
    private static final class a extends FutureTask implements Comparable {

        /* renamed from: q, reason: collision with root package name */
        private final c f3714q;

        public a(c cVar) {
            super(cVar, null);
            this.f3714q = cVar;
        }

        @Override // java.lang.Comparable
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            t.f p7 = this.f3714q.p();
            t.f p8 = aVar.f3714q.p();
            return p7 == p8 ? this.f3714q.f3588q - aVar.f3714q.f3588q : p8.ordinal() - p7.ordinal();
        }
    }

    v() {
        super(3, 3, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new e0.f());
    }

    private void e(int i7) {
        setCorePoolSize(i7);
        setMaximumPoolSize(i7);
    }

    void c(NetworkInfo networkInfo) {
        if (networkInfo == null || !networkInfo.isConnectedOrConnecting()) {
            e(3);
            return;
        }
        int type = networkInfo.getType();
        if (type != 0) {
            if (type == 1 || type == 6 || type == 9) {
                e(4);
                return;
            } else {
                e(3);
                return;
            }
        }
        int subtype = networkInfo.getSubtype();
        switch (subtype) {
            case 1:
            case 2:
                e(1);
                return;
            case 3:
            case 4:
            case 5:
            case 6:
                break;
            default:
                switch (subtype) {
                    case 12:
                        break;
                    case 13:
                    case 14:
                    case 15:
                        e(3);
                        break;
                    default:
                        e(3);
                        break;
                }
                return;
        }
        e(2);
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        xl0.a(this);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable) {
        a aVar = new a((c) runnable);
        execute(aVar);
        return aVar;
    }
}
