package w;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: MyApplication */
public class f implements d {

    /* renamed from: d, reason: collision with root package name */
    p f26948d;

    /* renamed from: f, reason: collision with root package name */
    int f26950f;

    /* renamed from: g, reason: collision with root package name */
    public int f26951g;

    /* renamed from: a, reason: collision with root package name */
    public d f26945a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f26946b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f26947c = false;

    /* renamed from: e, reason: collision with root package name */
    a f26949e = a.UNKNOWN;

    /* renamed from: h, reason: collision with root package name */
    int f26952h = 1;

    /* renamed from: i, reason: collision with root package name */
    g f26953i = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f26954j = false;

    /* renamed from: k, reason: collision with root package name */
    List f26955k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    List f26956l = new ArrayList();

    /* compiled from: MyApplication */
    enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public f(p pVar) {
        this.f26948d = pVar;
    }

    @Override // w.d
    public void a(d dVar) {
        Iterator it = this.f26956l.iterator();
        while (it.hasNext()) {
            if (!((f) it.next()).f26954j) {
                return;
            }
        }
        this.f26947c = true;
        d dVar2 = this.f26945a;
        if (dVar2 != null) {
            dVar2.a(this);
        }
        if (this.f26946b) {
            this.f26948d.a(this);
            return;
        }
        f fVar = null;
        int i7 = 0;
        for (f fVar2 : this.f26956l) {
            if (!(fVar2 instanceof g)) {
                i7++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i7 == 1 && fVar.f26954j) {
            g gVar = this.f26953i;
            if (gVar != null) {
                if (!gVar.f26954j) {
                    return;
                } else {
                    this.f26950f = this.f26952h * gVar.f26951g;
                }
            }
            d(fVar.f26951g + this.f26950f);
        }
        d dVar3 = this.f26945a;
        if (dVar3 != null) {
            dVar3.a(this);
        }
    }

    public void b(d dVar) {
        this.f26955k.add(dVar);
        if (this.f26954j) {
            dVar.a(dVar);
        }
    }

    public void c() {
        this.f26956l.clear();
        this.f26955k.clear();
        this.f26954j = false;
        this.f26951g = 0;
        this.f26947c = false;
        this.f26946b = false;
    }

    public void d(int i7) {
        if (this.f26954j) {
            return;
        }
        this.f26954j = true;
        this.f26951g = i7;
        for (d dVar : this.f26955k) {
            dVar.a(dVar);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f26948d.f26999b.r());
        sb.append(":");
        sb.append(this.f26949e);
        sb.append("(");
        sb.append(this.f26954j ? Integer.valueOf(this.f26951g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f26956l.size());
        sb.append(":d=");
        sb.append(this.f26955k.size());
        sb.append(">");
        return sb.toString();
    }
}
