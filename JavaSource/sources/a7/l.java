package a7;

import c7.f0;
import e6.s;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: MyApplication */
final class l extends b7.b implements j, b {

    /* renamed from: u, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f37u = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: t, reason: collision with root package name */
    private int f38t;

    /* compiled from: MyApplication */
    static final class a extends i6.d {
        int A;

        /* renamed from: t, reason: collision with root package name */
        Object f39t;

        /* renamed from: u, reason: collision with root package name */
        Object f40u;

        /* renamed from: v, reason: collision with root package name */
        Object f41v;

        /* renamed from: w, reason: collision with root package name */
        Object f42w;

        /* renamed from: x, reason: collision with root package name */
        Object f43x;

        /* renamed from: y, reason: collision with root package name */
        /* synthetic */ Object f44y;

        a(g6.e eVar) {
            super(eVar);
        }

        @Override // i6.a
        public final Object m(Object obj) {
            this.f44y = obj;
            this.A |= Integer.MIN_VALUE;
            return l.this.a(null, this);
        }
    }

    public l(Object obj) {
        this._state$volatile = obj;
    }

    private final boolean k(Object obj, Object obj2) {
        int i7;
        b7.d[] g8;
        synchronized (this) {
            Object obj3 = f37u.get(this);
            if (obj != null && !q6.i.a(obj3, obj)) {
                return false;
            }
            if (q6.i.a(obj3, obj2)) {
                return true;
            }
            f37u.set(this, obj2);
            int i8 = this.f38t;
            if ((i8 & 1) != 0) {
                this.f38t = i8 + 2;
                return true;
            }
            int i9 = i8 + 1;
            this.f38t = i9;
            b7.d[] g9 = g();
            s sVar = s.f23253a;
            while (true) {
                n[] nVarArr = (n[]) g9;
                if (nVarArr != null) {
                    for (n nVar : nVarArr) {
                        if (nVar != null) {
                            nVar.h();
                        }
                    }
                }
                synchronized (this) {
                    i7 = this.f38t;
                    if (i7 == i9) {
                        this.f38t = i9 + 1;
                        return true;
                    }
                    g8 = g();
                    s sVar2 = s.f23253a;
                }
                g9 = g8;
                i9 = i7;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d5, code lost:
    
        if (r6.e(r0) == r1) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0099 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:14:0x003e, B:15:0x008f, B:17:0x0099, B:19:0x009e, B:21:0x00bf, B:23:0x00c5, B:27:0x00a4, B:30:0x00ab, B:39:0x005f, B:41:0x0071, B:42:0x0080), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009e A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:14:0x003e, B:15:0x008f, B:17:0x0099, B:19:0x009e, B:21:0x00bf, B:23:0x00c5, B:27:0x00a4, B:30:0x00ab, B:39:0x005f, B:41:0x0071, B:42:0x0080), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c5 A[Catch: all -> 0x0042, TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:14:0x003e, B:15:0x008f, B:17:0x0099, B:19:0x009e, B:21:0x00bf, B:23:0x00c5, B:27:0x00a4, B:30:0x00ab, B:39:0x005f, B:41:0x0071, B:42:0x0080), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00c3 -> B:15:0x008f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00d5 -> B:15:0x008f). Please report as a decompilation issue!!! */
    @Override // a7.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(a7.c r11, g6.e r12) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a7.l.a(a7.c, g6.e):java.lang.Object");
    }

    @Override // a7.c
    public Object c(Object obj, g6.e eVar) {
        setValue(obj);
        return s.f23253a;
    }

    @Override // a7.j
    public Object getValue() {
        f0 f0Var = b7.h.f3449a;
        Object obj = f37u.get(this);
        if (obj == f0Var) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // b7.b
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public n d() {
        return new n();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // b7.b
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public n[] e(int i7) {
        return new n[i7];
    }

    @Override // a7.j
    public void setValue(Object obj) {
        if (obj == null) {
            obj = b7.h.f3449a;
        }
        k(null, obj);
    }
}
