package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Map;
import java.util.Objects;

/* compiled from: MyApplication */
public final class zs5 extends a50 {

    /* renamed from: a0, reason: collision with root package name */
    public static final zs5 f20336a0 = new zs5(new ys5());
    public final boolean J;
    public final boolean K;
    public final boolean L;
    public final boolean M;
    public final boolean N;
    public final boolean O;
    public final boolean P;
    public final boolean Q;
    public final boolean R;
    public final boolean S;
    public final boolean T;
    public final boolean U;
    public final boolean V;
    public final boolean W;
    public final boolean X;
    private final SparseArray Y;
    private final SparseBooleanArray Z;

    static {
        String str = hi2.f9535a;
        Integer.toString(1000, 36);
        Integer.toString(1001, 36);
        Integer.toString(1002, 36);
        Integer.toString(1003, 36);
        Integer.toString(1004, 36);
        Integer.toString(1005, 36);
        Integer.toString(1006, 36);
        Integer.toString(1007, 36);
        Integer.toString(1008, 36);
        Integer.toString(1009, 36);
        Integer.toString(1010, 36);
        Integer.toString(1011, 36);
        Integer.toString(1012, 36);
        Integer.toString(1013, 36);
        Integer.toString(1014, 36);
        Integer.toString(1015, 36);
        Integer.toString(1016, 36);
        Integer.toString(1017, 36);
        Integer.toString(1018, 36);
    }

    /* synthetic */ zs5(ys5 ys5Var, byte[] bArr) {
        this(ys5Var);
    }

    public final boolean a(int i7) {
        return this.Z.get(i7);
    }

    public final boolean b(int i7, as5 as5Var) {
        Map map = (Map) this.Y.get(i7);
        return map != null && map.containsKey(as5Var);
    }

    public final at5 c(int i7, as5 as5Var) {
        Map map = (Map) this.Y.get(i7);
        if (map != null) {
            android.support.v4.media.session.b.a(map.get(as5Var));
        }
        return null;
    }

    public final ys5 d() {
        return new ys5(this, null);
    }

    final /* synthetic */ SparseArray e() {
        return this.Y;
    }

    @Override // com.google.android.gms.internal.ads.a50
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zs5.class == obj.getClass()) {
            zs5 zs5Var = (zs5) obj;
            if (super.equals(zs5Var) && this.J == zs5Var.J && this.L == zs5Var.L && this.N == zs5Var.N && this.S == zs5Var.S && this.T == zs5Var.T && this.U == zs5Var.U && this.W == zs5Var.W) {
                SparseBooleanArray sparseBooleanArray = this.Z;
                SparseBooleanArray sparseBooleanArray2 = zs5Var.Z;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    int i7 = 0;
                    while (true) {
                        if (i7 >= size) {
                            SparseArray sparseArray = this.Y;
                            SparseArray sparseArray2 = zs5Var.Y;
                            int size2 = sparseArray.size();
                            if (sparseArray2.size() == size2) {
                                for (int i8 = 0; i8 < size2; i8++) {
                                    int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i8));
                                    if (indexOfKey >= 0) {
                                        Map map = (Map) sparseArray.valueAt(i8);
                                        Map map2 = (Map) sparseArray2.valueAt(indexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                as5 as5Var = (as5) entry.getKey();
                                                if (map2.containsKey(as5Var) && Objects.equals(entry.getValue(), map2.get(as5Var))) {
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        } else {
                            if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i7)) < 0) {
                                break;
                            }
                            i7++;
                        }
                    }
                }
            }
        }
        return false;
    }

    final /* synthetic */ SparseBooleanArray f() {
        return this.Z;
    }

    @Override // com.google.android.gms.internal.ads.a50
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.J ? 1 : 0)) * 961) + (this.L ? 1 : 0)) * 961) + (this.N ? 1 : 0)) * 28629151) + (this.S ? 1 : 0)) * 31) + (this.T ? 1 : 0)) * 31) + (this.U ? 1 : 0)) * 961) + (this.W ? 1 : 0)) * 31;
    }

    private zs5(ys5 ys5Var) {
        super(ys5Var);
        this.J = ys5Var.I();
        this.K = false;
        this.L = ys5Var.y();
        this.M = false;
        this.N = ys5Var.z();
        this.O = false;
        this.P = false;
        this.Q = false;
        this.R = false;
        this.S = ys5Var.A();
        this.T = ys5Var.B();
        this.U = ys5Var.C();
        this.V = false;
        this.W = ys5Var.D();
        this.X = false;
        this.Y = ys5Var.E();
        this.Z = ys5Var.F();
    }
}
