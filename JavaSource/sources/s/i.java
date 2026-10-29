package s;

import java.util.Arrays;
import java.util.HashSet;

/* compiled from: MyApplication */
public class i implements Comparable {
    private static int H = 1;

    /* renamed from: q, reason: collision with root package name */
    public boolean f25963q;

    /* renamed from: r, reason: collision with root package name */
    private String f25964r;

    /* renamed from: v, reason: collision with root package name */
    public float f25968v;

    /* renamed from: z, reason: collision with root package name */
    a f25972z;

    /* renamed from: s, reason: collision with root package name */
    public int f25965s = -1;

    /* renamed from: t, reason: collision with root package name */
    int f25966t = -1;

    /* renamed from: u, reason: collision with root package name */
    public int f25967u = 0;

    /* renamed from: w, reason: collision with root package name */
    public boolean f25969w = false;

    /* renamed from: x, reason: collision with root package name */
    float[] f25970x = new float[9];

    /* renamed from: y, reason: collision with root package name */
    float[] f25971y = new float[9];
    b[] A = new b[16];
    int B = 0;
    public int C = 0;
    boolean D = false;
    int E = -1;
    float F = 0.0f;
    HashSet G = null;

    /* compiled from: MyApplication */
    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public i(a aVar, String str) {
        this.f25972z = aVar;
    }

    static void j() {
        H++;
    }

    public final void c(b bVar) {
        int i7 = 0;
        while (true) {
            int i8 = this.B;
            if (i7 >= i8) {
                b[] bVarArr = this.A;
                if (i8 >= bVarArr.length) {
                    this.A = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.A;
                int i9 = this.B;
                bVarArr2[i9] = bVar;
                this.B = i9 + 1;
                return;
            }
            if (this.A[i7] == bVar) {
                return;
            } else {
                i7++;
            }
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public int compareTo(i iVar) {
        return this.f25965s - iVar.f25965s;
    }

    public final void k(b bVar) {
        int i7 = this.B;
        int i8 = 0;
        while (i8 < i7) {
            if (this.A[i8] == bVar) {
                while (i8 < i7 - 1) {
                    b[] bVarArr = this.A;
                    int i9 = i8 + 1;
                    bVarArr[i8] = bVarArr[i9];
                    i8 = i9;
                }
                this.B--;
                return;
            }
            i8++;
        }
    }

    public void l() {
        this.f25964r = null;
        this.f25972z = a.UNKNOWN;
        this.f25967u = 0;
        this.f25965s = -1;
        this.f25966t = -1;
        this.f25968v = 0.0f;
        this.f25969w = false;
        this.D = false;
        this.E = -1;
        this.F = 0.0f;
        int i7 = this.B;
        for (int i8 = 0; i8 < i7; i8++) {
            this.A[i8] = null;
        }
        this.B = 0;
        this.C = 0;
        this.f25963q = false;
        Arrays.fill(this.f25971y, 0.0f);
    }

    public void m(d dVar, float f8) {
        this.f25968v = f8;
        this.f25969w = true;
        this.D = false;
        this.E = -1;
        this.F = 0.0f;
        int i7 = this.B;
        this.f25966t = -1;
        for (int i8 = 0; i8 < i7; i8++) {
            this.A[i8].A(dVar, this, false);
        }
        this.B = 0;
    }

    public void n(a aVar, String str) {
        this.f25972z = aVar;
    }

    public final void o(d dVar, b bVar) {
        int i7 = this.B;
        for (int i8 = 0; i8 < i7; i8++) {
            this.A[i8].B(dVar, bVar, false);
        }
        this.B = 0;
    }

    public String toString() {
        if (this.f25964r != null) {
            return "" + this.f25964r;
        }
        return "" + this.f25965s;
    }
}
