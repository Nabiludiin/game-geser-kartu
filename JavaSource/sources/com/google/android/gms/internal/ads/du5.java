package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.List;

/* compiled from: MyApplication */
public abstract class du5 extends gu5 {
    @Override // com.google.android.gms.internal.ads.gu5
    public final void f(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.gu5
    public final hu5 g(sc5[] sc5VarArr, as5 as5Var, xp5 xp5Var, az azVar) {
        List[] listArr;
        boolean z7;
        int[] iArr;
        int[] iArr2 = new int[3];
        b00[][] b00VarArr = new b00[3][];
        int[][][] iArr3 = new int[3][][];
        for (int i7 = 0; i7 < 3; i7++) {
            int i8 = as5Var.f5278a;
            b00VarArr[i7] = new b00[i8];
            iArr3[i7] = new int[i8][];
        }
        int i9 = 2;
        int[] iArr4 = new int[2];
        for (int i10 = 0; i10 < 2; i10++) {
            iArr4[i10] = sc5VarArr[i10].t();
        }
        int i11 = 0;
        while (i11 < as5Var.f5278a) {
            b00 a8 = as5Var.a(i11);
            int i12 = a8.f5436c;
            int i13 = i9;
            int i14 = 0;
            int i15 = 0;
            boolean z8 = true;
            while (i14 < i9) {
                sc5 sc5Var = sc5VarArr[i14];
                int i16 = 0;
                for (int i17 = 0; i17 < a8.f5434a; i17++) {
                    i16 = Math.max(i16, sc5Var.H(a8.a(i17)) & 7);
                }
                boolean z9 = iArr2[i14] == 0;
                if (i16 > i15) {
                    z8 = z9;
                    i13 = i14;
                    i15 = i16;
                } else if (i16 == i15 && i12 == 5 && !z8 && z9) {
                    i13 = i14;
                    i15 = i16;
                    z8 = true;
                }
                i14++;
                i9 = 2;
            }
            if (i13 == i9) {
                iArr = new int[a8.f5434a];
            } else {
                sc5 sc5Var2 = sc5VarArr[i13];
                int i18 = a8.f5434a;
                int[] iArr5 = new int[i18];
                for (int i19 = 0; i19 < i18; i19++) {
                    iArr5[i19] = sc5Var2.H(a8.a(i19));
                }
                iArr = iArr5;
            }
            int i20 = iArr2[i13];
            b00VarArr[i13][i20] = a8;
            iArr3[i13][i20] = iArr;
            iArr2[i13] = i20 + 1;
            i11++;
            i9 = 2;
        }
        as5[] as5VarArr = new as5[i9];
        String[] strArr = new String[i9];
        int[] iArr6 = new int[i9];
        int i21 = 0;
        while (i21 < i9) {
            int i22 = iArr2[i21];
            as5VarArr[i21] = new as5((b00[]) hi2.y(b00VarArr[i21], i22));
            iArr3[i21] = (int[][]) hi2.y(iArr3[i21], i22);
            strArr[i21] = sc5VarArr[i21].P();
            iArr6[i21] = sc5VarArr[i21].a();
            i21++;
            i9 = 2;
        }
        int i23 = i9;
        cu5 cu5Var = new cu5(strArr, iArr6, as5VarArr, iArr4, iArr3, new as5((b00[]) hi2.y(b00VarArr[i23], iArr2[i23])));
        Pair k7 = k(cu5Var, iArr3, iArr4, xp5Var, azVar);
        eu5[] eu5VarArr = (eu5[]) k7.second;
        List[] listArr2 = new List[eu5VarArr.length];
        for (int i24 = 0; i24 < eu5VarArr.length; i24++) {
            eu5 eu5Var = eu5VarArr[i24];
            listArr2[i24] = eu5Var != null ? w04.n(eu5Var) : w04.m();
        }
        t04 t04Var = new t04();
        for (int i25 = 0; i25 < 2; i25++) {
            as5 b8 = cu5Var.b(i25);
            List list = listArr2[i25];
            int i26 = 0;
            while (i26 < b8.f5278a) {
                b00 a9 = b8.a(i26);
                boolean z10 = cu5Var.d(i25, i26, false) != 0;
                int i27 = a9.f5434a;
                int[] iArr7 = new int[i27];
                boolean[] zArr = new boolean[i27];
                int i28 = 0;
                while (i28 < i27) {
                    iArr7[i28] = cu5Var.c(i25, i26, i28) & 7;
                    int i29 = 0;
                    while (true) {
                        if (i29 >= list.size()) {
                            listArr = listArr2;
                            z7 = false;
                            break;
                        }
                        eu5 eu5Var2 = (eu5) list.get(i29);
                        listArr = listArr2;
                        if (eu5Var2.a().equals(a9) && eu5Var2.b0(i28) != -1) {
                            z7 = true;
                            break;
                        }
                        i29++;
                        listArr2 = listArr;
                    }
                    zArr[i28] = z7;
                    i28++;
                    listArr2 = listArr;
                }
                t04Var.g(new b60(a9, z10, iArr7, zArr));
                i26++;
                listArr2 = listArr2;
            }
        }
        as5 e8 = cu5Var.e();
        for (int i30 = 0; i30 < e8.f5278a; i30++) {
            b00 a10 = e8.a(i30);
            int i31 = a10.f5434a;
            int[] iArr8 = new int[i31];
            Arrays.fill(iArr8, 0);
            t04Var.g(new b60(a10, false, iArr8, new boolean[i31]));
        }
        return new hu5((tc5[]) k7.first, (zt5[]) k7.second, new d70(t04Var.j()), cu5Var);
    }

    protected abstract Pair k(cu5 cu5Var, int[][][] iArr, int[] iArr2, xp5 xp5Var, az azVar);
}
