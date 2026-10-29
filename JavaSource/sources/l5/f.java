package l5;

import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import l5.d;

/* compiled from: MyApplication */
final class f implements i5.e {

    /* renamed from: f, reason: collision with root package name */
    private static final Charset f24642f = Charset.forName("UTF-8");

    /* renamed from: g, reason: collision with root package name */
    private static final i5.c f24643g = i5.c.a("key").b(l5.a.b().c(1).a()).a();

    /* renamed from: h, reason: collision with root package name */
    private static final i5.c f24644h = i5.c.a("value").b(l5.a.b().c(2).a()).a();

    /* renamed from: i, reason: collision with root package name */
    private static final i5.d f24645i = new i5.d() { // from class: l5.e
        @Override // i5.d
        public final void a(Object obj, Object obj2) {
            f.b((Map.Entry) obj, (i5.e) obj2);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private OutputStream f24646a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f24647b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f24648c;

    /* renamed from: d, reason: collision with root package name */
    private final i5.d f24649d;

    /* renamed from: e, reason: collision with root package name */
    private final i f24650e = new i(this);

    /* compiled from: MyApplication */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f24651a;

        static {
            int[] iArr = new int[d.a.values().length];
            f24651a = iArr;
            try {
                iArr[d.a.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24651a[d.a.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24651a[d.a.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    f(OutputStream outputStream, Map map, Map map2, i5.d dVar) {
        this.f24646a = outputStream;
        this.f24647b = map;
        this.f24648c = map2;
        this.f24649d = dVar;
    }

    public static /* synthetic */ void b(Map.Entry entry, i5.e eVar) {
        eVar.d(f24643g, entry.getKey());
        eVar.d(f24644h, entry.getValue());
    }

    private static ByteBuffer l(int i7) {
        return ByteBuffer.allocate(i7).order(ByteOrder.LITTLE_ENDIAN);
    }

    private long m(i5.d dVar, Object obj) {
        b bVar = new b();
        try {
            OutputStream outputStream = this.f24646a;
            this.f24646a = bVar;
            try {
                dVar.a(obj, this);
                this.f24646a = outputStream;
                long a8 = bVar.a();
                bVar.close();
                return a8;
            } catch (Throwable th) {
                this.f24646a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                bVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private f n(i5.d dVar, i5.c cVar, Object obj, boolean z7) {
        long m7 = m(dVar, obj);
        if (z7 && m7 == 0) {
            return this;
        }
        s((r(cVar) << 3) | 2);
        t(m7);
        dVar.a(obj, this);
        return this;
    }

    private f o(i5.f fVar, i5.c cVar, Object obj, boolean z7) {
        this.f24650e.d(cVar, z7);
        fVar.a(obj, this.f24650e);
        return this;
    }

    private static d q(i5.c cVar) {
        d dVar = (d) cVar.c(d.class);
        if (dVar != null) {
            return dVar;
        }
        throw new i5.b("Field has no @Protobuf config");
    }

    private static int r(i5.c cVar) {
        d dVar = (d) cVar.c(d.class);
        if (dVar != null) {
            return dVar.tag();
        }
        throw new i5.b("Field has no @Protobuf config");
    }

    private void s(int i7) {
        while ((i7 & (-128)) != 0) {
            this.f24646a.write((i7 & 127) | 128);
            i7 >>>= 7;
        }
        this.f24646a.write(i7 & 127);
    }

    private void t(long j7) {
        while (((-128) & j7) != 0) {
            this.f24646a.write((((int) j7) & 127) | 128);
            j7 >>>= 7;
        }
        this.f24646a.write(((int) j7) & 127);
    }

    i5.e c(i5.c cVar, double d8, boolean z7) {
        if (z7 && d8 == 0.0d) {
            return this;
        }
        s((r(cVar) << 3) | 1);
        this.f24646a.write(l(8).putDouble(d8).array());
        return this;
    }

    @Override // i5.e
    public i5.e d(i5.c cVar, Object obj) {
        return f(cVar, obj, true);
    }

    i5.e e(i5.c cVar, float f8, boolean z7) {
        if (z7 && f8 == 0.0f) {
            return this;
        }
        s((r(cVar) << 3) | 5);
        this.f24646a.write(l(4).putFloat(f8).array());
        return this;
    }

    i5.e f(i5.c cVar, Object obj, boolean z7) {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z7 || charSequence.length() != 0) {
                    s((r(cVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f24642f);
                    s(bytes.length);
                    this.f24646a.write(bytes);
                    return this;
                }
            } else if (obj instanceof Collection) {
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    f(cVar, it.next(), false);
                }
            } else if (obj instanceof Map) {
                Iterator it2 = ((Map) obj).entrySet().iterator();
                while (it2.hasNext()) {
                    n(f24645i, cVar, (Map.Entry) it2.next(), false);
                }
            } else {
                if (obj instanceof Double) {
                    return c(cVar, ((Double) obj).doubleValue(), z7);
                }
                if (obj instanceof Float) {
                    return e(cVar, ((Float) obj).floatValue(), z7);
                }
                if (obj instanceof Number) {
                    return j(cVar, ((Number) obj).longValue(), z7);
                }
                if (obj instanceof Boolean) {
                    return k(cVar, ((Boolean) obj).booleanValue(), z7);
                }
                if (!(obj instanceof byte[])) {
                    i5.d dVar = (i5.d) this.f24647b.get(obj.getClass());
                    if (dVar != null) {
                        return n(dVar, cVar, obj, z7);
                    }
                    i5.f fVar = (i5.f) this.f24648c.get(obj.getClass());
                    return fVar != null ? o(fVar, cVar, obj, z7) : obj instanceof c ? g(cVar, ((c) obj).c()) : obj instanceof Enum ? g(cVar, ((Enum) obj).ordinal()) : n(this.f24649d, cVar, obj, z7);
                }
                byte[] bArr = (byte[]) obj;
                if (!z7 || bArr.length != 0) {
                    s((r(cVar) << 3) | 2);
                    s(bArr.length);
                    this.f24646a.write(bArr);
                    return this;
                }
            }
        }
        return this;
    }

    public f g(i5.c cVar, int i7) {
        return h(cVar, i7, true);
    }

    f h(i5.c cVar, int i7, boolean z7) {
        if (!z7 || i7 != 0) {
            d q7 = q(cVar);
            int i8 = a.f24651a[q7.intEncoding().ordinal()];
            if (i8 == 1) {
                s(q7.tag() << 3);
                s(i7);
                return this;
            }
            if (i8 == 2) {
                s(q7.tag() << 3);
                s((i7 << 1) ^ (i7 >> 31));
                return this;
            }
            if (i8 == 3) {
                s((q7.tag() << 3) | 5);
                this.f24646a.write(l(4).putInt(i7).array());
                return this;
            }
        }
        return this;
    }

    @Override // i5.e
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public f a(i5.c cVar, long j7) {
        return j(cVar, j7, true);
    }

    f j(i5.c cVar, long j7, boolean z7) {
        if (!z7 || j7 != 0) {
            d q7 = q(cVar);
            int i7 = a.f24651a[q7.intEncoding().ordinal()];
            if (i7 == 1) {
                s(q7.tag() << 3);
                t(j7);
                return this;
            }
            if (i7 == 2) {
                s(q7.tag() << 3);
                t((j7 >> 63) ^ (j7 << 1));
                return this;
            }
            if (i7 == 3) {
                s((q7.tag() << 3) | 1);
                this.f24646a.write(l(8).putLong(j7).array());
                return this;
            }
        }
        return this;
    }

    f k(i5.c cVar, boolean z7, boolean z8) {
        return h(cVar, z7 ? 1 : 0, z8);
    }

    f p(Object obj) {
        if (obj == null) {
            return this;
        }
        i5.d dVar = (i5.d) this.f24647b.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, this);
            return this;
        }
        throw new i5.b("No encoder for " + obj.getClass());
    }
}
