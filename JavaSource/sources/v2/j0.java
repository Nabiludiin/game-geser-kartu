package v2;

import com.google.android.gms.internal.ads.ig;
import com.google.android.gms.internal.ads.jf;
import com.google.android.gms.internal.ads.kf;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* compiled from: MyApplication */
final class j0 extends ig {
    final /* synthetic */ byte[] E;
    final /* synthetic */ Map F;
    final /* synthetic */ w2.m G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j0(n0 n0Var, int i7, String str, kf kfVar, jf jfVar, byte[] bArr, Map map, w2.m mVar) {
        super(i7, str, kfVar, jfVar);
        this.E = bArr;
        this.F = map;
        this.G = mVar;
        Objects.requireNonNull(n0Var);
    }

    @Override // com.google.android.gms.internal.ads.ig
    protected final void F(String str) {
        this.G.e(str);
        super.F(str);
    }

    @Override // com.google.android.gms.internal.ads.gf
    public final Map s() {
        Map map = this.F;
        return map == null ? Collections.EMPTY_MAP : map;
    }

    @Override // com.google.android.gms.internal.ads.gf
    public final byte[] t() {
        byte[] bArr = this.E;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.ads.gf
    protected final /* bridge */ /* synthetic */ void y(Object obj) {
        F((String) obj);
    }
}
