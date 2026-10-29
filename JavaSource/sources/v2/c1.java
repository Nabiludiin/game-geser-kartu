package v2;

import android.content.Context;
import java.io.IOException;

/* compiled from: MyApplication */
final class c1 extends b0 {

    /* renamed from: c, reason: collision with root package name */
    private final Context f26731c;

    c1(Context context) {
        this.f26731c = context;
    }

    @Override // v2.b0
    public final void a() {
        boolean z7;
        try {
            z7 = o2.a.b(this.f26731c);
        } catch (IOException | IllegalStateException | k3.i e8) {
            int i7 = n1.f26802b;
            w2.p.d("Fail to get isAdIdFakeForDebugLogging", e8);
            z7 = false;
        }
        w2.m.h(z7);
        StringBuilder sb = new StringBuilder(String.valueOf(z7).length() + 38);
        sb.append("Update ad debug logging enablement as ");
        sb.append(z7);
        String sb2 = sb.toString();
        int i8 = n1.f26802b;
        w2.p.f(sb2);
    }
}
