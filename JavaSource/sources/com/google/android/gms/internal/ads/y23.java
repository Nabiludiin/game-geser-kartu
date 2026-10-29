package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* compiled from: MyApplication */
public final class y23 implements x23 {

    /* renamed from: a, reason: collision with root package name */
    private final Object[] f19344a;

    public y23(s2.b5 b5Var, String str, int i7, String str2, s2.m5 m5Var) {
        HashSet hashSet = new HashSet(Arrays.asList(str2.split(",")));
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        arrayList.add(str);
        if (hashSet.contains("networkType")) {
            arrayList.add(Integer.valueOf(i7));
        }
        if (hashSet.contains("birthday")) {
            arrayList.add(Long.valueOf(b5Var.f26057r));
        }
        if (hashSet.contains("extras")) {
            arrayList.add(a(b5Var.f26058s));
        } else if (hashSet.contains("npa")) {
            arrayList.add(b5Var.f26058s.getString("npa"));
        }
        if (hashSet.contains("gender")) {
            arrayList.add(Integer.valueOf(b5Var.f26059t));
        }
        if (hashSet.contains("keywords")) {
            List list = b5Var.f26060u;
            if (list != null) {
                arrayList.add(list.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("isTestDevice")) {
            arrayList.add(Boolean.valueOf(b5Var.f26061v));
        }
        if (hashSet.contains("tagForChildDirectedTreatment")) {
            arrayList.add(Integer.valueOf(b5Var.f26062w));
        }
        if (hashSet.contains("manualImpressionsEnabled")) {
            arrayList.add(Boolean.valueOf(b5Var.f26063x));
        }
        if (hashSet.contains("publisherProvidedId")) {
            arrayList.add(b5Var.f26064y);
        }
        if (hashSet.contains("location")) {
            Location location = b5Var.A;
            if (location != null) {
                arrayList.add(location.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("contentUrl")) {
            arrayList.add(b5Var.B);
        }
        if (hashSet.contains("networkExtras")) {
            arrayList.add(a(b5Var.C));
        }
        if (hashSet.contains("customTargeting")) {
            arrayList.add(a(b5Var.D));
        }
        if (hashSet.contains("categoryExclusions")) {
            List list2 = b5Var.E;
            if (list2 != null) {
                arrayList.add(list2.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("requestAgent")) {
            arrayList.add(b5Var.F);
        }
        if (hashSet.contains("requestPackage")) {
            arrayList.add(b5Var.G);
        }
        if (hashSet.contains("isDesignedForFamilies")) {
            arrayList.add(Boolean.valueOf(b5Var.H));
        }
        if (hashSet.contains("tagForUnderAgeOfConsent")) {
            arrayList.add(Integer.valueOf(b5Var.J));
        }
        if (hashSet.contains("maxAdContentRating")) {
            arrayList.add(b5Var.K);
        }
        if (hashSet.contains("orientation")) {
            if (m5Var != null) {
                arrayList.add(Integer.valueOf(m5Var.f26193q));
            } else {
                arrayList.add(null);
            }
        }
        this.f19344a = arrayList.toArray();
    }

    private static String a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        while (it.hasNext()) {
            Object obj = bundle.get((String) it.next());
            sb.append(obj == null ? "null" : obj instanceof Bundle ? a((Bundle) obj) : obj.toString());
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y23) {
            return Arrays.equals(this.f19344a, ((y23) obj).f19344a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f19344a);
    }

    public final String toString() {
        Object[] objArr = this.f19344a;
        int hashCode = Arrays.hashCode(objArr);
        String arrays = Arrays.toString(objArr);
        StringBuilder sb = new StringBuilder(String.valueOf(hashCode).length() + 10 + String.valueOf(arrays).length() + 1);
        sb.append("[PoolKey#");
        sb.append(hashCode);
        sb.append(" ");
        sb.append(arrays);
        sb.append("]");
        return sb.toString();
    }
}
