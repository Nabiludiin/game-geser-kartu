package com.google.android.gms.internal.drive;

public abstract class d implements j1 {
    protected abstract d i(c cVar);

    @Override // com.google.android.gms.internal.drive.j1
    public final /* synthetic */ j1 u(i1 i1Var) {
        if (d().getClass().isInstance(i1Var)) {
            return i((c) i1Var);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
