package z5;

import java.util.ArrayList;
import w5.p;
import w5.q;

/* compiled from: MyApplication */
public final class g extends p {

    /* renamed from: b, reason: collision with root package name */
    public static final q f27925b = new a();

    /* renamed from: a, reason: collision with root package name */
    private final w5.d f27926a;

    /* compiled from: MyApplication */
    static class a implements q {
        a() {
        }

        @Override // w5.q
        public p a(w5.d dVar, a6.a aVar) {
            a aVar2 = null;
            if (aVar.c() == Object.class) {
                return new g(dVar, aVar2);
            }
            return null;
        }
    }

    /* compiled from: MyApplication */
    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f27927a;

        static {
            int[] iArr = new int[b6.b.values().length];
            f27927a = iArr;
            try {
                iArr[b6.b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27927a[b6.b.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27927a[b6.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27927a[b6.b.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f27927a[b6.b.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f27927a[b6.b.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* synthetic */ g(w5.d dVar, a aVar) {
        this(dVar);
    }

    @Override // w5.p
    public Object a(b6.a aVar) {
        switch (b.f27927a[aVar.R().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                aVar.j();
                while (aVar.t()) {
                    arrayList.add(a(aVar));
                }
                aVar.o();
                return arrayList;
            case 2:
                y5.g gVar = new y5.g();
                aVar.k();
                while (aVar.t()) {
                    gVar.put(aVar.H(), a(aVar));
                }
                aVar.p();
                return gVar;
            case 3:
                return aVar.O();
            case 4:
                return Double.valueOf(aVar.B());
            case 5:
                return Boolean.valueOf(aVar.z());
            case 6:
                aVar.L();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    @Override // w5.p
    public void c(b6.c cVar, Object obj) {
        if (obj == null) {
            cVar.q();
            return;
        }
        p k7 = this.f27926a.k(obj.getClass());
        if (!(k7 instanceof g)) {
            k7.c(cVar, obj);
        } else {
            cVar.g();
            cVar.k();
        }
    }

    private g(w5.d dVar) {
        this.f27926a = dVar;
    }
}
