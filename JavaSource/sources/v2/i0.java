package v2;

import com.google.android.gms.internal.ads.jf;
import com.google.android.gms.internal.ads.of;
import java.util.Objects;

/* compiled from: MyApplication */
final class i0 implements jf {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f26773a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ k0 f26774b;

    i0(n0 n0Var, String str, k0 k0Var) {
        this.f26773a = str;
        this.f26774b = k0Var;
        Objects.requireNonNull(n0Var);
    }

    @Override // com.google.android.gms.internal.ads.jf
    public final void a(of ofVar) {
        String str = this.f26773a;
        String obj = ofVar.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(obj).length());
        sb.append("Failed to load URL: ");
        sb.append(str);
        sb.append("\n");
        sb.append(obj);
        String sb2 = sb.toString();
        int i7 = n1.f26802b;
        w2.p.f(sb2);
        this.f26774b.d(null);
    }
}
