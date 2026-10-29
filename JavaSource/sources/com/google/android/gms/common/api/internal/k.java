package com.google.android.gms.common.api.internal;

import java.util.ArrayList;
import l3.a;

/* compiled from: MyApplication */
final class k extends o {

    /* renamed from: r, reason: collision with root package name */
    private final ArrayList f4467r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ p f4468s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(p pVar, ArrayList arrayList) {
        super(pVar, null);
        this.f4468s = pVar;
        this.f4467r = arrayList;
    }

    @Override // com.google.android.gms.common.api.internal.o
    public final void a() {
        x xVar;
        p3.j jVar;
        x xVar2;
        p pVar = this.f4468s;
        xVar = pVar.f4474a;
        xVar.D.f4513p = p.x(pVar);
        ArrayList arrayList = this.f4467r;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            a.f fVar = (a.f) arrayList.get(i7);
            p pVar2 = this.f4468s;
            jVar = pVar2.f4488o;
            xVar2 = pVar2.f4474a;
            fVar.k(jVar, xVar2.D.f4513p);
        }
    }
}
