package j6;

import f6.f;
import java.io.Serializable;
import q6.i;

/* compiled from: MyApplication */
final class c extends f6.c implements a, Serializable {

    /* renamed from: r, reason: collision with root package name */
    private final Enum[] f24261r;

    public c(Enum[] enumArr) {
        i.e(enumArr, "entries");
        this.f24261r = enumArr;
    }

    @Override // f6.b, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Enum) {
            return h((Enum) obj);
        }
        return false;
    }

    @Override // f6.b
    public int e() {
        return this.f24261r.length;
    }

    public boolean h(Enum r32) {
        i.e(r32, "element");
        return ((Enum) f.g(this.f24261r, r32.ordinal())) == r32;
    }

    @Override // f6.c, java.util.List
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public Enum get(int i7) {
        f6.c.f23792q.a(i7, this.f24261r.length);
        return this.f24261r[i7];
    }

    @Override // f6.c, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Enum) {
            return j((Enum) obj);
        }
        return -1;
    }

    public int j(Enum r32) {
        i.e(r32, "element");
        int ordinal = r32.ordinal();
        if (((Enum) f.g(this.f24261r, ordinal)) == r32) {
            return ordinal;
        }
        return -1;
    }

    public int k(Enum r22) {
        i.e(r22, "element");
        return indexOf(r22);
    }

    @Override // f6.c, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return k((Enum) obj);
        }
        return -1;
    }
}
