package androidx.lifecycle;

import androidx.lifecycle.g;

/* compiled from: MyApplication */
class FullLifecycleObserverAdapter implements i {

    /* renamed from: a, reason: collision with root package name */
    private final e f2470a;

    /* renamed from: b, reason: collision with root package name */
    private final i f2471b;

    /* compiled from: MyApplication */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2472a;

        static {
            int[] iArr = new int[g.b.values().length];
            f2472a = iArr;
            try {
                iArr[g.b.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2472a[g.b.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2472a[g.b.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2472a[g.b.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2472a[g.b.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2472a[g.b.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2472a[g.b.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    FullLifecycleObserverAdapter(e eVar, i iVar) {
        this.f2470a = eVar;
        this.f2471b = iVar;
    }

    @Override // androidx.lifecycle.i
    public void c(k kVar, g.b bVar) {
        switch (a.f2472a[bVar.ordinal()]) {
            case 1:
                this.f2470a.b(kVar);
                break;
            case 2:
                this.f2470a.g(kVar);
                break;
            case 3:
                this.f2470a.a(kVar);
                break;
            case 4:
                this.f2470a.d(kVar);
                break;
            case 5:
                this.f2470a.e(kVar);
                break;
            case 6:
                this.f2470a.f(kVar);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        i iVar = this.f2471b;
        if (iVar != null) {
            iVar.c(kVar, bVar);
        }
    }
}
