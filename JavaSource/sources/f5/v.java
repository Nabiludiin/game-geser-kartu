package f5;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
class v implements m5.d, m5.c {

    /* renamed from: a, reason: collision with root package name */
    private final Map f23783a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private Queue f23784b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    private final Executor f23785c;

    v(Executor executor) {
        this.f23785c = executor;
    }

    private synchronized Set d(m5.a aVar) {
        throw null;
    }

    @Override // m5.d
    public synchronized void a(Class cls, Executor executor, m5.b bVar) {
        try {
            d0.b(cls);
            d0.b(bVar);
            d0.b(executor);
            if (!this.f23783a.containsKey(cls)) {
                this.f23783a.put(cls, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.f23783a.get(cls)).put(bVar, executor);
        } catch (Throwable th) {
            throw th;
        }
    }

    void c() {
        Queue queue;
        synchronized (this) {
            try {
                queue = this.f23784b;
                if (queue != null) {
                    this.f23784b = null;
                } else {
                    queue = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (queue != null) {
            Iterator it = queue.iterator();
            while (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                e(null);
            }
        }
    }

    public void e(final m5.a aVar) {
        d0.b(aVar);
        synchronized (this) {
            try {
                Queue queue = this.f23784b;
                if (queue != null) {
                    queue.add(aVar);
                    return;
                }
                for (final Map.Entry entry : d(aVar)) {
                    ((Executor) entry.getValue()).execute(new Runnable(entry, aVar) { // from class: f5.u

                        /* renamed from: q, reason: collision with root package name */
                        public final /* synthetic */ Map.Entry f23782q;

                        @Override // java.lang.Runnable
                        public final void run() {
                            ((m5.b) this.f23782q.getKey()).a(null);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
