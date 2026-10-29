package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: MyApplication */
public final class t1 extends p0 implements v1 {
    t1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public final void beginAdUnitExposure(String str, long j7) {
        Parcel O = O();
        O.writeString(str);
        O.writeLong(j7);
        r0(23, O);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel O = O();
        O.writeString(str);
        O.writeString(str2);
        r0.c(O, bundle);
        r0(9, O);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public final void endAdUnitExposure(String str, long j7) {
        Parcel O = O();
        O.writeString(str);
        O.writeLong(j7);
        r0(24, O);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public final void generateEventId(y1 y1Var) {
        Parcel O = O();
        r0.d(O, y1Var);
        r0(22, O);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public final void getCachedAppInstanceId(y1 y1Var) {
        Parcel O = O();
        r0.d(O, y1Var);
        r0(19, O);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public final void getConditionalUserProperties(String str, String str2, y1 y1Var) {
        Parcel O = O();
        O.writeString(str);
        O.writeString(str2);
        r0.d(O, y1Var);
        r0(10, O);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public final void getCurrentScreenClass(y1 y1Var) {
        Parcel O = O();
        r0.d(O, y1Var);
        r0(17, O);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public final void getCurrentScreenName(y1 y1Var) {
        Parcel O = O();
        r0.d(O, y1Var);
        r0(16, O);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public final void getGmpAppId(y1 y1Var) {
        Parcel O = O();
        r0.d(O, y1Var);
        r0(21, O);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public final void getMaxUserProperties(String str, y1 y1Var) {
        Parcel O = O();
        O.writeString(str);
        r0.d(O, y1Var);
        r0(6, O);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public final void getUserProperties(String str, String str2, boolean z7, y1 y1Var) {
        Parcel O = O();
        O.writeString(str);
        O.writeString(str2);
        int i7 = r0.f21323b;
        O.writeInt(z7 ? 1 : 0);
        r0.d(O, y1Var);
        r0(5, O);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public final void initialize(w3.a aVar, h2 h2Var, long j7) {
        Parcel O = O();
        r0.d(O, aVar);
        r0.c(O, h2Var);
        O.writeLong(j7);
        r0(1, O);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public final void logEvent(String str, String str2, Bundle bundle, boolean z7, boolean z8, long j7) {
        Parcel O = O();
        O.writeString(str);
        O.writeString(str2);
        r0.c(O, bundle);
        O.writeInt(z7 ? 1 : 0);
        O.writeInt(z8 ? 1 : 0);
        O.writeLong(j7);
        r0(2, O);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public final void logHealthData(int i7, String str, w3.a aVar, w3.a aVar2, w3.a aVar3) {
        Parcel O = O();
        O.writeInt(5);
        O.writeString(str);
        r0.d(O, aVar);
        r0.d(O, aVar2);
        r0.d(O, aVar3);
        r0(33, O);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public final void onActivityCreatedByScionActivityInfo(j2 j2Var, Bundle bundle, long j7) {
        Parcel O = O();
        r0.c(O, j2Var);
        r0.c(O, bundle);
        O.writeLong(j7);
        r0(53, O);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public final void onActivityDestroyedByScionActivityInfo(j2 j2Var, long j7) {
        Parcel O = O();
        r0.c(O, j2Var);
        O.writeLong(j7);
        r0(54, O);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public final void onActivityPausedByScionActivityInfo(j2 j2Var, long j7) {
        Parcel O = O();
        r0.c(O, j2Var);
        O.writeLong(j7);
        r0(55, O);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public final void onActivityResumedByScionActivityInfo(j2 j2Var, long j7) {
        Parcel O = O();
        r0.c(O, j2Var);
        O.writeLong(j7);
        r0(56, O);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public final void onActivitySaveInstanceStateByScionActivityInfo(j2 j2Var, y1 y1Var, long j7) {
        Parcel O = O();
        r0.c(O, j2Var);
        r0.d(O, y1Var);
        O.writeLong(j7);
        r0(57, O);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public final void onActivityStartedByScionActivityInfo(j2 j2Var, long j7) {
        Parcel O = O();
        r0.c(O, j2Var);
        O.writeLong(j7);
        r0(51, O);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public final void onActivityStoppedByScionActivityInfo(j2 j2Var, long j7) {
        Parcel O = O();
        r0.c(O, j2Var);
        O.writeLong(j7);
        r0(52, O);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public final void retrieveAndUploadBatches(b2 b2Var) {
        Parcel O = O();
        r0.d(O, b2Var);
        r0(58, O);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public final void setConditionalUserProperty(Bundle bundle, long j7) {
        Parcel O = O();
        r0.c(O, bundle);
        O.writeLong(j7);
        r0(8, O);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public final void setCurrentScreenByScionActivityInfo(j2 j2Var, String str, String str2, long j7) {
        Parcel O = O();
        r0.c(O, j2Var);
        O.writeString(str);
        O.writeString(str2);
        O.writeLong(j7);
        r0(50, O);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public final void setDataCollectionEnabled(boolean z7) {
        Parcel O = O();
        int i7 = r0.f21323b;
        O.writeInt(z7 ? 1 : 0);
        r0(39, O);
    }
}
