package x6;

/* compiled from: MyApplication */
final class w {

    /* renamed from: a, reason: collision with root package name */
    public final Object f27448a;

    /* renamed from: b, reason: collision with root package name */
    public final h f27449b;

    /* renamed from: c, reason: collision with root package name */
    public final p6.l f27450c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f27451d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f27452e;

    public w(Object obj, h hVar, p6.l lVar, Object obj2, Throwable th) {
        this.f27448a = obj;
        this.f27449b = hVar;
        this.f27450c = lVar;
        this.f27451d = obj2;
        this.f27452e = th;
    }

    public static /* synthetic */ w b(w wVar, Object obj, h hVar, p6.l lVar, Object obj2, Throwable th, int i7, Object obj3) {
        if ((i7 & 1) != 0) {
            obj = wVar.f27448a;
        }
        if ((i7 & 2) != 0) {
            hVar = wVar.f27449b;
        }
        if ((i7 & 4) != 0) {
            lVar = wVar.f27450c;
        }
        if ((i7 & 8) != 0) {
            obj2 = wVar.f27451d;
        }
        if ((i7 & 16) != 0) {
            th = wVar.f27452e;
        }
        Throwable th2 = th;
        p6.l lVar2 = lVar;
        return wVar.a(obj, hVar, lVar2, obj2, th2);
    }

    public final w a(Object obj, h hVar, p6.l lVar, Object obj2, Throwable th) {
        return new w(obj, hVar, lVar, obj2, th);
    }

    public final boolean c() {
        return this.f27452e != null;
    }

    public final void d(k kVar, Throwable th) {
        h hVar = this.f27449b;
        if (hVar != null) {
            kVar.l(hVar, th);
        }
        p6.l lVar = this.f27450c;
        if (lVar != null) {
            kVar.m(lVar, th);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return q6.i.a(this.f27448a, wVar.f27448a) && q6.i.a(this.f27449b, wVar.f27449b) && q6.i.a(this.f27450c, wVar.f27450c) && q6.i.a(this.f27451d, wVar.f27451d) && q6.i.a(this.f27452e, wVar.f27452e);
    }

    public int hashCode() {
        Object obj = this.f27448a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        h hVar = this.f27449b;
        int hashCode2 = (hashCode + (hVar == null ? 0 : hVar.hashCode())) * 31;
        p6.l lVar = this.f27450c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f27451d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f27452e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f27448a + ", cancelHandler=" + this.f27449b + ", onCancellation=" + this.f27450c + ", idempotentResume=" + this.f27451d + ", cancelCause=" + this.f27452e + ')';
    }

    public /* synthetic */ w(Object obj, h hVar, p6.l lVar, Object obj2, Throwable th, int i7, q6.e eVar) {
        this(obj, (i7 & 2) != 0 ? null : hVar, (i7 & 4) != 0 ? null : lVar, (i7 & 8) != 0 ? null : obj2, (i7 & 16) != 0 ? null : th);
    }
}
