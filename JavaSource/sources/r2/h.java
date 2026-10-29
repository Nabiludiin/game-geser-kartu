package r2;

import com.google.android.gms.internal.ads.kd3;
import java.util.Objects;

/* compiled from: MyApplication */
final class h implements kd3 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ k f25796a;

    h(k kVar) {
        Objects.requireNonNull(kVar);
        this.f25796a = kVar;
    }

    @Override // com.google.android.gms.internal.ads.kd3
    public final void b(int i7, long j7) {
        this.f25796a.o().b(i7, System.currentTimeMillis() - j7);
    }

    @Override // com.google.android.gms.internal.ads.kd3
    public final void c(int i7, long j7, String str) {
        this.f25796a.o().f(i7, System.currentTimeMillis() - j7, str);
    }
}
