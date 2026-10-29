package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: MyApplication */
public final class z85 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final List f20070a;

    /* renamed from: b, reason: collision with root package name */
    private final List f20071b;

    static {
        o85.a(Collections.EMPTY_SET);
    }

    /* synthetic */ z85(List list, List list2, x85 x85Var) {
        this.f20070a = list;
        this.f20071b = list2;
    }

    public static y85 a(int i7, int i8) {
        return new y85(i7, i8, null);
    }

    @Override // com.google.android.gms.internal.ads.b95
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Set b() {
        List list = this.f20070a;
        int size = list.size();
        List list2 = this.f20071b;
        ArrayList arrayList = new ArrayList(list2.size());
        int size2 = list2.size();
        for (int i7 = 0; i7 < size2; i7++) {
            Collection collection = (Collection) ((w85) list2.get(i7)).b();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet b8 = k85.b(size);
        int size3 = list.size();
        for (int i8 = 0; i8 < size3; i8++) {
            Object b9 = ((w85) list.get(i8)).b();
            b9.getClass();
            b8.add(b9);
        }
        int size4 = arrayList.size();
        for (int i9 = 0; i9 < size4; i9++) {
            for (Object obj : (Collection) arrayList.get(i9)) {
                obj.getClass();
                b8.add(obj);
            }
        }
        return Collections.unmodifiableSet(b8);
    }
}
