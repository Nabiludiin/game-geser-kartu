package com.google.firebase.installations;

import w4.j;

/* compiled from: MyApplication */
class d implements e {

    /* renamed from: a, reason: collision with root package name */
    final j f23036a;

    public d(j jVar) {
        this.f23036a = jVar;
    }

    @Override // com.google.firebase.installations.e
    public boolean a(Exception exc) {
        return false;
    }

    @Override // com.google.firebase.installations.e
    public boolean b(q5.d dVar) {
        if (!dVar.l() && !dVar.k() && !dVar.i()) {
            return false;
        }
        this.f23036a.e(dVar.d());
        return true;
    }
}
