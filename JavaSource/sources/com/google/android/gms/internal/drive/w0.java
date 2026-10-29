package com.google.android.gms.internal.drive;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class w0 extends u0 {

    /* renamed from: c, reason: collision with root package name */
    private static final Class f20767c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    private w0() {
        super();
    }

    private static List e(Object obj, long j7) {
        return (List) r2.G(obj, j7);
    }

    @Override // com.google.android.gms.internal.drive.u0
    final void a(Object obj, long j7) {
        Object unmodifiableList;
        List list = (List) r2.G(obj, j7);
        if (list instanceof t0) {
            unmodifiableList = ((t0) list).A0();
        } else if (f20767c.isAssignableFrom(list.getClass())) {
            return;
        } else {
            unmodifiableList = Collections.unmodifiableList(list);
        }
        r2.g(obj, j7, unmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.drive.u0
    final void b(Object obj, Object obj2, long j7) {
        s0 s0Var;
        List e8 = e(obj2, j7);
        int size = e8.size();
        List e9 = e(obj, j7);
        if (e9.isEmpty()) {
            e9 = e9 instanceof t0 ? new s0(size) : new ArrayList(size);
            r2.g(obj, j7, e9);
        } else {
            if (f20767c.isAssignableFrom(e9.getClass())) {
                ArrayList arrayList = new ArrayList(e9.size() + size);
                arrayList.addAll(e9);
                r2.g(obj, j7, arrayList);
                s0Var = arrayList;
            } else if (e9 instanceof o2) {
                s0 s0Var2 = new s0(e9.size() + size);
                s0Var2.addAll((o2) e9);
                r2.g(obj, j7, s0Var2);
                s0Var = s0Var2;
            }
            e9 = s0Var;
        }
        int size2 = e9.size();
        int size3 = e8.size();
        if (size2 > 0 && size3 > 0) {
            e9.addAll(e8);
        }
        if (size2 > 0) {
            e8 = e9;
        }
        r2.g(obj, j7, e8);
    }
}
