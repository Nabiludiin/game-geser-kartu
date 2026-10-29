package m3;

import l3.a;

/* compiled from: MyApplication */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final int f24762a;

    /* renamed from: b, reason: collision with root package name */
    private final l3.a f24763b;

    /* renamed from: c, reason: collision with root package name */
    private final a.d f24764c;

    /* renamed from: d, reason: collision with root package name */
    private final String f24765d;

    private b(l3.a aVar, a.d dVar, String str) {
        this.f24763b = aVar;
        this.f24764c = dVar;
        this.f24765d = str;
        this.f24762a = p3.n.b(aVar, dVar, str);
    }

    public static b a(l3.a aVar, a.d dVar, String str) {
        return new b(aVar, dVar, str);
    }

    public final String b() {
        return this.f24763b.d();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return p3.n.a(this.f24763b, bVar.f24763b) && p3.n.a(this.f24764c, bVar.f24764c) && p3.n.a(this.f24765d, bVar.f24765d);
    }

    public final int hashCode() {
        return this.f24762a;
    }
}
