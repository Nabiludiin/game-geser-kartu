package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: MyApplication */
final class zh implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        int length;
        ai aiVar = (ai) obj;
        ai aiVar2 = (ai) obj2;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            length = aiVar.f4976a.length;
            if (i7 >= length || i8 >= aiVar2.f4976a.length) {
                break;
            }
            int compare = Integer.compare(ai.g(aiVar.b(i7)), ai.g(aiVar2.b(i8)));
            if (compare != 0) {
                return compare;
            }
            i7++;
            i8++;
        }
        return Integer.compare(length, aiVar2.f4976a.length);
    }
}
