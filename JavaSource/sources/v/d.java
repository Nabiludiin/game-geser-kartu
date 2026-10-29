package v;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import s.i;
import w.o;

/* compiled from: MyApplication */
public class d {

    /* renamed from: b, reason: collision with root package name */
    private int f26602b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f26603c;

    /* renamed from: d, reason: collision with root package name */
    public final e f26604d;

    /* renamed from: e, reason: collision with root package name */
    public final b f26605e;

    /* renamed from: f, reason: collision with root package name */
    public d f26606f;

    /* renamed from: i, reason: collision with root package name */
    s.i f26609i;

    /* renamed from: a, reason: collision with root package name */
    private HashSet f26601a = null;

    /* renamed from: g, reason: collision with root package name */
    public int f26607g = 0;

    /* renamed from: h, reason: collision with root package name */
    int f26608h = Integer.MIN_VALUE;

    /* compiled from: MyApplication */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f26610a;

        static {
            int[] iArr = new int[b.values().length];
            f26610a = iArr;
            try {
                iArr[b.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26610a[b.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26610a[b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f26610a[b.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f26610a[b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f26610a[b.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f26610a[b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f26610a[b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f26610a[b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* compiled from: MyApplication */
    public enum b {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public d(e eVar, b bVar) {
        this.f26604d = eVar;
        this.f26605e = bVar;
    }

    public boolean a(d dVar, int i7, int i8, boolean z7) {
        if (dVar == null) {
            p();
            return true;
        }
        if (!z7 && !o(dVar)) {
            return false;
        }
        this.f26606f = dVar;
        if (dVar.f26601a == null) {
            dVar.f26601a = new HashSet();
        }
        HashSet hashSet = this.f26606f.f26601a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f26607g = i7;
        this.f26608h = i8;
        return true;
    }

    public void b(int i7, ArrayList arrayList, o oVar) {
        HashSet hashSet = this.f26601a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                w.i.a(((d) it.next()).f26604d, i7, arrayList, oVar);
            }
        }
    }

    public HashSet c() {
        return this.f26601a;
    }

    public int d() {
        if (this.f26603c) {
            return this.f26602b;
        }
        return 0;
    }

    public int e() {
        d dVar;
        if (this.f26604d.T() == 8) {
            return 0;
        }
        return (this.f26608h == Integer.MIN_VALUE || (dVar = this.f26606f) == null || dVar.f26604d.T() != 8) ? this.f26607g : this.f26608h;
    }

    public final d f() {
        switch (a.f26610a[this.f26605e.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f26604d.Q;
            case 3:
                return this.f26604d.O;
            case 4:
                return this.f26604d.R;
            case 5:
                return this.f26604d.P;
            default:
                throw new AssertionError(this.f26605e.name());
        }
    }

    public e g() {
        return this.f26604d;
    }

    public s.i h() {
        return this.f26609i;
    }

    public d i() {
        return this.f26606f;
    }

    public b j() {
        return this.f26605e;
    }

    public boolean k() {
        HashSet hashSet = this.f26601a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((d) it.next()).f().n()) {
                return true;
            }
        }
        return false;
    }

    public boolean l() {
        HashSet hashSet = this.f26601a;
        return hashSet != null && hashSet.size() > 0;
    }

    public boolean m() {
        return this.f26603c;
    }

    public boolean n() {
        return this.f26606f != null;
    }

    public boolean o(d dVar) {
        if (dVar == null) {
            return false;
        }
        b j7 = dVar.j();
        b bVar = this.f26605e;
        if (j7 == bVar) {
            return bVar != b.BASELINE || (dVar.g().X() && g().X());
        }
        switch (a.f26610a[bVar.ordinal()]) {
            case 1:
                return (j7 == b.BASELINE || j7 == b.CENTER_X || j7 == b.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z7 = j7 == b.LEFT || j7 == b.RIGHT;
                return dVar.g() instanceof g ? z7 || j7 == b.CENTER_X : z7;
            case 4:
            case 5:
                boolean z8 = j7 == b.TOP || j7 == b.BOTTOM;
                return dVar.g() instanceof g ? z8 || j7 == b.CENTER_Y : z8;
            case 6:
                return (j7 == b.LEFT || j7 == b.RIGHT) ? false : true;
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.f26605e.name());
        }
    }

    public void p() {
        HashSet hashSet;
        d dVar = this.f26606f;
        if (dVar != null && (hashSet = dVar.f26601a) != null) {
            hashSet.remove(this);
            if (this.f26606f.f26601a.size() == 0) {
                this.f26606f.f26601a = null;
            }
        }
        this.f26601a = null;
        this.f26606f = null;
        this.f26607g = 0;
        this.f26608h = Integer.MIN_VALUE;
        this.f26603c = false;
        this.f26602b = 0;
    }

    public void q() {
        this.f26603c = false;
        this.f26602b = 0;
    }

    public void r(s.c cVar) {
        s.i iVar = this.f26609i;
        if (iVar == null) {
            this.f26609i = new s.i(i.a.UNRESTRICTED, null);
        } else {
            iVar.l();
        }
    }

    public void s(int i7) {
        this.f26602b = i7;
        this.f26603c = true;
    }

    public String toString() {
        return this.f26604d.r() + ":" + this.f26605e.toString();
    }
}
