package com.google.android.gms.common.api.internal;

import android.content.Context;
import java.util.ArrayList;
import java.util.Map;
import l3.a;
import p3.c;
import p3.h0;

/* compiled from: MyApplication */
final class j extends o {

    /* renamed from: r, reason: collision with root package name */
    private final Map f4465r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ p f4466s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(p pVar, Map map) {
        super(pVar, null);
        this.f4466s = pVar;
        this.f4465r = map;
    }

    @Override // com.google.android.gms.common.api.internal.o
    public final void a() {
        k3.h hVar;
        Context context;
        boolean z7;
        Context context2;
        x xVar;
        u4.e eVar;
        u4.e eVar2;
        x xVar2;
        Context context3;
        boolean z8;
        hVar = this.f4466s.f4477d;
        h0 h0Var = new h0(hVar);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (a.f fVar : this.f4465r.keySet()) {
            if (fVar.m()) {
                z8 = ((g) this.f4465r.get(fVar)).f4461c;
                if (!z8) {
                    arrayList.add(fVar);
                }
            }
            arrayList2.add(fVar);
        }
        int i7 = 0;
        int i8 = -1;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            while (i7 < size) {
                a.f fVar2 = (a.f) arrayList.get(i7);
                context = this.f4466s.f4476c;
                i8 = h0Var.b(context, fVar2);
                i7++;
                if (i8 != 0) {
                    break;
                }
            }
        } else {
            int size2 = arrayList2.size();
            while (i7 < size2) {
                a.f fVar3 = (a.f) arrayList2.get(i7);
                context3 = this.f4466s.f4476c;
                i8 = h0Var.b(context3, fVar3);
                i7++;
                if (i8 == 0) {
                    break;
                }
            }
        }
        if (i8 != 0) {
            k3.b bVar = new k3.b(i8, null);
            p pVar = this.f4466s;
            xVar2 = pVar.f4474a;
            xVar2.k(new h(this, pVar, bVar));
            return;
        }
        p pVar2 = this.f4466s;
        z7 = pVar2.f4486m;
        if (z7) {
            eVar = pVar2.f4484k;
            if (eVar != null) {
                eVar2 = pVar2.f4484k;
                eVar2.u();
            }
        }
        for (a.f fVar4 : this.f4465r.keySet()) {
            c.InterfaceC0119c interfaceC0119c = (c.InterfaceC0119c) this.f4465r.get(fVar4);
            if (fVar4.m()) {
                context2 = this.f4466s.f4476c;
                if (h0Var.b(context2, fVar4) != 0) {
                    p pVar3 = this.f4466s;
                    xVar = pVar3.f4474a;
                    xVar.k(new i(this, pVar3, interfaceC0119c));
                }
            }
            fVar4.e(interfaceC0119c);
        }
    }
}
