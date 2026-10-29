package g7;

import c7.f0;
import c7.i0;

/* compiled from: MyApplication */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    private static final int f24074a;

    /* renamed from: b, reason: collision with root package name */
    private static final f0 f24075b;

    /* renamed from: c, reason: collision with root package name */
    private static final f0 f24076c;

    /* renamed from: d, reason: collision with root package name */
    private static final f0 f24077d;

    /* renamed from: e, reason: collision with root package name */
    private static final f0 f24078e;

    /* renamed from: f, reason: collision with root package name */
    private static final int f24079f;

    static {
        int e8;
        int e9;
        e8 = i0.e("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, null);
        f24074a = e8;
        f24075b = new f0("PERMIT");
        f24076c = new f0("TAKEN");
        f24077d = new f0("BROKEN");
        f24078e = new f0("CANCELLED");
        e9 = i0.e("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, null);
        f24079f = e9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f h(long j7, f fVar) {
        return new f(j7, fVar, 0);
    }
}
