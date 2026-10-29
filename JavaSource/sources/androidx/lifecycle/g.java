package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MyApplication */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    AtomicReference f2505a = new AtomicReference();

    /* compiled from: MyApplication */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2506a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f2507b;

        static {
            int[] iArr = new int[b.values().length];
            f2507b = iArr;
            try {
                iArr[b.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2507b[b.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2507b[b.ON_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2507b[b.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2507b[b.ON_RESUME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2507b[b.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2507b[b.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[c.values().length];
            f2506a = iArr2;
            try {
                iArr2[c.CREATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2506a[c.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f2506a[c.RESUMED.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f2506a[c.DESTROYED.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f2506a[c.INITIALIZED.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* compiled from: MyApplication */
    public enum b {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;

        public static b c(c cVar) {
            int i7 = a.f2506a[cVar.ordinal()];
            if (i7 == 1) {
                return ON_DESTROY;
            }
            if (i7 == 2) {
                return ON_STOP;
            }
            if (i7 != 3) {
                return null;
            }
            return ON_PAUSE;
        }

        public static b j(c cVar) {
            int i7 = a.f2506a[cVar.ordinal()];
            if (i7 == 1) {
                return ON_START;
            }
            if (i7 == 2) {
                return ON_RESUME;
            }
            if (i7 != 5) {
                return null;
            }
            return ON_CREATE;
        }

        public c d() {
            switch (a.f2507b[ordinal()]) {
                case 1:
                case 2:
                    return c.CREATED;
                case 3:
                case 4:
                    return c.STARTED;
                case 5:
                    return c.RESUMED;
                case 6:
                    return c.DESTROYED;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    /* compiled from: MyApplication */
    public enum c {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        public boolean c(c cVar) {
            return compareTo(cVar) >= 0;
        }
    }

    public abstract void a(j jVar);

    public abstract c b();

    public abstract void c(j jVar);
}
