package u0;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import x0.e;

/* compiled from: MyApplication */
public class c implements e, x0.d {

    /* renamed from: y, reason: collision with root package name */
    static final TreeMap f26473y = new TreeMap();

    /* renamed from: q, reason: collision with root package name */
    private volatile String f26474q;

    /* renamed from: r, reason: collision with root package name */
    final long[] f26475r;

    /* renamed from: s, reason: collision with root package name */
    final double[] f26476s;

    /* renamed from: t, reason: collision with root package name */
    final String[] f26477t;

    /* renamed from: u, reason: collision with root package name */
    final byte[][] f26478u;

    /* renamed from: v, reason: collision with root package name */
    private final int[] f26479v;

    /* renamed from: w, reason: collision with root package name */
    final int f26480w;

    /* renamed from: x, reason: collision with root package name */
    int f26481x;

    private c(int i7) {
        this.f26480w = i7;
        int i8 = i7 + 1;
        this.f26479v = new int[i8];
        this.f26475r = new long[i8];
        this.f26476s = new double[i8];
        this.f26477t = new String[i8];
        this.f26478u = new byte[i8][];
    }

    public static c e(String str, int i7) {
        TreeMap treeMap = f26473y;
        synchronized (treeMap) {
            try {
                Map.Entry ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i7));
                if (ceilingEntry == null) {
                    c cVar = new c(i7);
                    cVar.g(str, i7);
                    return cVar;
                }
                treeMap.remove(ceilingEntry.getKey());
                c cVar2 = (c) ceilingEntry.getValue();
                cVar2.g(str, i7);
                return cVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void h() {
        TreeMap treeMap = f26473y;
        if (treeMap.size() <= 15) {
            return;
        }
        int size = treeMap.size() - 10;
        Iterator it = treeMap.descendingKeySet().iterator();
        while (true) {
            int i7 = size - 1;
            if (size <= 0) {
                return;
            }
            it.next();
            it.remove();
            size = i7;
        }
    }

    @Override // x0.d
    public void E(int i7, String str) {
        this.f26479v[i7] = 4;
        this.f26477t[i7] = str;
    }

    @Override // x0.d
    public void N(int i7, double d8) {
        this.f26479v[i7] = 3;
        this.f26476s[i7] = d8;
    }

    @Override // x0.d
    public void W(int i7, long j7) {
        this.f26479v[i7] = 2;
        this.f26475r[i7] = j7;
    }

    @Override // x0.d
    public void Z(int i7, byte[] bArr) {
        this.f26479v[i7] = 5;
        this.f26478u[i7] = bArr;
    }

    @Override // x0.e
    public void a(x0.d dVar) {
        for (int i7 = 1; i7 <= this.f26481x; i7++) {
            int i8 = this.f26479v[i7];
            if (i8 == 1) {
                dVar.p0(i7);
            } else if (i8 == 2) {
                dVar.W(i7, this.f26475r[i7]);
            } else if (i8 == 3) {
                dVar.N(i7, this.f26476s[i7]);
            } else if (i8 == 4) {
                dVar.E(i7, this.f26477t[i7]);
            } else if (i8 == 5) {
                dVar.Z(i7, this.f26478u[i7]);
            }
        }
    }

    @Override // x0.e
    public String c() {
        return this.f26474q;
    }

    void g(String str, int i7) {
        this.f26474q = str;
        this.f26481x = i7;
    }

    public void j() {
        TreeMap treeMap = f26473y;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f26480w), this);
            h();
        }
    }

    @Override // x0.d
    public void p0(int i7) {
        this.f26479v[i7] = 1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
