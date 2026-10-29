package z6;

import c7.f0;
import c7.i0;
import p6.p;

/* compiled from: MyApplication */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private static final h f28010a = new h(-1, null, null, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final int f28011b;

    /* renamed from: c, reason: collision with root package name */
    private static final int f28012c;

    /* renamed from: d, reason: collision with root package name */
    public static final f0 f28013d;

    /* renamed from: e, reason: collision with root package name */
    private static final f0 f28014e;

    /* renamed from: f, reason: collision with root package name */
    private static final f0 f28015f;

    /* renamed from: g, reason: collision with root package name */
    private static final f0 f28016g;

    /* renamed from: h, reason: collision with root package name */
    private static final f0 f28017h;

    /* renamed from: i, reason: collision with root package name */
    private static final f0 f28018i;

    /* renamed from: j, reason: collision with root package name */
    private static final f0 f28019j;

    /* renamed from: k, reason: collision with root package name */
    private static final f0 f28020k;

    /* renamed from: l, reason: collision with root package name */
    private static final f0 f28021l;

    /* renamed from: m, reason: collision with root package name */
    private static final f0 f28022m;

    /* renamed from: n, reason: collision with root package name */
    private static final f0 f28023n;

    /* renamed from: o, reason: collision with root package name */
    private static final f0 f28024o;

    /* renamed from: p, reason: collision with root package name */
    private static final f0 f28025p;

    /* renamed from: q, reason: collision with root package name */
    private static final f0 f28026q;

    /* renamed from: r, reason: collision with root package name */
    private static final f0 f28027r;

    /* renamed from: s, reason: collision with root package name */
    private static final f0 f28028s;

    /* compiled from: MyApplication */
    /* synthetic */ class a extends q6.h implements p {

        /* renamed from: z, reason: collision with root package name */
        public static final a f28029z = new a();

        a() {
            super(2, c.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
        }

        @Override // p6.p
        public /* bridge */ /* synthetic */ Object i(Object obj, Object obj2) {
            return l(((Number) obj).longValue(), (h) obj2);
        }

        public final h l(long j7, h hVar) {
            return c.w(j7, hVar);
        }
    }

    static {
        int e8;
        int e9;
        e8 = i0.e("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, null);
        f28011b = e8;
        e9 = i0.e("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12, null);
        f28012c = e9;
        f28013d = new f0("BUFFERED");
        f28014e = new f0("SHOULD_BUFFER");
        f28015f = new f0("S_RESUMING_BY_RCV");
        f28016g = new f0("RESUMING_BY_EB");
        f28017h = new f0("POISONED");
        f28018i = new f0("DONE_RCV");
        f28019j = new f0("INTERRUPTED_SEND");
        f28020k = new f0("INTERRUPTED_RCV");
        f28021l = new f0("CHANNEL_CLOSED");
        f28022m = new f0("SUSPEND");
        f28023n = new f0("SUSPEND_NO_WAITER");
        f28024o = new f0("FAILED");
        f28025p = new f0("NO_RECEIVE_RESULT");
        f28026q = new f0("CLOSE_HANDLER_CLOSED");
        f28027r = new f0("CLOSE_HANDLER_INVOKED");
        f28028s = new f0("NO_CLOSE_CAUSE");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean A(x6.j jVar, Object obj, p6.l lVar) {
        Object f8 = jVar.f(obj, null, lVar);
        if (f8 == null) {
            return false;
        }
        jVar.y(f8);
        return true;
    }

    static /* synthetic */ boolean B(x6.j jVar, Object obj, p6.l lVar, int i7, Object obj2) {
        if ((i7 & 2) != 0) {
            lVar = null;
        }
        return A(jVar, obj, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long u(long j7, boolean z7) {
        return (z7 ? 4611686018427387904L : 0L) + j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long v(long j7, int i7) {
        return (i7 << 60) + j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h w(long j7, h hVar) {
        return new h(j7, hVar, hVar.x(), 0);
    }

    public static final u6.d x() {
        return a.f28029z;
    }

    public static final f0 y() {
        return f28021l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long z(int i7) {
        if (i7 == 0) {
            return 0L;
        }
        if (i7 != Integer.MAX_VALUE) {
            return i7;
        }
        return Long.MAX_VALUE;
    }
}
