package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: MyApplication */
public final class b extends e implements d {
    b(IBinder iBinder) {
        super(iBinder, "com.android.vending.billing.IInAppBillingService");
    }

    @Override // com.google.android.gms.internal.play_billing.d
    public final Bundle C5(int i7, String str, String str2, String str3, String str4, Bundle bundle) {
        Parcel a8 = a();
        a8.writeInt(i7);
        a8.writeString(str);
        a8.writeString(str2);
        a8.writeString(str3);
        a8.writeString(null);
        g.c(a8, bundle);
        Parcel O = O(8, a8);
        Bundle bundle2 = (Bundle) g.a(O, Bundle.CREATOR);
        O.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.d
    public final Bundle K6(int i7, String str, String str2, String str3, Bundle bundle) {
        Parcel a8 = a();
        a8.writeInt(i7);
        a8.writeString(str);
        a8.writeString(str2);
        a8.writeString(str3);
        g.c(a8, bundle);
        Parcel O = O(11, a8);
        Bundle bundle2 = (Bundle) g.a(O, Bundle.CREATOR);
        O.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.d
    public final int M1(int i7, String str, String str2) {
        Parcel a8 = a();
        a8.writeInt(3);
        a8.writeString(str);
        a8.writeString(str2);
        Parcel O = O(5, a8);
        int readInt = O.readInt();
        O.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.play_billing.d
    public final Bundle P3(int i7, String str, String str2, String str3, String str4) {
        Parcel a8 = a();
        a8.writeInt(3);
        a8.writeString(str);
        a8.writeString(str2);
        a8.writeString(str3);
        a8.writeString(null);
        Parcel O = O(3, a8);
        Bundle bundle = (Bundle) g.a(O, Bundle.CREATOR);
        O.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.play_billing.d
    public final Bundle T7(int i7, String str, String str2, Bundle bundle) {
        Parcel a8 = a();
        a8.writeInt(9);
        a8.writeString(str);
        a8.writeString(str2);
        g.c(a8, bundle);
        Parcel O = O(902, a8);
        Bundle bundle2 = (Bundle) g.a(O, Bundle.CREATOR);
        O.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.d
    public final int U6(int i7, String str, String str2, Bundle bundle) {
        Parcel a8 = a();
        a8.writeInt(i7);
        a8.writeString(str);
        a8.writeString(str2);
        g.c(a8, bundle);
        Parcel O = O(10, a8);
        int readInt = O.readInt();
        O.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.play_billing.d
    public final int W7(int i7, String str, String str2) {
        Parcel a8 = a();
        a8.writeInt(i7);
        a8.writeString(str);
        a8.writeString(str2);
        Parcel O = O(1, a8);
        int readInt = O.readInt();
        O.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.play_billing.d
    public final Bundle Z1(int i7, String str, String str2, Bundle bundle) {
        Parcel a8 = a();
        a8.writeInt(9);
        a8.writeString(str);
        a8.writeString(str2);
        g.c(a8, bundle);
        Parcel O = O(12, a8);
        Bundle bundle2 = (Bundle) g.a(O, Bundle.CREATOR);
        O.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.d
    public final Bundle e7(int i7, String str, String str2, Bundle bundle, Bundle bundle2) {
        Parcel a8 = a();
        a8.writeInt(i7);
        a8.writeString(str);
        a8.writeString(str2);
        g.c(a8, bundle);
        g.c(a8, bundle2);
        Parcel O = O(901, a8);
        Bundle bundle3 = (Bundle) g.a(O, Bundle.CREATOR);
        O.recycle();
        return bundle3;
    }

    @Override // com.google.android.gms.internal.play_billing.d
    public final Bundle t4(int i7, String str, String str2, String str3) {
        Parcel a8 = a();
        a8.writeInt(3);
        a8.writeString(str);
        a8.writeString(str2);
        a8.writeString(str3);
        Parcel O = O(4, a8);
        Bundle bundle = (Bundle) g.a(O, Bundle.CREATOR);
        O.recycle();
        return bundle;
    }
}
