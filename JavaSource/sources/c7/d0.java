package c7;

/* compiled from: MyApplication */
public abstract class d0 {
    public static final c0 b(Object obj) {
        if (obj == d.f3773a) {
            throw new IllegalStateException("Does not contain segment");
        }
        q6.i.c(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
        return (c0) obj;
    }

    public static final boolean c(Object obj) {
        return obj == d.f3773a;
    }

    public static Object a(Object obj) {
        return obj;
    }
}
