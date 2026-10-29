package com.google.android.gms.internal.drive;

import java.util.Iterator;

final class a2 extends g2 {

    /* renamed from: r, reason: collision with root package name */
    private final /* synthetic */ x1 f20550r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private a2(x1 x1Var) {
        super(x1Var, null);
        this.f20550r = x1Var;
    }

    @Override // com.google.android.gms.internal.drive.g2, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new z1(this.f20550r, null);
    }

    /* synthetic */ a2(x1 x1Var, y1 y1Var) {
        this(x1Var);
    }
}
