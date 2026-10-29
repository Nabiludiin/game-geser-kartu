package v;

import java.util.ArrayList;
import java.util.Arrays;
import w.o;

/* compiled from: MyApplication */
public abstract class i extends e implements h {
    public e[] L0 = new e[4];
    public int M0 = 0;

    @Override // v.h
    public void a() {
        this.M0 = 0;
        Arrays.fill(this.L0, (Object) null);
    }

    @Override // v.h
    public void b(e eVar) {
        if (eVar == this || eVar == null) {
            return;
        }
        int i7 = this.M0 + 1;
        e[] eVarArr = this.L0;
        if (i7 > eVarArr.length) {
            this.L0 = (e[]) Arrays.copyOf(eVarArr, eVarArr.length * 2);
        }
        e[] eVarArr2 = this.L0;
        int i8 = this.M0;
        eVarArr2[i8] = eVar;
        this.M0 = i8 + 1;
    }

    public void n1(ArrayList arrayList, int i7, o oVar) {
        for (int i8 = 0; i8 < this.M0; i8++) {
            oVar.a(this.L0[i8]);
        }
        for (int i9 = 0; i9 < this.M0; i9++) {
            w.i.a(this.L0[i9], i7, arrayList, oVar);
        }
    }

    public int o1(int i7) {
        int i8;
        int i9;
        for (int i10 = 0; i10 < this.M0; i10++) {
            e eVar = this.L0[i10];
            if (i7 == 0 && (i9 = eVar.I0) != -1) {
                return i9;
            }
            if (i7 == 1 && (i8 = eVar.J0) != -1) {
                return i8;
            }
        }
        return -1;
    }

    @Override // v.h
    public void c(f fVar) {
    }
}
