package m3;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Map;
import l3.g;

/* compiled from: MyApplication */
final class s implements g.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BasePendingResult f24847a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ u f24848b;

    s(u uVar, BasePendingResult basePendingResult) {
        this.f24848b = uVar;
        this.f24847a = basePendingResult;
    }

    @Override // l3.g.a
    public final void a(Status status) {
        Map map;
        map = this.f24848b.f24865a;
        map.remove(this.f24847a);
    }
}
