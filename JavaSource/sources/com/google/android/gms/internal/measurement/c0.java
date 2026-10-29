package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Comparator;

/* compiled from: MyApplication */
final class c0 implements Comparator {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ k f20849q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ o4 f20850r;

    c0(k kVar, o4 o4Var) {
        this.f20849q = kVar;
        this.f20850r = o4Var;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        r rVar = (r) obj;
        r rVar2 = (r) obj2;
        if (rVar instanceof w) {
            return !(rVar2 instanceof w) ? 1 : 0;
        }
        if (rVar2 instanceof w) {
            return -1;
        }
        k kVar = this.f20849q;
        return kVar == null ? rVar.d().compareTo(rVar2.d()) : (int) p5.i(kVar.a(this.f20850r, Arrays.asList(rVar, rVar2)).h().doubleValue());
    }
}
