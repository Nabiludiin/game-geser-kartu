package f2;

import android.app.job.JobInfo;
import f2.c;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: MyApplication */
public abstract class f {

    /* compiled from: MyApplication */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private i2.a f23654a;

        /* renamed from: b, reason: collision with root package name */
        private Map f23655b = new HashMap();

        public a a(w1.d dVar, b bVar) {
            this.f23655b.put(dVar, bVar);
            return this;
        }

        public f b() {
            if (this.f23654a == null) {
                throw new NullPointerException("missing required property: clock");
            }
            if (this.f23655b.keySet().size() < w1.d.values().length) {
                throw new IllegalStateException("Not all priorities have been configured");
            }
            Map map = this.f23655b;
            this.f23655b = new HashMap();
            return f.d(this.f23654a, map);
        }

        public a c(i2.a aVar) {
            this.f23654a = aVar;
            return this;
        }
    }

    /* compiled from: MyApplication */
    public static abstract class b {

        /* compiled from: MyApplication */
        public static abstract class a {
            public abstract b a();

            public abstract a b(long j7);

            public abstract a c(Set set);

            public abstract a d(long j7);
        }

        public static a a() {
            return new c.b().c(Collections.EMPTY_SET);
        }

        abstract long b();

        abstract Set c();

        abstract long d();
    }

    /* compiled from: MyApplication */
    public enum c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    private long a(int i7, long j7) {
        return (long) (Math.pow(3.0d, i7 - 1) * j7 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j7 > 1 ? j7 : 2L) * r7)));
    }

    public static a b() {
        return new a();
    }

    static f d(i2.a aVar, Map map) {
        return new f2.b(aVar, map);
    }

    public static f f(i2.a aVar) {
        return b().a(w1.d.DEFAULT, b.a().b(30000L).d(86400000L).a()).a(w1.d.HIGHEST, b.a().b(1000L).d(86400000L).a()).a(w1.d.VERY_LOW, b.a().b(86400000L).d(86400000L).c(i(c.DEVICE_IDLE)).a()).c(aVar).b();
    }

    private static Set i(Object... objArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(objArr)));
    }

    private void j(JobInfo.Builder builder, Set set) {
        if (set.contains(c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    public JobInfo.Builder c(JobInfo.Builder builder, w1.d dVar, long j7, int i7) {
        builder.setMinimumLatency(g(dVar, j7, i7));
        j(builder, ((b) h().get(dVar)).c());
        return builder;
    }

    abstract i2.a e();

    public long g(w1.d dVar, long j7, int i7) {
        long a8 = j7 - e().a();
        b bVar = (b) h().get(dVar);
        return Math.min(Math.max(a(i7, bVar.b()), a8), bVar.d());
    }

    abstract Map h();
}
