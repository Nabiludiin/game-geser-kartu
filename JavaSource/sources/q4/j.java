package q4;

import l3.a;

/* compiled from: MyApplication */
final class j extends l {

    /* renamed from: q, reason: collision with root package name */
    private final /* synthetic */ String f25654q;

    /* renamed from: r, reason: collision with root package name */
    private final /* synthetic */ long f25655r;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ String f25656s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(i iVar, l3.f fVar, String str, long j7, String str2) {
        super(fVar);
        this.f25654q = str;
        this.f25655r = j7;
        this.f25656s = str2;
    }

    @Override // com.google.android.gms.common.api.internal.a
    protected final /* synthetic */ void r(a.b bVar) {
        ((c4.s) bVar).w0(this, this.f25654q, this.f25655r, this.f25656s);
    }
}
