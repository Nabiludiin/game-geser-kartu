package k5;

import android.util.Base64;
import android.util.JsonWriter;
import i5.f;
import i5.g;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

/* compiled from: MyApplication */
final class e implements i5.e, g {

    /* renamed from: a, reason: collision with root package name */
    private e f24541a = null;

    /* renamed from: b, reason: collision with root package name */
    private boolean f24542b = true;

    /* renamed from: c, reason: collision with root package name */
    private final JsonWriter f24543c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f24544d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f24545e;

    /* renamed from: f, reason: collision with root package name */
    private final i5.d f24546f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f24547g;

    e(Writer writer, Map map, Map map2, i5.d dVar, boolean z7) {
        this.f24543c = new JsonWriter(writer);
        this.f24544d = map;
        this.f24545e = map2;
        this.f24546f = dVar;
        this.f24547g = z7;
    }

    private boolean l(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    private e o(String str, Object obj) {
        q();
        this.f24543c.name(str);
        if (obj != null) {
            return f(obj, false);
        }
        this.f24543c.nullValue();
        return this;
    }

    private e p(String str, Object obj) {
        if (obj == null) {
            return this;
        }
        q();
        this.f24543c.name(str);
        return f(obj, false);
    }

    private void q() {
        if (!this.f24542b) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
        e eVar = this.f24541a;
        if (eVar != null) {
            eVar.q();
            this.f24541a.f24542b = false;
            this.f24541a = null;
            this.f24543c.endObject();
        }
    }

    @Override // i5.e
    public i5.e a(i5.c cVar, long j7) {
        return h(cVar.b(), j7);
    }

    @Override // i5.e
    public i5.e d(i5.c cVar, Object obj) {
        return i(cVar.b(), obj);
    }

    public e e(long j7) {
        q();
        this.f24543c.value(j7);
        return this;
    }

    e f(Object obj, boolean z7) {
        int i7 = 0;
        if (z7 && l(obj)) {
            throw new i5.b(String.format("%s cannot be encoded inline", obj == null ? null : obj.getClass()));
        }
        if (obj == null) {
            this.f24543c.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            this.f24543c.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                this.f24543c.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    f(it.next(), false);
                }
                this.f24543c.endArray();
                return this;
            }
            if (obj instanceof Map) {
                this.f24543c.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        i((String) key, entry.getValue());
                    } catch (ClassCastException e8) {
                        throw new i5.b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e8);
                    }
                }
                this.f24543c.endObject();
                return this;
            }
            i5.d dVar = (i5.d) this.f24544d.get(obj.getClass());
            if (dVar != null) {
                return n(dVar, obj, z7);
            }
            f fVar = (f) this.f24545e.get(obj.getClass());
            if (fVar != null) {
                fVar.a(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                return n(this.f24546f, obj, z7);
            }
            b(((Enum) obj).name());
            return this;
        }
        if (obj instanceof byte[]) {
            return k((byte[]) obj);
        }
        this.f24543c.beginArray();
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i7 < length) {
                this.f24543c.value(r6[i7]);
                i7++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i7 < length2) {
                e(jArr[i7]);
                i7++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i7 < length3) {
                this.f24543c.value(dArr[i7]);
                i7++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i7 < length4) {
                this.f24543c.value(zArr[i7]);
                i7++;
            }
        } else if (obj instanceof Number[]) {
            for (Number number : (Number[]) obj) {
                f(number, false);
            }
        } else {
            for (Object obj2 : (Object[]) obj) {
                f(obj2, false);
            }
        }
        this.f24543c.endArray();
        return this;
    }

    @Override // i5.g
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public e b(String str) {
        q();
        this.f24543c.value(str);
        return this;
    }

    public e h(String str, long j7) {
        q();
        this.f24543c.name(str);
        return e(j7);
    }

    public e i(String str, Object obj) {
        return this.f24547g ? p(str, obj) : o(str, obj);
    }

    @Override // i5.g
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public e c(boolean z7) {
        q();
        this.f24543c.value(z7);
        return this;
    }

    public e k(byte[] bArr) {
        q();
        if (bArr == null) {
            this.f24543c.nullValue();
            return this;
        }
        this.f24543c.value(Base64.encodeToString(bArr, 2));
        return this;
    }

    void m() {
        q();
        this.f24543c.flush();
    }

    e n(i5.d dVar, Object obj, boolean z7) {
        if (!z7) {
            this.f24543c.beginObject();
        }
        dVar.a(obj, this);
        if (!z7) {
            this.f24543c.endObject();
        }
        return this;
    }
}
