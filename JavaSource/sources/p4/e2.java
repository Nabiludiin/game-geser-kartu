package p4;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

/* compiled from: MyApplication */
public abstract class e2 extends a2 implements Set {

    /* renamed from: r, reason: collision with root package name */
    private transient d2 f25346r;

    e2() {
    }

    static int i(int i7) {
        int max = Math.max(i7, 2);
        if (max >= 751619276) {
            if (max < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int highestOneBit = Integer.highestOneBit(max - 1);
        do {
            highestOneBit += highestOneBit;
        } while (highestOneBit * 0.7d < max);
        return highestOneBit;
    }

    public static e2 l() {
        return h2.f25384y;
    }

    public static e2 m(Object obj, Object obj2, Object obj3, Object obj4) {
        return p(4, "IABTCF_TCString", "IABGPP_HDR_GppString", "IABGPP_GppSID", "IABUSPrivacy_String");
    }

    public static e2 n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return p(5, "UMP_CoMoAdStoragePurposeConsentStatus", "UMP_CoMoAdUserDataPurposeConsentStatus", "UMP_CoMoAdPersonalizationPurposeConsentStatus", "UMP_CoMoAnalyticsStoragePurposeConsentStatus", "IABTCF_gdprApplies");
    }

    private static e2 p(int i7, Object... objArr) {
        if (i7 == 0) {
            return h2.f25384y;
        }
        if (i7 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new i2(obj);
        }
        int i8 = i(i7);
        Object[] objArr2 = new Object[i8];
        int i9 = i8 - 1;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < i7; i12++) {
            Object obj2 = objArr[i12];
            if (obj2 == null) {
                throw new NullPointerException("at index " + i12);
            }
            int hashCode = obj2.hashCode();
            int a8 = z1.a(hashCode);
            while (true) {
                int i13 = a8 & i9;
                Object obj3 = objArr2[i13];
                if (obj3 == null) {
                    objArr[i11] = obj2;
                    objArr2[i13] = obj2;
                    i10 += hashCode;
                    i11++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    a8++;
                }
            }
        }
        Arrays.fill(objArr, i11, i7, (Object) null);
        if (i11 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new i2(obj4);
        }
        if (i(i11) < i8 / 2) {
            return p(i11, objArr);
        }
        if (i11 < 3) {
            objArr = Arrays.copyOf(objArr, i11);
        }
        return new h2(objArr, i10, objArr2, i9, i11);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof e2) && o() && ((e2) obj).o() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    return containsAll(set);
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public abstract int hashCode();

    public final d2 j() {
        d2 d2Var = this.f25346r;
        if (d2Var != null) {
            return d2Var;
        }
        d2 k7 = k();
        this.f25346r = k7;
        return k7;
    }

    d2 k() {
        Object[] array = toArray();
        int i7 = d2.f25325s;
        return d2.j(array, array.length);
    }

    boolean o() {
        return false;
    }
}
