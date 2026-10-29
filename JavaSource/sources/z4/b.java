package z4;

import java.util.NoSuchElementException;

/* compiled from: MyApplication */
public abstract class b extends z {

    /* renamed from: q, reason: collision with root package name */
    private EnumC0160b f27843q = EnumC0160b.NOT_READY;

    /* renamed from: r, reason: collision with root package name */
    private Object f27844r;

    /* compiled from: MyApplication */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f27845a;

        static {
            int[] iArr = new int[EnumC0160b.values().length];
            f27845a = iArr;
            try {
                iArr[EnumC0160b.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27845a[EnumC0160b.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: MyApplication */
    /* renamed from: z4.b$b, reason: collision with other inner class name */
    private enum EnumC0160b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected b() {
    }

    private boolean e() {
        this.f27843q = EnumC0160b.FAILED;
        this.f27844r = b();
        if (this.f27843q == EnumC0160b.DONE) {
            return false;
        }
        this.f27843q = EnumC0160b.READY;
        return true;
    }

    protected abstract Object b();

    protected final Object d() {
        this.f27843q = EnumC0160b.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        y4.h.m(this.f27843q != EnumC0160b.FAILED);
        int i7 = a.f27845a[this.f27843q.ordinal()];
        if (i7 == 1) {
            return false;
        }
        if (i7 != 2) {
            return e();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f27843q = EnumC0160b.NOT_READY;
        Object a8 = p.a(this.f27844r);
        this.f27844r = null;
        return a8;
    }
}
