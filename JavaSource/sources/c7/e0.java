package c7;

import e6.m;

/* compiled from: MyApplication */
public abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    private static final StackTraceElement f3776a = new a.a().a();

    /* renamed from: b, reason: collision with root package name */
    private static final String f3777b;

    /* renamed from: c, reason: collision with root package name */
    private static final String f3778c;

    static {
        Object a8;
        Object a9;
        try {
            m.a aVar = e6.m.f23247q;
            a8 = e6.m.a(i6.a.class.getCanonicalName());
        } catch (Throwable th) {
            m.a aVar2 = e6.m.f23247q;
            a8 = e6.m.a(e6.n.a(th));
        }
        if (e6.m.b(a8) != null) {
            a8 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f3777b = (String) a8;
        try {
            a9 = e6.m.a(e0.class.getCanonicalName());
        } catch (Throwable th2) {
            m.a aVar3 = e6.m.f23247q;
            a9 = e6.m.a(e6.n.a(th2));
        }
        if (e6.m.b(a9) != null) {
            a9 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f3778c = (String) a9;
    }

    public static final Throwable a(Throwable th) {
        return th;
    }
}
