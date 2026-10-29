package w;

import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: MyApplication */
public class o {

    /* renamed from: g, reason: collision with root package name */
    static int f26983g;

    /* renamed from: b, reason: collision with root package name */
    int f26985b;

    /* renamed from: d, reason: collision with root package name */
    int f26987d;

    /* renamed from: a, reason: collision with root package name */
    ArrayList f26984a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    boolean f26986c = false;

    /* renamed from: e, reason: collision with root package name */
    ArrayList f26988e = null;

    /* renamed from: f, reason: collision with root package name */
    private int f26989f = -1;

    /* compiled from: MyApplication */
    class a {

        /* renamed from: a, reason: collision with root package name */
        WeakReference f26990a;

        /* renamed from: b, reason: collision with root package name */
        int f26991b;

        /* renamed from: c, reason: collision with root package name */
        int f26992c;

        /* renamed from: d, reason: collision with root package name */
        int f26993d;

        /* renamed from: e, reason: collision with root package name */
        int f26994e;

        /* renamed from: f, reason: collision with root package name */
        int f26995f;

        /* renamed from: g, reason: collision with root package name */
        int f26996g;

        public a(v.e eVar, s.d dVar, int i7) {
            this.f26990a = new WeakReference(eVar);
            this.f26991b = dVar.x(eVar.O);
            this.f26992c = dVar.x(eVar.P);
            this.f26993d = dVar.x(eVar.Q);
            this.f26994e = dVar.x(eVar.R);
            this.f26995f = dVar.x(eVar.S);
            this.f26996g = i7;
        }
    }

    public o(int i7) {
        int i8 = f26983g;
        f26983g = i8 + 1;
        this.f26985b = i8;
        this.f26987d = i7;
    }

    private String e() {
        int i7 = this.f26987d;
        return i7 == 0 ? "Horizontal" : i7 == 1 ? "Vertical" : i7 == 2 ? "Both" : "Unknown";
    }

    private int j(s.d dVar, ArrayList arrayList, int i7) {
        int x7;
        int x8;
        v.f fVar = (v.f) ((v.e) arrayList.get(0)).I();
        dVar.D();
        fVar.g(dVar, false);
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            ((v.e) arrayList.get(i8)).g(dVar, false);
        }
        if (i7 == 0 && fVar.W0 > 0) {
            v.b.b(fVar, dVar, arrayList, 0);
        }
        if (i7 == 1 && fVar.X0 > 0) {
            v.b.b(fVar, dVar, arrayList, 1);
        }
        try {
            dVar.z();
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        this.f26988e = new ArrayList();
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            this.f26988e.add(new a((v.e) arrayList.get(i9), dVar, i7));
        }
        if (i7 == 0) {
            x7 = dVar.x(fVar.O);
            x8 = dVar.x(fVar.Q);
            dVar.D();
        } else {
            x7 = dVar.x(fVar.P);
            x8 = dVar.x(fVar.R);
            dVar.D();
        }
        return x8 - x7;
    }

    public boolean a(v.e eVar) {
        if (this.f26984a.contains(eVar)) {
            return false;
        }
        this.f26984a.add(eVar);
        return true;
    }

    public void b(ArrayList arrayList) {
        int size = this.f26984a.size();
        if (this.f26989f != -1 && size > 0) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                o oVar = (o) arrayList.get(i7);
                if (this.f26989f == oVar.f26985b) {
                    g(this.f26987d, oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public int c() {
        return this.f26985b;
    }

    public int d() {
        return this.f26987d;
    }

    public int f(s.d dVar, int i7) {
        if (this.f26984a.size() == 0) {
            return 0;
        }
        return j(dVar, this.f26984a, i7);
    }

    public void g(int i7, o oVar) {
        ArrayList arrayList = this.f26984a;
        int size = arrayList.size();
        int i8 = 0;
        while (i8 < size) {
            Object obj = arrayList.get(i8);
            i8++;
            v.e eVar = (v.e) obj;
            oVar.a(eVar);
            if (i7 == 0) {
                eVar.I0 = oVar.c();
            } else {
                eVar.J0 = oVar.c();
            }
        }
        this.f26989f = oVar.f26985b;
    }

    public void h(boolean z7) {
        this.f26986c = z7;
    }

    public void i(int i7) {
        this.f26987d = i7;
    }

    public String toString() {
        String str = e() + " [" + this.f26985b + "] <";
        ArrayList arrayList = this.f26984a;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            str = str + " " + ((v.e) obj).r();
        }
        return str + " >";
    }
}
