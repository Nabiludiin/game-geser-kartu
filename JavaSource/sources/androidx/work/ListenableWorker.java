package androidx.work;

import a5.d;
import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.work.impl.utils.futures.c;
import e1.e;
import e1.v;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public abstract class ListenableWorker {

    /* renamed from: q, reason: collision with root package name */
    private Context f2944q;

    /* renamed from: r, reason: collision with root package name */
    private WorkerParameters f2945r;

    /* renamed from: s, reason: collision with root package name */
    private volatile boolean f2946s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f2947t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f2948u;

    /* compiled from: MyApplication */
    public static abstract class a {

        /* compiled from: MyApplication */
        /* renamed from: androidx.work.ListenableWorker$a$a, reason: collision with other inner class name */
        public static final class C0052a extends a {

            /* renamed from: a, reason: collision with root package name */
            private final androidx.work.b f2949a;

            public C0052a() {
                this(androidx.work.b.f2992c);
            }

            public androidx.work.b e() {
                return this.f2949a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0052a.class != obj.getClass()) {
                    return false;
                }
                return this.f2949a.equals(((C0052a) obj).f2949a);
            }

            public int hashCode() {
                return (C0052a.class.getName().hashCode() * 31) + this.f2949a.hashCode();
            }

            public String toString() {
                return "Failure {mOutputData=" + this.f2949a + '}';
            }

            public C0052a(androidx.work.b bVar) {
                this.f2949a = bVar;
            }
        }

        /* compiled from: MyApplication */
        public static final class b extends a {
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && b.class == obj.getClass();
            }

            public int hashCode() {
                return b.class.getName().hashCode();
            }

            public String toString() {
                return "Retry";
            }
        }

        /* compiled from: MyApplication */
        public static final class c extends a {

            /* renamed from: a, reason: collision with root package name */
            private final androidx.work.b f2950a;

            public c() {
                this(androidx.work.b.f2992c);
            }

            public androidx.work.b e() {
                return this.f2950a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || c.class != obj.getClass()) {
                    return false;
                }
                return this.f2950a.equals(((c) obj).f2950a);
            }

            public int hashCode() {
                return (c.class.getName().hashCode() * 31) + this.f2950a.hashCode();
            }

            public String toString() {
                return "Success {mOutputData=" + this.f2950a + '}';
            }

            public c(androidx.work.b bVar) {
                this.f2950a = bVar;
            }
        }

        a() {
        }

        public static a a() {
            return new C0052a();
        }

        public static a b() {
            return new b();
        }

        public static a c() {
            return new c();
        }

        public static a d(androidx.work.b bVar) {
            return new c(bVar);
        }
    }

    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.f2944q = context;
        this.f2945r = workerParameters;
    }

    public final Context getApplicationContext() {
        return this.f2944q;
    }

    public Executor getBackgroundExecutor() {
        return this.f2945r.a();
    }

    public d getForegroundInfoAsync() {
        c u7 = c.u();
        u7.r(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return u7;
    }

    public final UUID getId() {
        return this.f2945r.c();
    }

    public final b getInputData() {
        return this.f2945r.d();
    }

    public final Network getNetwork() {
        return this.f2945r.e();
    }

    public final int getRunAttemptCount() {
        return this.f2945r.g();
    }

    public final Set<String> getTags() {
        return this.f2945r.h();
    }

    public o1.a getTaskExecutor() {
        return this.f2945r.i();
    }

    public final List<String> getTriggeredContentAuthorities() {
        return this.f2945r.j();
    }

    public final List<Uri> getTriggeredContentUris() {
        return this.f2945r.k();
    }

    public v getWorkerFactory() {
        return this.f2945r.l();
    }

    public boolean isRunInForeground() {
        return this.f2948u;
    }

    public final boolean isStopped() {
        return this.f2946s;
    }

    public final boolean isUsed() {
        return this.f2947t;
    }

    public final d setForegroundAsync(e eVar) {
        this.f2948u = true;
        return this.f2945r.b().a(getApplicationContext(), getId(), eVar);
    }

    public d setProgressAsync(b bVar) {
        return this.f2945r.f().a(getApplicationContext(), getId(), bVar);
    }

    public void setRunInForeground(boolean z7) {
        this.f2948u = z7;
    }

    public final void setUsed() {
        this.f2947t = true;
    }

    public abstract d startWork();

    public final void stop() {
        this.f2946s = true;
        onStopped();
    }

    public void onStopped() {
    }
}
