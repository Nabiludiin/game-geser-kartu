package v2;

import java.util.ArrayList;
import java.util.List;

/* compiled from: MyApplication */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    private final String[] f26765a;

    /* renamed from: b, reason: collision with root package name */
    private final double[] f26766b;

    /* renamed from: c, reason: collision with root package name */
    private final double[] f26767c;

    /* renamed from: d, reason: collision with root package name */
    private final int[] f26768d;

    /* renamed from: e, reason: collision with root package name */
    private int f26769e;

    /* synthetic */ h0(g0 g0Var, byte[] bArr) {
        int size = g0Var.d().size();
        this.f26765a = (String[]) g0Var.c().toArray(new String[size]);
        this.f26766b = c(g0Var.d());
        this.f26767c = c(g0Var.e());
        this.f26768d = new int[size];
        this.f26769e = 0;
    }

    private static final double[] c(List list) {
        int size = list.size();
        double[] dArr = new double[size];
        for (int i7 = 0; i7 < size; i7++) {
            dArr[i7] = ((Double) list.get(i7)).doubleValue();
        }
        return dArr;
    }

    public final void a(double d8) {
        this.f26769e++;
        int i7 = 0;
        while (true) {
            double[] dArr = this.f26767c;
            if (i7 >= dArr.length) {
                return;
            }
            double d9 = dArr[i7];
            if (d9 <= d8 && d8 < this.f26766b[i7]) {
                int[] iArr = this.f26768d;
                iArr[i7] = iArr[i7] + 1;
            }
            if (d8 < d9) {
                return;
            } else {
                i7++;
            }
        }
    }

    public final List b() {
        String[] strArr = this.f26765a;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (int i7 = 0; i7 < strArr.length; i7++) {
            String str = strArr[i7];
            double[] dArr = this.f26767c;
            double[] dArr2 = this.f26766b;
            int[] iArr = this.f26768d;
            double d8 = dArr[i7];
            double d9 = dArr2[i7];
            int i8 = iArr[i7];
            arrayList.add(new f0(str, d8, d9, i8 / this.f26769e, i8));
        }
        return arrayList;
    }
}
