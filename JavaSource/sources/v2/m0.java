package v2;

import com.google.android.gms.internal.ads.cf;
import com.google.android.gms.internal.ads.cg;
import com.google.android.gms.internal.ads.gf;
import com.google.android.gms.internal.ads.im0;
import com.google.android.gms.internal.ads.lf;
import java.util.Map;

/* compiled from: MyApplication */
public final class m0 extends gf {
    private final im0 C;
    private final w2.m D;

    public m0(String str, Map map, im0 im0Var) {
        super(0, str, new l0(im0Var));
        this.C = im0Var;
        w2.m mVar = new w2.m(null);
        this.D = mVar;
        mVar.b(str, "GET", null, null);
    }

    @Override // com.google.android.gms.internal.ads.gf
    protected final lf x(cf cfVar) {
        return lf.a(cfVar, cg.a(cfVar));
    }

    @Override // com.google.android.gms.internal.ads.gf
    protected final /* bridge */ /* synthetic */ void y(Object obj) {
        cf cfVar = (cf) obj;
        Map map = cfVar.f6405c;
        int i7 = cfVar.f6403a;
        w2.m mVar = this.D;
        mVar.d(map, i7);
        byte[] bArr = cfVar.f6404b;
        if (w2.m.j() && bArr != null) {
            mVar.f(bArr);
        }
        this.C.b(cfVar);
    }
}
