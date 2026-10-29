package t1;

import com.nabil.R;

public class g {

    private int f26364a;

    private int f26365b;

    private int f26366c;

    private int f26367d;

    private int f26368e;

    private int f26369f;

    private int[][] f26370g;

    private int f26371h;

    private int f26372i;

    private int f26373j;

    private int f26374k;

    private boolean f26375l;

    public g(int i7, int i8, int i9, int i10, int i11, int i12, int[][] iArr) {
        this.f26364a = i7;
        this.f26365b = i8;
        this.f26366c = i9;
        this.f26367d = i10;
        this.f26368e = i12;
        this.f26369f = i11;
        this.f26370g = iArr;
        this.f26371h = R.string.empty_string;
        this.f26372i = 0;
        this.f26373j = R.string.empty_string;
        this.f26374k = R.string.empty_string;
        this.f26375l = false;
    }

    public int a() {
        return this.f26365b;
    }

    public int b() {
        return this.f26374k;
    }

    public int c() {
        return this.f26372i;
    }

    public int d() {
        return this.f26373j;
    }

    public int e() {
        return this.f26371h;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof g)) {
            g gVar = (g) obj;
            if (this.f26364a == gVar.f26364a && this.f26366c == gVar.f26366c) {
                return true;
            }
        }
        return false;
    }

    public int f() {
        return this.f26367d;
    }

    public int g() {
        return this.f26369f;
    }

    public int[] h(int i7) {
        return this.f26370g[i7];
    }

    public int i() {
        return this.f26368e;
    }

    public int j() {
        return this.f26364a;
    }

    public int k() {
        return this.f26366c;
    }

    public boolean l() {
        return this.f26375l;
    }

    public void m(boolean z7) {
        this.f26375l = z7;
    }

    public g(int i7, int i8, int i9, int i10, int i11, int[][] iArr) {
        this.f26364a = i7;
        this.f26365b = i8;
        this.f26366c = i9;
        this.f26367d = i10;
        this.f26368e = R.string.empty_string;
        this.f26369f = R.string.empty_string;
        this.f26370g = iArr;
        this.f26371h = i11;
        this.f26372i = 0;
        this.f26373j = R.string.empty_string;
        this.f26374k = R.string.empty_string;
        this.f26375l = false;
    }

    public g(int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
        this.f26364a = i7;
        this.f26365b = i8;
        this.f26366c = i9;
        this.f26367d = i10;
        this.f26368e = R.string.empty_string;
        this.f26369f = R.string.empty_string;
        this.f26370g = new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}};
        this.f26371h = R.string.empty_string;
        this.f26372i = i11;
        this.f26373j = i12;
        this.f26374k = i13;
        this.f26375l = false;
    }
}
