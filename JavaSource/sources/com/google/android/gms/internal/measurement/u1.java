package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.HashMap;
import w3.a;

/* compiled from: MyApplication */
public abstract class u1 extends q0 implements v1 {
    public u1() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static v1 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return queryLocalInterface instanceof v1 ? (v1) queryLocalInterface : new t1(iBinder);
    }

    @Override // com.google.android.gms.internal.measurement.q0
    protected final boolean a(int i7, Parcel parcel, Parcel parcel2, int i8) {
        y1 y1Var = null;
        b2 b2Var = null;
        y1 y1Var2 = null;
        y1 y1Var3 = null;
        y1 y1Var4 = null;
        y1 y1Var5 = null;
        e2 e2Var = null;
        e2 e2Var2 = null;
        e2 e2Var3 = null;
        y1 y1Var6 = null;
        y1 y1Var7 = null;
        y1 y1Var8 = null;
        y1 y1Var9 = null;
        y1 y1Var10 = null;
        y1 y1Var11 = null;
        g2 g2Var = null;
        y1 y1Var12 = null;
        y1 y1Var13 = null;
        y1 y1Var14 = null;
        y1 y1Var15 = null;
        y1 y1Var16 = null;
        switch (i7) {
            case 1:
                w3.a O = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                h2 h2Var = (h2) r0.b(parcel, h2.CREATOR);
                long readLong = parcel.readLong();
                r0.f(parcel);
                initialize(O, h2Var, readLong);
                break;
            case 2:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Bundle bundle = (Bundle) r0.b(parcel, Bundle.CREATOR);
                boolean a8 = r0.a(parcel);
                boolean a9 = r0.a(parcel);
                long readLong2 = parcel.readLong();
                r0.f(parcel);
                logEvent(readString, readString2, bundle, a8, a9, readLong2);
                break;
            case 3:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                Bundle bundle2 = (Bundle) r0.b(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    y1Var = queryLocalInterface instanceof y1 ? (y1) queryLocalInterface : new w1(readStrongBinder);
                }
                long readLong3 = parcel.readLong();
                r0.f(parcel);
                logEventAndBundle(readString3, readString4, bundle2, y1Var, readLong3);
                break;
            case 4:
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                w3.a O2 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                boolean a10 = r0.a(parcel);
                long readLong4 = parcel.readLong();
                r0.f(parcel);
                setUserProperty(readString5, readString6, O2, a10, readLong4);
                break;
            case 5:
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                boolean a11 = r0.a(parcel);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    y1Var16 = queryLocalInterface2 instanceof y1 ? (y1) queryLocalInterface2 : new w1(readStrongBinder2);
                }
                r0.f(parcel);
                getUserProperties(readString7, readString8, a11, y1Var16);
                break;
            case 6:
                String readString9 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    y1Var15 = queryLocalInterface3 instanceof y1 ? (y1) queryLocalInterface3 : new w1(readStrongBinder3);
                }
                r0.f(parcel);
                getMaxUserProperties(readString9, y1Var15);
                break;
            case 7:
                String readString10 = parcel.readString();
                long readLong5 = parcel.readLong();
                r0.f(parcel);
                setUserId(readString10, readLong5);
                break;
            case 8:
                Bundle bundle3 = (Bundle) r0.b(parcel, Bundle.CREATOR);
                long readLong6 = parcel.readLong();
                r0.f(parcel);
                setConditionalUserProperty(bundle3, readLong6);
                break;
            case 9:
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                Bundle bundle4 = (Bundle) r0.b(parcel, Bundle.CREATOR);
                r0.f(parcel);
                clearConditionalUserProperty(readString11, readString12, bundle4);
                break;
            case 10:
                String readString13 = parcel.readString();
                String readString14 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    y1Var14 = queryLocalInterface4 instanceof y1 ? (y1) queryLocalInterface4 : new w1(readStrongBinder4);
                }
                r0.f(parcel);
                getConditionalUserProperties(readString13, readString14, y1Var14);
                break;
            case 11:
                boolean a12 = r0.a(parcel);
                long readLong7 = parcel.readLong();
                r0.f(parcel);
                setMeasurementEnabled(a12, readLong7);
                break;
            case 12:
                long readLong8 = parcel.readLong();
                r0.f(parcel);
                resetAnalyticsData(readLong8);
                break;
            case 13:
                long readLong9 = parcel.readLong();
                r0.f(parcel);
                setMinimumSessionDuration(readLong9);
                break;
            case 14:
                long readLong10 = parcel.readLong();
                r0.f(parcel);
                setSessionTimeoutDuration(readLong10);
                break;
            case 15:
                w3.a O3 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                String readString15 = parcel.readString();
                String readString16 = parcel.readString();
                long readLong11 = parcel.readLong();
                r0.f(parcel);
                setCurrentScreen(O3, readString15, readString16, readLong11);
                break;
            case 16:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    y1Var13 = queryLocalInterface5 instanceof y1 ? (y1) queryLocalInterface5 : new w1(readStrongBinder5);
                }
                r0.f(parcel);
                getCurrentScreenName(y1Var13);
                break;
            case 17:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    y1Var12 = queryLocalInterface6 instanceof y1 ? (y1) queryLocalInterface6 : new w1(readStrongBinder6);
                }
                r0.f(parcel);
                getCurrentScreenClass(y1Var12);
                break;
            case 18:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    g2Var = queryLocalInterface7 instanceof g2 ? (g2) queryLocalInterface7 : new f2(readStrongBinder7);
                }
                r0.f(parcel);
                setInstanceIdProvider(g2Var);
                break;
            case 19:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    y1Var11 = queryLocalInterface8 instanceof y1 ? (y1) queryLocalInterface8 : new w1(readStrongBinder8);
                }
                r0.f(parcel);
                getCachedAppInstanceId(y1Var11);
                break;
            case 20:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    y1Var10 = queryLocalInterface9 instanceof y1 ? (y1) queryLocalInterface9 : new w1(readStrongBinder9);
                }
                r0.f(parcel);
                getAppInstanceId(y1Var10);
                break;
            case 21:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    y1Var9 = queryLocalInterface10 instanceof y1 ? (y1) queryLocalInterface10 : new w1(readStrongBinder10);
                }
                r0.f(parcel);
                getGmpAppId(y1Var9);
                break;
            case 22:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    y1Var8 = queryLocalInterface11 instanceof y1 ? (y1) queryLocalInterface11 : new w1(readStrongBinder11);
                }
                r0.f(parcel);
                generateEventId(y1Var8);
                break;
            case 23:
                String readString17 = parcel.readString();
                long readLong12 = parcel.readLong();
                r0.f(parcel);
                beginAdUnitExposure(readString17, readLong12);
                break;
            case 24:
                String readString18 = parcel.readString();
                long readLong13 = parcel.readLong();
                r0.f(parcel);
                endAdUnitExposure(readString18, readLong13);
                break;
            case 25:
                w3.a O4 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                long readLong14 = parcel.readLong();
                r0.f(parcel);
                onActivityStarted(O4, readLong14);
                break;
            case 26:
                w3.a O5 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                long readLong15 = parcel.readLong();
                r0.f(parcel);
                onActivityStopped(O5, readLong15);
                break;
            case 27:
                w3.a O6 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                Bundle bundle5 = (Bundle) r0.b(parcel, Bundle.CREATOR);
                long readLong16 = parcel.readLong();
                r0.f(parcel);
                onActivityCreated(O6, bundle5, readLong16);
                break;
            case 28:
                w3.a O7 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                long readLong17 = parcel.readLong();
                r0.f(parcel);
                onActivityDestroyed(O7, readLong17);
                break;
            case 29:
                w3.a O8 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                long readLong18 = parcel.readLong();
                r0.f(parcel);
                onActivityPaused(O8, readLong18);
                break;
            case 30:
                w3.a O9 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                long readLong19 = parcel.readLong();
                r0.f(parcel);
                onActivityResumed(O9, readLong19);
                break;
            case 31:
                w3.a O10 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    y1Var7 = queryLocalInterface12 instanceof y1 ? (y1) queryLocalInterface12 : new w1(readStrongBinder12);
                }
                long readLong20 = parcel.readLong();
                r0.f(parcel);
                onActivitySaveInstanceState(O10, y1Var7, readLong20);
                break;
            case 32:
                Bundle bundle6 = (Bundle) r0.b(parcel, Bundle.CREATOR);
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    y1Var6 = queryLocalInterface13 instanceof y1 ? (y1) queryLocalInterface13 : new w1(readStrongBinder13);
                }
                long readLong21 = parcel.readLong();
                r0.f(parcel);
                performAction(bundle6, y1Var6, readLong21);
                break;
            case 33:
                int readInt = parcel.readInt();
                String readString19 = parcel.readString();
                w3.a O11 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                w3.a O12 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                w3.a O13 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                r0.f(parcel);
                logHealthData(readInt, readString19, O11, O12, O13);
                break;
            case 34:
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    e2Var3 = queryLocalInterface14 instanceof e2 ? (e2) queryLocalInterface14 : new c2(readStrongBinder14);
                }
                r0.f(parcel);
                setEventInterceptor(e2Var3);
                break;
            case 35:
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    e2Var2 = queryLocalInterface15 instanceof e2 ? (e2) queryLocalInterface15 : new c2(readStrongBinder15);
                }
                r0.f(parcel);
                registerOnMeasurementEventListener(e2Var2);
                break;
            case androidx.constraintlayout.widget.h.f1530y1 /* 36 */:
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    e2Var = queryLocalInterface16 instanceof e2 ? (e2) queryLocalInterface16 : new c2(readStrongBinder16);
                }
                r0.f(parcel);
                unregisterOnMeasurementEventListener(e2Var);
                break;
            case 37:
                HashMap e8 = r0.e(parcel);
                r0.f(parcel);
                initForTests(e8);
                break;
            case androidx.constraintlayout.widget.h.f1478r5 /* 38 */:
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    y1Var5 = queryLocalInterface17 instanceof y1 ? (y1) queryLocalInterface17 : new w1(readStrongBinder17);
                }
                int readInt2 = parcel.readInt();
                r0.f(parcel);
                getTestFlag(y1Var5, readInt2);
                break;
            case androidx.constraintlayout.widget.h.f1486s5 /* 39 */:
                boolean a13 = r0.a(parcel);
                r0.f(parcel);
                setDataCollectionEnabled(a13);
                break;
            case androidx.constraintlayout.widget.h.f1494t5 /* 40 */:
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 != null) {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    y1Var4 = queryLocalInterface18 instanceof y1 ? (y1) queryLocalInterface18 : new w1(readStrongBinder18);
                }
                r0.f(parcel);
                isDataCollectionEnabled(y1Var4);
                break;
            case androidx.constraintlayout.widget.h.f1502u5 /* 41 */:
            case androidx.constraintlayout.widget.h.A5 /* 47 */:
            case androidx.constraintlayout.widget.h.C5 /* 49 */:
            default:
                return false;
            case androidx.constraintlayout.widget.h.f1510v5 /* 42 */:
                Bundle bundle7 = (Bundle) r0.b(parcel, Bundle.CREATOR);
                r0.f(parcel);
                setDefaultEventParameters(bundle7);
                break;
            case androidx.constraintlayout.widget.h.f1518w5 /* 43 */:
                long readLong22 = parcel.readLong();
                r0.f(parcel);
                clearMeasurementEnabled(readLong22);
                break;
            case androidx.constraintlayout.widget.h.f1526x5 /* 44 */:
                Bundle bundle8 = (Bundle) r0.b(parcel, Bundle.CREATOR);
                long readLong23 = parcel.readLong();
                r0.f(parcel);
                setConsent(bundle8, readLong23);
                break;
            case androidx.constraintlayout.widget.h.f1534y5 /* 45 */:
                Bundle bundle9 = (Bundle) r0.b(parcel, Bundle.CREATOR);
                long readLong24 = parcel.readLong();
                r0.f(parcel);
                setConsentThirdParty(bundle9, readLong24);
                break;
            case androidx.constraintlayout.widget.h.f1542z5 /* 46 */:
                IBinder readStrongBinder19 = parcel.readStrongBinder();
                if (readStrongBinder19 != null) {
                    IInterface queryLocalInterface19 = readStrongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    y1Var3 = queryLocalInterface19 instanceof y1 ? (y1) queryLocalInterface19 : new w1(readStrongBinder19);
                }
                r0.f(parcel);
                getSessionId(y1Var3);
                break;
            case androidx.constraintlayout.widget.h.B5 /* 48 */:
                Intent intent = (Intent) r0.b(parcel, Intent.CREATOR);
                r0.f(parcel);
                setSgtmDebugInfo(intent);
                break;
            case androidx.constraintlayout.widget.h.D5 /* 50 */:
                j2 j2Var = (j2) r0.b(parcel, j2.CREATOR);
                String readString20 = parcel.readString();
                String readString21 = parcel.readString();
                long readLong25 = parcel.readLong();
                r0.f(parcel);
                setCurrentScreenByScionActivityInfo(j2Var, readString20, readString21, readLong25);
                break;
            case androidx.constraintlayout.widget.h.E5 /* 51 */:
                j2 j2Var2 = (j2) r0.b(parcel, j2.CREATOR);
                long readLong26 = parcel.readLong();
                r0.f(parcel);
                onActivityStartedByScionActivityInfo(j2Var2, readLong26);
                break;
            case androidx.constraintlayout.widget.h.F5 /* 52 */:
                j2 j2Var3 = (j2) r0.b(parcel, j2.CREATOR);
                long readLong27 = parcel.readLong();
                r0.f(parcel);
                onActivityStoppedByScionActivityInfo(j2Var3, readLong27);
                break;
            case androidx.constraintlayout.widget.h.G5 /* 53 */:
                j2 j2Var4 = (j2) r0.b(parcel, j2.CREATOR);
                Bundle bundle10 = (Bundle) r0.b(parcel, Bundle.CREATOR);
                long readLong28 = parcel.readLong();
                r0.f(parcel);
                onActivityCreatedByScionActivityInfo(j2Var4, bundle10, readLong28);
                break;
            case 54:
                j2 j2Var5 = (j2) r0.b(parcel, j2.CREATOR);
                long readLong29 = parcel.readLong();
                r0.f(parcel);
                onActivityDestroyedByScionActivityInfo(j2Var5, readLong29);
                break;
            case 55:
                j2 j2Var6 = (j2) r0.b(parcel, j2.CREATOR);
                long readLong30 = parcel.readLong();
                r0.f(parcel);
                onActivityPausedByScionActivityInfo(j2Var6, readLong30);
                break;
            case 56:
                j2 j2Var7 = (j2) r0.b(parcel, j2.CREATOR);
                long readLong31 = parcel.readLong();
                r0.f(parcel);
                onActivityResumedByScionActivityInfo(j2Var7, readLong31);
                break;
            case 57:
                j2 j2Var8 = (j2) r0.b(parcel, j2.CREATOR);
                IBinder readStrongBinder20 = parcel.readStrongBinder();
                if (readStrongBinder20 != null) {
                    IInterface queryLocalInterface20 = readStrongBinder20.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    y1Var2 = queryLocalInterface20 instanceof y1 ? (y1) queryLocalInterface20 : new w1(readStrongBinder20);
                }
                long readLong32 = parcel.readLong();
                r0.f(parcel);
                onActivitySaveInstanceStateByScionActivityInfo(j2Var8, y1Var2, readLong32);
                break;
            case 58:
                IBinder readStrongBinder21 = parcel.readStrongBinder();
                if (readStrongBinder21 != null) {
                    IInterface queryLocalInterface21 = readStrongBinder21.queryLocalInterface("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
                    b2Var = queryLocalInterface21 instanceof b2 ? (b2) queryLocalInterface21 : new z1(readStrongBinder21);
                }
                r0.f(parcel);
                retrieveAndUploadBatches(b2Var);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
