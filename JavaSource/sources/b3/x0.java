package b3;

import android.content.pm.PackageInfo;
import com.google.android.gms.internal.ads.n85;
import com.google.android.gms.internal.ads.ou0;
import com.google.android.gms.internal.ads.w85;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: MyApplication */
public final class x0 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f3393a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f3394b;

    /* renamed from: c, reason: collision with root package name */
    private final w85 f3395c;

    /* renamed from: d, reason: collision with root package name */
    private final w85 f3396d;

    /* renamed from: e, reason: collision with root package name */
    private final w85 f3397e;

    private x0(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4, w85 w85Var5) {
        this.f3393a = w85Var;
        this.f3394b = w85Var2;
        this.f3395c = w85Var3;
        this.f3396d = w85Var4;
        this.f3397e = w85Var5;
    }

    public static x0 a(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4, w85 w85Var5) {
        return new x0(w85Var, w85Var2, w85Var3, w85Var4, w85Var5);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new c0(((ou0) this.f3393a).a(), ((Long) this.f3394b.b()).longValue(), (PackageInfo) this.f3395c.b(), (y0) this.f3396d.b(), (ScheduledExecutorService) this.f3397e.b());
    }
}
